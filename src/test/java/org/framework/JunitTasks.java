package org.framework;

import java.io.IOException;
import java.util.Date;

import org.Utiltiles.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class JunitTasks  extends BaseClass{

	@BeforeClass
	public static void browserLaunching() {
		chromeLauch();
	}
//	@AfterClass
//	public static void closeBrowser() {
//		closeChrome();
//	}
	@Before
	public void start() {
		System.out.println(new Date());
		winMax();
	}
	
	@After
	public void end() {
		System.out.println(new Date());
	}
	
//QUESTION 1 -----URL : https://www.facebook.com/
	//NOTE: Enter the username and password and verify whether the input data is correct or not by using junit framework.
	/*
	@Test
	public void FbLogin() throws IOException {
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.TxtUser(), getfbLoginDetails(1, 0));
		fill(p.TxtPass(), getfbLoginDetails(1, 1));
		Assert.assertTrue("condition verified",getfbLoginDetails(1, 0).equals("mathew@gmail")); 
		System.out.println("verify the data present ----- " + p.TxtUser().getAttribute("value"));
		Assert.assertTrue(getfbLoginDetails(1, 1).equals("pass@123"));
		System.out.println("verify the data present ----- "+ p.TxtPass().getAttribute("value"));
	}

	
	
//QUESTION 2 ----URL : https://www.redbus.in/
	//NOTE: Click signin and enter the email and password and verify whether the input data is correct or not by using junit framework.
	@Test
	public void redBusLogin() throws InterruptedException, IOException {
		loadUrl("https://www.redbus.in/");
		PojoClass p2 = new PojoClass();
		btnClick(p2.getRedBusSignIcon());
		btnClick(p2.getRedBusSigninLink());
		switchFramebyXpath(p2.getRedBusSignInIframe());
		System.out.println(getDemoqaData(1, 2));
		fill(p2.getRedBusMobileNo(), getDemoqaData(1, 2));
		Assert.assertTrue("check passed and getvalue", p2.getRedBusMobileNo().getAttribute("value").contains(getDemoqaData(1, 2)));	
		System.out.println("both are same");
	}
	

	
			//QUESTION 3------------URL : https://demoqa.com/registration/
			//NOTE: Give the details and register the form and verify whether the input data's is correct or not by using Junit framework & POM framework. 
			@Test
			public void demoQaRegist() throws IOException {
				loadUrl("https://www.toolsqa.com/selenium-training/");
				PojoClass p3 = new PojoClass();
				fill(p3.getDemoFirstNamer(), "ram");
				fill(p3.getDemoLastname(), "saran");
				fill(p3.getDemoEmail(), "ramsa@gmail.com");
				fill(p3.getDemoMobile(), "9876543220");
				selectCountry(p3.getDemoCountry());
				fill(p3.getDemoCity(), "Pune");
				fill(p3.getDemoMessage(), " Hi, ALL I am New");
				Assert.assertTrue("verify first name", p3.getDemoFirstNamer().getAttribute("value").equals("ram"));
				Assert.assertTrue("verify the last name", p3.getDemoLastname().getAttribute("value").equals("saran"));
				Assert.assertTrue("verify the email", p3.getDemoEmail().getAttribute("value").equals("ramsa@gmail.com"));
				Assert.assertTrue("verify the mobileNo", p3.getDemoMobile().getAttribute("value").equals("9876543220"));
				Assert.assertTrue("verify the country name", p3.getDemoCountry().getAttribute("value").equals("4"));
				Assert.assertTrue("verify the city", p3.getDemoCity().getAttribute("value").equals("Pune"));
				Assert.assertTrue("verify the msg", p3.getDemoMessage().getAttribute("value").equals(" Hi, ALL I am New"));
				btnClick(p3.getDemoBtnsend());
			}
		
//Qn.5) URL : https://demoqa.com/registration/			
 //NOTE: Create a project in maven and register the form by using POM & Junit framework and get the input data from excel sheet.
	@Test
	public void demoQaRegist() throws IOException {
		loadUrl("https://www.toolsqa.com/selenium-training/");
		PojoClass p3 = new PojoClass();
		fill(p3.getDemoFirstNamer(), getDemoqaData(1, 0));
		fill(p3.getDemoLastname(), getDemoqaData(1, 6));
		fill(p3.getDemoEmail(), getDemoqaData(1, 1));
		fill(p3.getDemoMobile(), getDemoqaData(1, 2));
		selectCountry(p3.getDemoCountry());
		fill(p3.getDemoCity(), getDemoqaData(1, 4));
		fill(p3.getDemoMessage(), getDemoqaData(1, 5));
		Assert.assertTrue("verify first name", p3.getDemoFirstNamer().getAttribute("value").equals(getDemoqaData(1, 0)));
		Assert.assertTrue("verify the last name", p3.getDemoLastname().getAttribute("value").equals(getDemoqaData(1, 6)));
		Assert.assertTrue("verify the email", p3.getDemoEmail().getAttribute("value").equals(getDemoqaData(1, 1)));
		Assert.assertTrue("verify the mobileNo", p3.getDemoMobile().getAttribute("value").equals(getDemoqaData(1, 2)));
		Assert.assertTrue("verify the country name", p3.getDemoCountry().getAttribute("value").equals("4"));
		Assert.assertTrue("verify the city", p3.getDemoCity().getAttribute("value").equals(getDemoqaData(1, 4)));
		Assert.assertTrue("verify the msg", p3.getDemoMessage().getAttribute("value").equals(getDemoqaData(1, 5)));
		btnClick(p3.getDemoBtnsend());
		
	}
	
	//Qn.4) URL : https://www.flipkart.com/account/login
		//NOTE: Enter the email and password and verify whether the input data is correct or not by using junit framework & POM framework.
		@Test
		public void FlipKartLogin() throws IOException {
			loadUrl("https://www.flipkart.com/account/login");
			PojoClass p4 = new PojoClass();
			ImpliciWait(2);
			p4.getFlipkartUserId().click();
			fill(p4.getFlipkartUserId(), getfbLoginDetails(2, 0));
			p4.getFlipkartPasswd().click();
			fill(p4.getFlipkartPasswd(), getfbLoginDetails(2, 1));
			btnClick(p4.getFlipkartlLogin());
			Assert.assertTrue("verify the userid", p4.getFlipkartUserId().getAttribute("value").equals(getfbLoginDetails(2, 0)));
			Assert.assertTrue("verify the passwdd", p4.getFlipkartPasswd().getAttribute("value").equals(getfbLoginDetails(2, 1)));
			System.out.println("datas are verified");
		
		}
		
	
		
	//Qn.6-----URL : http://www.adactin.com/HotelApp/
				//NOTE: Book a room by using POM & Junit framework and print the order no generated.
	@Test
	public void adactinBooking() {
		loadUrl("http://www.adactin.com/HotelApp/");
		PojoClass p5 = new PojoClass();
		fill(p5.getAdactUser(), "user94446");
		fill(p5.getAdactPass(), "password@12345");
		btnClick(p5.getAdactLogin());
		WaitImplicit(2);
		Select s1 = new Select(p5.getAdactLocation());
		s1.selectByValue("London");
		Select s2 = new Select(p5.getAdactHotels());
		s2.selectByValue("Hotel Sunshine");
		Select s3 = new Select(p5.getAdactRoom());
		s3.selectByValue("Deluxe");
		Select s4 = new Select(p5.getAdactRoomNo());
		s4.selectByValue("2");
		fill(p5.getAdactDateIn(), "22/12/2021");
		fill(p5.getAdactDateOut(), "24/12/2021");
		Select s5 = new Select(p5.getAdactAdultNo());
		s5.selectByValue("2");
		Select s6 = new Select(p5.getAdactChildNo());
		s6.selectByValue("1");
		btnClick(p5.getAdactSearch());
		WaitImplicit(1);
		btnClick(p5.getAdactRadioBtn());
		btnClick(p5.getAdactContinue());
		WaitImplicit(1);
		fill(p5.getAdactFirstName(), "User");
		fill(p5.getAdactLastName(), "Name");
		fill(p5.getAdactAddress(), "London");
		fill(p5.getAdactCreditCardNo(), "9876543211234567");
		Select s7 = new Select(p5.getAdactCardType());
		s7.selectByValue("MAST");
		Select s8 = new Select(p5.getAdactCcExpryMonth());
		s8.selectByVisibleText("December");
		Select s9 = new Select(p5.getAdactCcExpryYear());
		s9.selectByValue("2022");
		fill(p5.getAdactCcCvvNo(), "342");
		btnClick(p5.getAdactBookNow());
		WaitImplicit(5);
		System.out.println("OrderNo Attribute val: " +p5.getAdactOrderNo().getAttribute("value"));
		
	}
	
	*/
	
	//Qn.7) URL : http://www.adactin.com/HotelApp/
		//NOTE: Book a room by using POM ,Junit framework and get the input data from excel sheet and update the generated order no  in excel.
	@Test
	public void adactinBookingfromXcel() throws IOException {
	
		loadUrl("http://www.adactin.com/HotelApp/");
		PojoClass p6 = new PojoClass();
		fill(p6.getAdactUser(), getDemoqaData(10, 0));
		fill(p6.getAdactPass(),  getDemoqaData(10, 1));
		btnClick(p6.getAdactLogin());
		WaitImplicit(2);
		Select s1 = new Select(p6.getAdactLocation());
		s1.selectByValue( getDemoqaData(10, 2));
		Select s2 = new Select(p6.getAdactHotels());
		s2.selectByValue( getDemoqaData(10, 3));
		Select s3 = new Select(p6.getAdactRoom());
		s3.selectByValue( getDemoqaData(10, 4));
		Select s4 = new Select(p6.getAdactRoomNo());
		s4.selectByValue( getDemoqaData(10, 5));
		fill(p6.getAdactDateIn(),  getDemoqaData(10, 6));
		fill(p6.getAdactDateOut(),  getDemoqaData(10, 7));
		Select s5 = new Select(p6.getAdactAdultNo());
		s5.selectByValue( getDemoqaData(10, 8));
		Select s6 = new Select(p6.getAdactChildNo());
		s6.selectByValue( getDemoqaData(10, 9));
		btnClick(p6.getAdactSearch());
		WaitImplicit(1);
		btnClick(p6.getAdactRadioBtn());
		btnClick(p6.getAdactContinue());
		WaitImplicit(1);
		fill(p6.getAdactFirstName(),  getDemoqaData(10, 10));
		fill(p6.getAdactLastName(),  getDemoqaData(10, 11));
		fill(p6.getAdactAddress(),  getDemoqaData(10, 12));
		fill(p6.getAdactCreditCardNo(),  getDemoqaData(10, 13));
		Select s7 = new Select(p6.getAdactCardType());
		s7.selectByValue( getDemoqaData(10, 14));
		Select s8 = new Select(p6.getAdactCcExpryMonth());
		s8.selectByVisibleText( getDemoqaData(10, 15));
		Select s9 = new Select(p6.getAdactCcExpryYear());
		s9.selectByValue( getDemoqaData(10, 16));
		fill(p6.getAdactCcCvvNo(),  getDemoqaData(10, 17));
		btnClick(p6.getAdactBookNow());
		WaitImplicit(5);
		String bookingOrderNo = p6.getAdactOrderNo().getAttribute("value");
		System.out.println("OrderNo : " + bookingOrderNo);
		setDemoqaData(bookingOrderNo);
		
	}
		
		
		
		

	

	
}
