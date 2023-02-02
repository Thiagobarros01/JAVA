package ex261;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter full file path:");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			List<Product> list = new ArrayList<>();
			while (line != null) {

				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();

			}

			double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();

			System.out.println("Average price: " + String.format("%.2f", avg));

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> names = list.stream().filter(n -> n.getPrice() < avg).map(n -> n.getName())
					.sorted(comp.reversed()).collect(Collectors.toList());
			
			names.forEach(System.out::println);

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}
}