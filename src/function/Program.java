package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hh Case", 80.90));

		
		//list.forEach(new PriceUpdate());
		
		List<String> names = list.stream().map(new UpperName()).collect(Collectors.toList());
			
		
		names.forEach(System.out::println);
		
	}

}
