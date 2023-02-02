package a248;

import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
			//chave, valor 	
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		for (Product p : stock.keySet()) {
			System.out.println("key: "+ stock.get(p));
		}
		
		Product ps = new Product("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		Product px = new Product("Notebook",1200000.0);
		if(stock.containsKey(px) != true){
			System.out.println(stock.containsKey(px));
			stock.put(px,2000.0);
			
		}
		System.out.println(stock.get(px));
	}

}
