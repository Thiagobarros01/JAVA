package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import util.PriceUpdate;;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hh Case", 80.90));

		
		//list.forEach(new PriceUpdate());
		
		list.forEach(Product::nostaticPriceUpdate);
		
		
		list.forEach(System.out::println);
		
	}

}
