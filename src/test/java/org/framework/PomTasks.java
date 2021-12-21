package org.framework;

import java.io.IOException;

import org.Utiltiles.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class PomTasks extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	/*
		 
		//QUESTION 1  -  -----URL : https://www.facebook.com/
			//NOTE: Enter the username and password by using POM framework.
			chromeLauch();
			loadUrl("https://www.facebook.com/");
			PojoClass p = new PojoClass();
			p.getTxtUser().sendKeys("mathew");
			fill(p.getTxPass(), "mat@123");

		
	//Qn.2 --URL : https://www.toolsqa.com/selenium-training/
			//NOTE: Give the details to register the demoqa form by using POM framework.
		chromeLauch();
		loadUrl("https://www.toolsqa.com/selenium-training/");
		winMax();
		PojoClass p2 = new PojoClass();
		fill(p2.getDemoFirstNamer(), getDemoqaData(1, 0));
		fill(p2.getDemoLastname(), getDemoqaData(1, 6));
		fill(p2.getDemoEmail(), getDemoqaData(1, 1));
		fill(p2.getDemoMobile(), getDemoqaData(1, 2));
		selectCountry(p2.getDemoCountry());
		fill(p2.getDemoCity(), getDemoqaData(1, 4));
		fill(p2.getDemoMessage(), getDemoqaData(1, 5));
		
		
	//QUESTION 3 --- URL    : http://www.greenstechnologys.com/index.html

//		NOTE 1 : In home page scrolldown print the last line "greens technology overall reviews"and 
//			again scrollup and print the first line "NO 1 software training institute....".
//		NOTE 2 : Click certificaion and then click selenium course content.
//			In that page print the paragraph below testimonial and print title selenium.
//		NOTE 3 : Click course(mouse Over Action) and then click java training(mouse over action) and then click core java training.
//		  scroll down and print the line "Java training Reviews from Anitha"
//		NOTE 4 : Click career and scrolldown till the end and print the email displayed at last
//		NOTE 5 : Click testimonial and print the mobile number displayed in address and scrolldown and 
//			print the last line"Thank you very much for your help and further help needed. and my special thanks to Mr. Sandeep"
//		NOTE 6 : Click Contact Us and print the line "Our Main Branches In Chennai" and 
//			scrolldown and then print "Copyright © 2018 Greens Technology. All rights reserved."
	
			
			//3.a)
			chromeLauch();
			loadUrl("http://www.greenstechnologys.com/index.html");
			winMax();
			PojoClass p3 = new PojoClass();
			scrollAsTop(p3.getGreensPageBottom());
			Thread th = new Thread();
			th.sleep(1000);
			scrollAsTop(p3.getGreensTxtNo1());
			System.out.println(p3.getGreensTxtNo1().getText());
			//3.b)
			
			loadUrl("http://www.greenstechnologys.com/index.html");
			btnClick(p3.getGreensTxtCertification());
			btnClick(p3.getGreensSelCourseCont());
			String pageSource = driver.getPageSource();
			int indexOfparaStart = pageSource.indexOf("HI, I have taken Selenium training ");
			int indexOfparaend = pageSource.indexOf("suggest Greens Technology for SELENIUM");
			System.out.println("\nPara : "+ pageSource.substring(indexOfparaStart, indexOfparaend));
			String title = driver.findElement(By.xpath("//h2[text()='Selenium Training in Chennai']")).getText();
			System.out.println("\nTitile : " + title.substring(0, 8));
			//3.c) - using actions class
			
			loadUrl("http://www.greenstechnologys.com/index.html");
			mouseOver(p3.getGreensCourse());
			scrollAsTop(p3.getGreensJavaTr());
			mouseOver(p3.getGreensJavaTr());
			mouseOverAndClick(p3.getGreensCoreJavaTraining());
			WebElement anithaReview = driver.findElement(By.xpath("//h2[text()='Java training Reviews from Anitha']"));
			scrollAsTop(anithaReview);
			System.out.println("LIne : " + anithaReview.getText());

			//			//3.4)
			loadUrl("http://www.greenstechnologies.in/career.php");
			scrollAsTop(p3.getGreensCarrerPageEmail());
			System.out.println("line : " + p3.getGreensCarrerPageEmail().getText());		
		
			
			//3.5)  ---- unable to find text given in question in site
			 
			 
			//3.6)
			loadUrl("http://www.greenstechnologys.com/index.html");
			scrollAsBottom(p3.getGreensContactus());
			btnClick(p3.getGreensContactus());
			System.out.println("Line : " + p3.getGreensTxtMainBranch().getText());
			scrollAsTop(p3.getGreensTxtCopyright());
			System.out.println("ine :" + p3.getGreensTxtCopyright().getText());
		
		
	
	
		*/	
/*
	//using PojoClass
		chromeLauch();
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), getfbLoginDetails(3, 0));
		fill(p.getTxPass(), getfbLoginDetails(3, 1));
		btnClick(p.getBtnLogin());
		*/
	
	
	}
}

