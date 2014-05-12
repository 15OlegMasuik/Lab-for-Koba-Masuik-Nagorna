package lab;

public class Cola extends Beverage {
	public Cola() {
		carbohydrates = "2";
		proteins = "2";
		calories = "3";
		fats = "4";
	}
	

	public String getName() {
		return "Cola";
	}
	

	public String getNameUA() {
		return "Кола";
	}
}
