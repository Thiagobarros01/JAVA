package ex246;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			Set<Usuarios> set = new HashSet<>();

			String line = bf.readLine();
			while (line != null) {

				String[] fields = line.split(" ");
				String username = fields[0];
				Instant moment = Instant.parse(fields[1]);

				set.add(new Usuarios(username, moment));
				line = bf.readLine();
			}

			System.out.println("Total user: " + set.size());

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
