package lab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Product1 implements ProductInterface {
	private String calories;
	private String proteins;
	private String fats;
	private String carbohydrates;
	//private String name;
	private String expirationDate;
	private int quantity;
	
	public String getCalories() {
		return calories;
	}
	
	public void setCalories(String calories) {
		this.calories = calories; 
	}
	
	public String getProteins() {
		return proteins;
	}
	
	public void setProteins(String proteins) {
		this.proteins = proteins; 
	}
	
	public String getFats() {
		return fats;
	}
	
	public void setFats(String fats) {
		this.fats = fats; 
	}
	
	public String getCarbohydrates() {
		return carbohydrates;
	}
	
	public void setCarbohydrates(String carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	public String getCaloriesTitle() {
		return "Calories/100g:";
	}
	
	public String getCarbohydratesTitle() {
		return "Carbohydrates/100g:";
	}
	
	public String getProteinsTitle() {
		return "Proteins/100g:";
	}
	
	public String getFatsTitle() {
		return "Fats/100g:";
	}
	
	public String getQuantity() {
		return Integer.toString(quantity);
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getDaysLeft() {
		Date endDate;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	    try {
	    	endDate = df.parse(expirationDate);
	    }
	    catch (Exception e) {
			e.printStackTrace();
			return "0";
		}
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(cal1.getTime());
		cal2.setTime(endDate);
        Calendar date = (Calendar) cal1.clone();
        long daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return Long.toString(daysBetween) + " days left";
	}
}