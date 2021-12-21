package org.framework;

import java.io.IOException;
import java.util.Date;

import org.Utiltiles.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class TestNGDemo extends BaseClass{
	
//	@BeforeClass
//	public void browserLaunch() {
//		chromeLauch();
//	}
//	
//	@BeforeMethod
//	public void start() {
//		System.out.println(new Date());
//		loadUrl("https://www.facebook.com/");
//	}
//	
//	@AfterMethod
//	public void end() {
//		System.out.println(new Date());
//	}
	
//
//	@Parameters({"username"})
//	@Test
//	public void tc2(String s1) throws IOException, InterruptedException {
//		PojoClass p = new PojoClass();
//		fill(p.getTxtUser(), s1);
//		fill(p.getTxPass(), "Pass@123");
//		SoftAssert s= new SoftAssert();
//		s.assertTrue(s1.equals("raj"),"Check name for shai");
//		btnClick(p.getBtnLogin());
//		Thread th = new Thread();
//		th.sleep(2000);
//		
//	
//	}
//
//	
//	@Parameters({"username","password"})
//	@Test
//	public void tc4(String s1, String s2) throws IOException {
//		PojoClass p = new PojoClass();
//		fill(p.getTxtUser(),s1);
//		fill(p.getTxPass(), s2);
//		Assert.assertTrue(s1.equals("ram"),"Chenck name for raj");
//		btnClick(p.getBtnLogin());
//	}
	
//	@Parameters({"password"})
//	@Test()
//	public void tc3(String s2) throws IOException {
//		PojoClass p = new PojoClass();
//		fill(p.getTxtUser(), s2);
//		
//	System.out.println(s2);
//	}
	
//	@Test(dataProvider="dtList", dataProviderClass=DataProvi.class )
//	public void tc1(String s5,String s6) throws IOException {
//		PojoClass p = new PojoClass();
//		fill(p.getTxtUser(),s5 );
//		fill(p.getTxPass(), s6);
//		btnClick(p.getBtnLogin());
//	}
	//or
	
//	@DataProvider(name="dataList")
//	public Object[][] gettingDatas() {
//		return new Object[][] {
//			{"raj","raj@123"},
//			{"user","user@123"}
//		};
//	}

	
// parallel execution - method
//	@Test
//	public void tc31() {	
//		System.out.println(Thread.currentThread().getId());
//	}
//	
//	@Test
//	public void tc32() {
//		System.out.println(Thread.currentThread().getId());
//	}
//	
//	@Test
//	public void tc33()  {
//		System.out.println(Thread.currentThread().getId());
//	}
	// .xmi for paralell methods
//	<suite name="Suite" parallel="methods">
//	  <test name="Test">
//	    <classes>
//	      <class name="org.framework.TestNGDemo"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->
	
	
	// parallel execution - class testngdemo and dataprovi
	
//		@Test
//		public void tc31() {	
//			System.out.println(Thread.currentThread().getId());
//		}
//		
//		@Test
//		public void tc32() {
//			System.out.println(Thread.currentThread().getId());
//		}
//		
//		@Test
//		public void tc33()  {
//			System.out.println(Thread.currentThread().getId());
//		}
//	
//		<?xml version="1.0" encoding="UTF-8"?>
//		<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
//		<suite name="Suite" parallel="classes">
//		  <test name="Test">
//		    <classes>
//		      <class name="org.framework.DataProvi"/>
//		      <class name="org.framework.TestNGDemo"/>
//		    </classes>
//		  </test> <!-- Test -->
//		</suite> <!-- Suite -->
	
	
	// parallel execution - At tests
	@Parameters({"username"})
	@Test
	public void tc41(String s) {
		if (s.equals("mathew")) {
			System.out.println("tc41 : "+ "thread : "+ Thread.currentThread().getId() +" - "+ s);
		}
		else if (s.equals("ram")) {
			System.out.println("tc41 : "+ "thread : "+ Thread.currentThread().getId() +" - "+ s);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
