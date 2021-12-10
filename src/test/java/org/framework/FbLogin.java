package org.framework;

import java.io.IOException;

import org.Utiltiles.BaseClass;

public class FbLogin extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
	//  datadriven task --       Qn.7)    URL : https://www.facebook.com/
	//NOTE: Create an excel sheet for facebook email and password---- Create a project in maven.
      //Login in to facebook by getting the input data from excel sheet.
      //Update the successful login or error message generated after login in excel sheet using DataDriven.

		String path = "C:\\Users\\Admin\\eclipse-workspace\\FbLogin\\xcelfiles\\fbLogin.xlsx";
		setFbLogindetails(path);
		chromeLauch();
		loadUrl("https://www.facebook.com/");
		sendTxtUser(TxtUser(), getfbLoginDetails(path, 1, 0));
		sendTxtPass(TxtPass(), getfbLoginDetails(path, 1, 1));
		fbBtnlogin(btnlogin());
		System.out.println(getTxt());
	
	
	//  datadriven task -- 
	//qn.8) URL : https://www.toolsqa.com/selenium-training/#enroll-form
	//NOTE: Create an excel sheet with all required details for registration . 
      //Register the form by getting the input data  from excel sheet using DataDriven and execute in maven.
		setDemoqaData(1, "john", "raj", "john@gmail.com", "9887659432", "India", "Chennai", "Hello friend");
		chromeLauch();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		fill(firstName(), getDemoqaData(1, 0));
		fill(lasttName(), getDemoqaData(1, 1));
		fill(email(), getDemoqaData(1, 2));
		fill(mobile(), getDemoqaData(1, 3));
		selectCountry(country());
		fill(city(), getDemoqaData(1, 5));
		fill(messgage(), getDemoqaData(1, 6));
		Thread th = new Thread();
		th.sleep(5000);
		btnClick(popupWind());
		th.sleep(15000);
		btnClick(btnSend());
		System.out.println("registered");
	
		*/	

	//using PojoClass
		chromeLauch();
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), getfbLoginDetails(3, 0));
		fill(p.getTxPass(), getfbLoginDetails(3, 1));
		btnClick(p.getBtnLogin());
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

