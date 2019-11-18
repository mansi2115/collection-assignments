package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.School;

public class SchoolTest {
	
	HashSet<School> schoolSet;
	School school1,school2,school3;
	/*
	 * creates objects 
	 */
	@Before
	public void setUp() {
		schoolSet= new HashSet<>();
		school1=new School("AVM", "Thane", "Thane", 3);
		school2= new School("Sharada Ashram","Dadar","Mumbai",5);
		school3= new School("AVM", "Thane", "Thane", 3);
		
		schoolSet.add(school1);
		schoolSet.add(school2);
		schoolSet.add(school3);
	}
	/*
	 * checks the data of hash set
	 */
	@Test
	public void testReadOperationOfCollection() {
		System.out.println(schoolSet);
		assertEquals("[School [name=Sharada Ashram, city=Dadar, schoolDistrict=Mumbai, greatSchoolRanking=5], School [name=AVM, city=Thane, schoolDistrict=Thane, greatSchoolRanking=3]]" 
				, schoolSet.toString());
	}
	
	/*
	 * checks output when duplicate data added to set
	 */
	@Test
	public void testSetCollectionForDuplicateData() {
		
		assertEquals(2,schoolSet.size());
	}
	/*
	 * checks output for equality of school name,city and district
	 *  when two objects have same data
	 */
	@Test
	public void testEqualityOfSchoolNameAndityAndDistrictWithSameData() {
		assertEquals(true,school1.equals(school3));
	}
	/*
	 * checks output for equality of school name,city and district
	 *  when two objects have different data
	 */
	@Test
	public void testEqualityOfSchoolNameAndityAndDistrictWithDifferentData() {
		assertEquals(false,school1.equals(school2));
	}

}
