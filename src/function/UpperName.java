package function;

import java.util.function.Function;

public class UpperName implements Function<Product,String> {

	@Override
	public String apply(Product p) {
		// TODO Auto-generated method stub
		return p.getName().toUpperCase();
	}

}
