package gameManagerProject.entities;

import gameManagerProject.abstracts.Entity;

public class Sale implements Entity{

	private int id;
	private double salePrice;
	
	public Sale()
	{
		
	}

	public Sale(int id, double salePrice) {
		super();
		this.id = id;
		this.salePrice = salePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	
}
