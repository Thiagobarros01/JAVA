package a258;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hh Case", 80.90));

		// list.forEach(new PriceUpdate());
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T'); 
		System.out.println(sum);
		list.forEach(System.out::println);
		
		Stream<? super Product> st1 = list.stream().map(x -> x.getPrice() <= 200);
		
		
		
		
		

	}

}
