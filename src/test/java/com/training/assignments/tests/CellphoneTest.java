package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Cellphone;

public class CellphoneTest {

		HashSet<Cellphone> cellphoneSet;
		Cellphone cellphone1,cellphone2,cellphone3;
		/*
		 * creates objects 
		 */
		@Before
		public void setUp() {
			cellphoneSet= new HashSet<>();
			cellphone1=new Cellphone("Motrola", "MotoG", "2nd version", "Kitkat",10000);
			cellphone2= new Cellphone("MI","NotrPro","latest version","Android",15000);
			cellphone3= new Cellphone("Motrola", "MotoG", "has Gorilla Glass", "Kitkat",11000);
			
			cellphoneSet.add(cellphone1);
			cellphoneSet.add(cellphone2);
			cellphoneSet.add(cellphone3);
		}
		/*
		 * checks the data of hash set
		 */
		@Test
		public void testReadOperationOfCollection() {
			System.out.println(cellphoneSet);
			assertEquals("[Cellphone [company=Motrola, model=MotoG, description=2nd version, operatingSystem=Kitkat, price=10000.0], Cellphone [company=MI, model=NotrPro, description=latest version, operatingSystem=Android, price=15000.0]]" 
					, cellphoneSet.toString());
		}
		
		/*
		 * checks output when duplicate data added to set
		 */
		@Test
		public void testSetCollectionForDuplicateData() {
			
			assertEquals(2,cellphoneSet.size());
		}
		/*
		 * checks output for equality of cellphone company and model and operating system
		 *  when two objects have same data
		 */
		@Test
		public void testEqualityOfCellphoneCompanyAndModelAndOSWithSameData() {
			assertEquals(true,cellphone1.equals(cellphone3));
		}
		/*
		 * checks output for equality of cellphone company and model and operating system
		 *  when two objects have different data
		 */
		@Test
		public void testEqualityOfCellphoneCompanyAndModelAndOSWithDifferentData() {
			assertEquals(false,cellphone1.equals(cellphone2));
		}
	}


