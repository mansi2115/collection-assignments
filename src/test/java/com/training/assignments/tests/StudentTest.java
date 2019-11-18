package com.training.assignments.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Student;

public class StudentTest {

	Set<Student> studentSet;
	Student student1,student2,student3;
	/*
	 * creates objects 
	 */
	@Before
	public void setUp() {
		student1=new Student("Mansi","Apple");
		student2= new Student("John","Orange");
		student3= new Student("Sanskriti","Strawberry");
	}
	
	@Test
	public void testInsertionOrderForSet() {
		
		studentSet= new HashSet<>();
		
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		String[] names = {"Mansi","John","Sanskriti"};
		String[] setElements=new String[3];
		int index=0;
		for(Student name:studentSet) {
			setElements[index] = name.getName();
			index++;
		}
		assertNotEquals(names, setElements);
		 
	}
	
	
	
	@Test
	public void testInsertionOrderForList() {
		ArrayList<Student> students= new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		String[] names = {"Mansi","John","Sanskriti"};
		int index=0;
		for(Student name:students) {
		
			assertEquals(names[index],name.getName());
			index++;
		}
		
		
	
	}
	
	@Test
	public void testSortingrderForTreeSet() {
		studentSet= new TreeSet<Student>();
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		String[] sortedNames = {"John","Mansi","Sanskriti"};
		int index=0;
		for(Student name:studentSet) {
		
			assertEquals(sortedNames[index],name.getName());
			index++;
		}
	}
	@Test
	public void testMapImplementation() {
		Map<String,String> studentMap= new HashMap<>();
		studentMap.put(student1.getName(),student1.getFavouriteFruit());
		studentMap.put(student2.getName(),student2.getFavouriteFruit());
		studentMap.put(student3.getName(),student3.getFavouriteFruit());
		
		assertEquals("Apple",studentMap.get("Mansi"));
	}
}
