package com.training.assignments;

public class Student implements Comparable<Student>{

	private String name;
	private String favouriteFruit;

	/**
	 * default constructor
	 */
	public Student() {
		super();
	}

	/**
	 * @param name
	 * @param favouriteFruit
	 * 
	 * parameterized constructor
	 */
	public Student(String name, String favouriteFruit) {
		super();
		this.name = name;
		this.favouriteFruit = favouriteFruit;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the favouriteFruit
	 */
	public String getFavouriteFruit() {
		return favouriteFruit;
	}

	/**
	 * @param favouriteFruit the favouriteFruit to set
	 */
	public void setFavouriteFruit(String favouriteFruit) {
		this.favouriteFruit = favouriteFruit;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", favouriteFruit=" + favouriteFruit + "]";
	}

	@Override
	public int compareTo(Student student) {
	
		return this.name.compareTo(student.name);
	}
}
