package lab;

public class Beef extends MeatProduct {
	public Beef() {
		carbohydrates = "2";
		proteins = "2";
		calories = "3";
		fats = "4";
	}
	
	
	public String getName() {
		return "Beef";
	}
	
	
	public String getNameUA() {
		return "яловичина";
	}
}
