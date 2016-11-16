package com.neo.tdd.vo;

public class CartVO {
	private String nameProduct;
	private int quantity;
	private String unitPrice;
	/**
	 * @return the nameProduct
	 */
	public String getNameProduct() {
		return nameProduct;
	}
	/**
	 * @param nameProduct the nameProduct to set
	 */
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the unitPrice
	 */
	public String getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
