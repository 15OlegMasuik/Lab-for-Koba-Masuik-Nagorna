package lab;

import java.util.ArrayList;

public class Eggs extends Product {

	public static ArrayList getProducts() {
		ArrayList<String> resultArray = new ArrayList<String>();
		resultArray.add("ChickenEggs");
		return resultArray;
	}
	
	public static ArrayList getProductsUA() {
		ArrayList<String> resultArray = new ArrayList<String>();
		resultArray.add("ßéöÿ êóğÿ÷³");
		return resultArray;
	}
}
