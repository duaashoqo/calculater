package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import d.add;

public class Additiontest {
	 static add a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 a = new add();
		
	}
	@AfterClass
public static void tearDownAfterClass() throws Exception {
		
	}
public void test3() {
		
		int b =-1;
		assertEquals(b, a.addtion(-2,1));

		
	}
	@Test
	public void test4() {
		
		int b =1;
		assertEquals(b, a.addtion(2,-1));

		
	}
	@Test
	public void test5() {
		
		int b =-2;
		assertEquals(b, a.addtion(-2,0));

		
	}
public void test6() {
		
		int b =2;
		assertEquals(b, a.addtion(2,0));

		
	}


	
	

	@Test
	public void testAddtion() {
		int b =-5;
		assertEquals(b, a.addtion(-2,-3));
	}
public void test2() {
		
		int b =6;
		assertEquals(b, a.addtion(2,4));

		
	}

}
