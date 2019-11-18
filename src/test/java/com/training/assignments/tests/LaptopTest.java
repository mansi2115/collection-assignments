package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Laptop;

public class LaptopTest {
	HashSet<Laptop> laptopSet;
	Laptop laptop1,laptop2,laptop3;
	/*
	 * creates objects 
	 */
	@Before
	public void setUp() {
		laptopSet = new HashSet<>();
		laptop1 =new Laptop("Lenovo","L480","Windows","core i5");
		laptop2=new Laptop("Dell","D567","Linux","core i7");
		laptop3=new Laptop("Lenovo","L480","ioS","core i8");
	
		laptopSet.add(laptop1);
		laptopSet.add(laptop2);
		laptopSet.add(laptop3);
		
	}
	/*
	 * checks the data of hash set
	 */
	@Test
	public void testReadOperationOfCollection() {
	
		assertEquals("[Laptop [company=Lenovo, model=L480, operatingSystem=Windows, processor=core i5], Laptop [company=Dell, model=D567, operatingSystem=Linux, processor=core i7]]"
, laptopSet.toString());
	}
	
	/*
	 * checks output when duplicate data added to set
	 */
	@Test
	public void testSetCollectionForDuplicateData() {
		
		assertEquals(2,laptopSet.size());
	}
	/*
	 * checks output for equality of laptop company and model
	 *  when two objects have same data
	 */
	@Test
	public void testEqualityOfLaptopCompanyAndModelWithSameData() {
		assertEquals(true,laptop1.equals(laptop3));
	}
	/*
	 * checks output for equality of laptop company and model
	 *  when two objects have different data
	 */
	@Test
	public void testEqualityOfLaptopCompanyAndModelWithDifferentData() {
		assertEquals(false,laptop1.equals(laptop2));
	}
}
