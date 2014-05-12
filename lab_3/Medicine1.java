package lab;

public class Medicine1 implements MedicineInterface {
	private String name;
	private String dateOfManufacture;
	private String surrogates;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	
	public String getSurrogates() {
		return surrogates;
	}
	
	public void setSurrogates(String surrogates) {
		this.surrogates = surrogates;
	}
}
