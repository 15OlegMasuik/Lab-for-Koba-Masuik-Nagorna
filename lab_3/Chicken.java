package lab;

public class Chicken extends MeatProduct {
	public Chicken() {
		carbohydrates = "2";
		proteins = "2";
		calories = "3";
		fats = "4";
	}
	

	public String getName() {
		return "Chicken";
	}
	
	public String getNameUA() {
		return "Курятина";
	}
}
