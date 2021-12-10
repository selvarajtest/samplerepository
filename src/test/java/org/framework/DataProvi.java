package org.framework;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvi {

	
//	@DataProvider(name="dtList")
//	public Object[][] getDataList() {
//		return new Object[][] {
//			{"Ram","pass@123"},
//			{"shai","shai@123"}
//		};
//	}
	@Test
	public void tc22() {	
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void tc21() {
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void tc23()  {
		System.out.println(Thread.currentThread().getId());
	}
	
	
	
}
