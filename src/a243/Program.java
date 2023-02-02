package a243;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// HashSet --> mais rapido, nao ordenado
		// TreeSet --> ordenado alfabeticamente
		// LinkedHashSet --> ordem que sao adicionados
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		// set.remove("Notebook");

		set.removeIf(x -> x.length() <= 3);

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

	}

}
