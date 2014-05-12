package lab;

public class Veal extends MeatProduct{
	public Veal() {
		carbohydrates = "2";
		proteins = "2";
		calories = "3";
		fats = "4";
	}
	

	public String getName() {
		return "Veal";
	}
	

	public String getNameUA() {
		return "Телятина";
	}
}
