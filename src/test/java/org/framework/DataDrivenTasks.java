package org.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.Utiltiles.BaseClass;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTasks extends BaseClass{
	
	public static void main(String[] args) throws IOException, InterruptedException  {
//  datadriven task --    
/*		

// Qn.1) Create excel sheet with details of 10 students name and  courses.
	//NOTE: Find the Total number of Rows and Total number of cells in excel sheet.
	 
	File f = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameworkTask\\xcelfiles\\student.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet sh = w.getSheet("Sheet1");
	System.out.println("Total no.of rows : " + sh.getPhysicalNumberOfRows());
	int totCells=0;
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		Row r = sh.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			totCells++;
		}
	}
	System.out.println("Total no.of cells : " + totCells);
	
	*/
	
	
// QUESTION 2 -------NOTE: Print all the data present  in excel sheet.

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Framework\\testFile\\student.xlsx");
		FileInputStream fInput = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fInput);
		Sheet sh = w.getSheet("Sheet1");
		String value="";
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			System.out.println("   ");
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				if (c.getCellType()==1) {
					value = c.getStringCellValue();
					System.out.print(value + "            ");
				}
				else if (c.getCellType()==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						
						SimpleDateFormat sdf = new SimpleDateFormat();
						value = 	sdf.format(c);
						System.out.print(value+"           ");
					}
					else {
						double num = c.getNumericCellValue();
						long l = (long)num;
						System.out.print(value.valueOf(num)+"              ");
					}
				}
			}
		}
		
	
	
/*	

// QUESTION 3------NOTE: Insert one new row in the excel sheet. 
	insertExcelRow(location, sheetName, 1, 0);
	
		
// qn.4) QUESTION 4------------URL : https://demoqa.com/registration/
	//NOTE: Create an excel sheet with all required details for registration 
	File f =new File("C:\\Users\\Admin\\eclipse-workspace\\Framework\\testFile\\registration.xlsx");
	FileInputStream fin = new FileInputStream(f);
	XSSFWorkbook w = new XSSFWorkbook(fin);
	String sheetName="sheet";
	Sheet sh = w.createSheet(sheetName);
	int cellCount=8;
	Row r = sh.createRow(0);
	for (int j = 0; j < cellCount; j++) {
		Cell cell = r.createCell(j);
		cell.setCellType(1);
		if(j==0) {
			cell.setCellValue("First Name");	
		}
		if(j==1) {
			cell.setCellValue("Last Name");
		}
		if(j==2) {
			cell.setCellValue("Email");
		}
		if(j==3) {
			cell.setCellValue("Mobile");
		}
		if(j==4) {
			cell.setCellValue("Country");
		}
		if(j==5) {
			cell.setCellValue("City");
		}	
		if(j==6) {
			cell.setCellValue("Your Message");
		}
		
	}
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("success created xcel");
	
	

//Qn.5) URL :  http://www.adactin.com/HotelApp/
// NOTE: Create an excel sheet with all details required for Hotel Booking .
	File f5 = new File("C:\\Users\\Admin\\eclipse-workspace\\Framework\\testFile\\adactReg.xlsx");
	FileInputStream fin5 = new FileInputStream(f5);
	Workbook w5 = new XSSFWorkbook(fin5);
	Sheet sh5 = w5.createSheet("detail");
	Row r = sh5.createRow(0);
	for (int i = 0; i < 5 ; i++) {
		Cell cell = r.createCell(i);
		if(i==0) {
			cell.setCellValue("userName");
		}
		if(i==1) {
			cell.setCellValue("Password");
		}
		if(i==2) {
			cell.setCellValue("ConfirmPpassword");
		}
	    if(i==3) {
	    	cell.setCellValue("FullName");
	   }
	    if(i==4) {
	    	cell.setCellValue("Email");
	    }
	}	
	FileOutputStream fout5 = new FileOutputStream(f5);
	w5.write(fout5);
	System.out.println("success");

	
	
//qn.6) URL : https://www.facebook.com/
	//NOTE: Create an excel sheet for facebook email and password.
  //Login in to facebook by getting the input data  from excel sheet using DataDriven and execute in maven.
	String path = "C:\\Users\\Admin\\eclipse-workspace\\Framework\\testFile\\fbLogin.xlsx";
	writeFbLogin(path);
	chromeLaunch();
	loadUrl("https://www.facebook.com/");
	fbtxtUser(getfbLogin(path, 1, 0));
	fbtxtPass(getfbLogin(path, 1, 1));
	fbBtnLogin();
	Thread th = new Thread ();
	th.sleep(1000);
	fbtxtUser(getfbLogin(path, 2, 0));
	fbtxtPass(getfbLogin(path, 2, 1));
	fbBtnLogin();
	th.sleep(1000);
	fbtxtUser(getfbLogin(path, 3, 0));
	fbtxtPass(getfbLogin(path, 3, 1));
	fbBtnLogin();
}
		
		
		
		
		---------------
		
		/*
		//Qn.7)    URL : https://www.facebook.com/
		//NOTE: Create an excel sheet for facebook email and password---- Create a project in maven.
		//Login in to facebook by getting the input data from excel sheet.
		//Update the successful login or error message generated after login in excel sheet using DataDriven.

		chromeLauch();
		loadUrl("https://www.facebook.com/");
		sendTxtUser(TxtUser(), getfbLoginDetails(1, 0));
		sendTxtPass(TxtPass(), getfbLoginDetails(1, 1));
		fbBtnlogin(btnlogin());
		System.out.println(getTxtOfWebElement(driver.findElement(By.className("_9ay7"))));
	

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
	}
	
}
