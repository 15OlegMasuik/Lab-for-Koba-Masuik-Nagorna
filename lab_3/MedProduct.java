package lab;

public class MedProduct implements MedicineInterface, ProductInterface {
	private ProductInterface product;
	private MedicineInterface medicine;
	private String name;
	
	public MedProduct(ProductInterface product, MedicineInterface medicine) {
		this.product = product;
		this.medicine = medicine;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getCalories() {
		return this.product.getCalories();
	}


	public void setCalories(String calories) {
		this.product.setCalories(calories);
	}


	public String getProteins() {
		return this.product.getProteins();
	}

	
	public void setProteins(String proteins) {
		this.product.setProteins(proteins);
	}


	public String getFats() {
		return this.product.getFats();
	}

	
	public void setFats(String fats) {
		this.product.setFats(fats);
	}

	
	public String getCarbohydrates() {
		return this.product.getCarbohydrates();
	}

	
	public void setCarbohydrates(String carbohydrates) {
		this.product.setCarbohydrates(carbohydrates);
	}


	public String getCaloriesTitle() {
		return this.product.getCaloriesTitle();
	}

	
	public String getCarbohydratesTitle() {
		return this.product.getCarbohydrates();
	}

	
	public String getProteinsTitle() {
		return this.product.getProteinsTitle();
	}

	
	public String getFatsTitle() {
		return this.product.getFatsTitle();
	}

	
	public String getQuantity() {
		return this.product.getQuantity();
	}

	
	public void setQuantity(int quantity) {
		this.product.setQuantity(quantity);
	}

	
	public String getDaysLeft() {
		return this.product.getDaysLeft();
	}

	
	public String getDateOfManufacture() {
		return this.medicine.getDateOfManufacture();
	}

	
	public void setDateOfManufacture(String dateOfManufacture) {
		this.medicine.setDateOfManufacture(dateOfManufacture);
	}


	public String getSurrogates() {
		return this.medicine.getSurrogates();
	}

	
	public void setSurrogates(String surrogates) {
		this.medicine.setSurrogates(surrogates);
	}
}
