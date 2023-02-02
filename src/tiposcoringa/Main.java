package tiposcoringa;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////////
		/*
		 * List<Object> obj = new ArrayList<>();
		 * 
		 * List<Integer> number = new ArrayList<>();
		 * 
		 * Object ob; Integer x = 10;
		 * 
		 * ob = x;
		 */
		/////////////////////////////////////////////////////////////////////////

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> str = Arrays.asList("Maria", "Joao", "Butuca");
		printList(str);
	}

	public static void printList(List<?> list) {

		for (Object x : list) {
			System.out.println(x);
		}

	}

}
