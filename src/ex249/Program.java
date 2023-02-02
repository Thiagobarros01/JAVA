package ex249;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// C:\Users\\danil\\OneDrive\\Documentos\\value.txt

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file: ");
		String path = sc.nextLine();
		Map<String, Integer> map = new LinkedHashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer number = Integer.parseInt(fields[1]);

				if (map.containsKey(name)) {
					int cont = map.get(name);
					map.put(name, number + cont);

				} else {
					map.put(name, number);
				}

				line = br.readLine();
			}

		}

		catch (IOException e) {
			e.getMessage();
		}

		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}

		sc.close();

	}

}
