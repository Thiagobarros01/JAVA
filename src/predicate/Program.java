package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("MOUSE", 50.00));
		list.add(new Product("TABLET", 350.50));
		list.add(new Product("HD CASE", 80.90));
		
		//Predicate<Product> pred = p -> p.getPrice() >= 100;
		
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		
	}

}
