package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Car;

public class CarTest {

	HashSet<Car> carSet;
	Car car1,car2,car3;
	/*
	 * creates objects 
	 */
	@Before
	public void setUp() {
		carSet= new HashSet<>();
		car1=new Car("Toyota", "Fortuner", "2019", 2700500);
		car2= new Car("Suzuki","Wagnar","2019",700000);
		car3= new Car("Toyota", "Fortuner", "2018", 2700600);
		
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
	}
	/*
	 * checks the data of hash set
	 */
	@Test
	public void testReadOperationOfCollection() {
		System.out.println(carSet);
		assertEquals("[Car [make=Toyota, model=Fortuner, year=2019, price=2700500.0], Car [make=Suzuki, model=Wagnar, year=2019, price=700000.0]]", carSet.toString());
	}
	
	/*
	 * checks output when duplicate data added to set
	 */
	@Test
	public void testSetCollectionForDuplicateData() {
		
		assertEquals(2,carSet.size());
	}
	/*
	 * checks output for equality of car make and model
	 *  when two objects have same data
	 */
	@Test
	public void testEqualityOfCarMakeAndModelWithSameData() {
		assertEquals(true,car1.equals(car3));
	}
	/*
	 * checks output for equality of car make and model
	 *  when two objects have different data
	 */
	@Test
	public void testEqualityOfCarMakeAndModelWithDifferentData() {
		assertEquals(false,car1.equals(car2));
	}
}
