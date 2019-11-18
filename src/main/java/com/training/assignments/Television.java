package com.training.assignments;

import java.util.Objects;

public class Television {

	private String company;
	private String type;
	private boolean threeD_enabled;
	private double price;
	/**
	 * default constructor
	 */
	public Television() {
		super();
	}
	/**
	 * @param company
	 * @param type
	 * @param threeD_enabled
	 * @param price
	 * parameterized constructor
	 */
	public Television(String company, String type, boolean threeD_enabled, double price) {
		super();
		this.company = company;
		this.type = type;
		this.threeD_enabled = threeD_enabled;
		this.price = price;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the threeD_enabled
	 */
	public boolean getThreeD_enabled() {
		return threeD_enabled;
	}
	/**
	 * @param threeD_enabled the threeD_enabled to set
	 */
	public void setThreeD_enabled(boolean threeD_enabled) {
		this.threeD_enabled = threeD_enabled;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company,type,price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", threeD_enabled=" + threeD_enabled + ", price="
				+ price + "]";
	}
	
	
	
	
}
