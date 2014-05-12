package lab;

public class Milk extends MilkProduct {
	public Milk() {
		carbohydrates = "2";
		proteins = "2";
		calories = "3";
		fats = "4";
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
	
	
	public String getName() {
		return "Milk";
	}
	
	public String getNameUA() {
		return "Молоко";
	}
}
