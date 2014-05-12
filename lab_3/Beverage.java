package lab;

import java.util.ArrayList;

public class Beverage extends Product {
	
	public static ArrayList<String> getProductsUA() {
		ArrayList<String> resultArray = new ArrayList<String>();
		resultArray.add("Мінералка");
		resultArray.add("Сік");
		resultArray.add("Кола");
		return resultArray;
	}
	
	public static ArrayList<String> getProducts() {
		ArrayList<String> resultArray = new ArrayList<String>();
		resultArray.add("Mineral");
		resultArray.add("Juice");
		resultArray.add("Cola");
		return resultArray;
	}
	

	public String getCaloriesTitle() {
		return "Calories/100ml:";
	}
	

	public String getCarbohydratesTitle() {
		return "Carbohydrates/100ml:";
	}
	
	
	public String getProteinsTitle() {
		return "Proteins/100ml:";
	}
	
	
	public String getFatsTitle() {
		return "Fats/100ml:";
	}
}