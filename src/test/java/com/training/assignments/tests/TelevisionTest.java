package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Television;

public class TelevisionTest {

	HashSet<Television> televisionSet;
	Television television1,television2,television3;
	/*
	 * creates objects 
	 */
	@Before
	public void setUp() {
		televisionSet= new HashSet<>();
		television1=new Television("LG","LCD",true,	12000);
		television2= new Television("Sony","LED",false,10000);
		television3= new Television("LG","LCD",true,12000);
		
		televisionSet.add(television1);
		televisionSet.add(television2);
		televisionSet.add(television3);
	}
	/*
	 * checks the data of hash set
	 */
	@Test
	public void testReadOperationOfCollection() {
		System.out.println(televisionSet);
		assertEquals("[Television [company=LG, type=LCD, threeD_enabled=true, price=12000.0], Television [company=Sony, type=LED, threeD_enabled=false, price=10000.0]]" 
				, televisionSet.toString());
	}
	
	/*
	 * checks output when duplicate data added to set
	 */
	@Test
	public void testSetCollectionForDuplicateData() {
		
		assertEquals(2,televisionSet.size());
	}
	/*
	 * checks output for equality of television company,type and price
	 *  when two objects have same data
	 */
	@Test
	public void testEqualityOfTelevisionCompanyAndTypeAndPriceWithSameData() {
		assertEquals(true,television1.equals(television3));
	}
	/*
	 * checks output for equality of television company,type and price
	 *  when two objects have different data
	 */
	@Test
	public void testEqualityOfTelevisionCompanyAndTypeAndPriceWithDifferentData() {
		assertEquals(false,television1.equals(television2));
	}

}
