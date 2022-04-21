package za.co.smartcall;

import java.util.ArrayList;


public record Network(int id,String description,ArrayList<ProductType> productTypes) {

	public Network{
		if (id < 0) throw new IllegalArgumentException("Network id cannot be negative");
		description = description.toLowerCase();
	}

}
