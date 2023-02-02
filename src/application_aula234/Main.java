package application_aula234;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Funcionarios> list = new ArrayList<>();

		String path = "C:\\Users\\danil\\OneDrive\\Imagens\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String funcionarios = br.readLine();

			while (funcionarios != null) {
				String[] fields = funcionarios.split(",");
				list.add(new Funcionarios(fields[0], Double.parseDouble(fields[1])));
				funcionarios = br.readLine();
			}
			Collections.sort(list);
			for (Funcionarios f : list) {

				System.out.println(f.getName() + ", " + String.format("$%.2f", f.getSalary()));
			}

		}

		catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}

	}
}
