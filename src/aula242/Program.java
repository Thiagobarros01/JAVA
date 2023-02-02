package aula242;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("bob", "pedro@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
//	
			System.out.println(c1.equals(c2));
		
	
	}
}
