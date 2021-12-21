package org.Utiltiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebElement ele;
	
	
	
	
	//chrome browser
	public static void chromeLauch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//close Browser
	public static void closeChrome() {
		driver.close();
	}
	
	//url
	public static void loadUrl(String url) {
		driver.get(url);
	}
	//maximize
	public static void winMax() {
		driver.manage().window().maximize();
	}
	
	//Implicitywait
		public static void WaitImplicit(long time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
	
	//title
	public static String printTitle() {
	 String title = driver.getTitle();
	 return title;
	}
	
	// locator  - FaceBook
	
	//usermail
	public static WebElement TxtUser() {
		WebElement ele = driver.findElement(By.id("email"));
		return ele;
	}
	//pass
	public static WebElement TxtPass() {
		WebElement ele = driver.findElement(By.id("pass"));
		return ele;
	}
	//Btnlogin
	public static WebElement btnlogin() {
		WebElement ele = driver.findElement(By.name("login"));
		return ele;
	}

	
// fb detils in xcel
	// create facbook login detail in xcel
	public static void setFbLogindetails(String path) throws IOException{
		File f = new File(path);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("Sheet1");
		for (int i = 0; i < 4; i++) {
			Row r = sh.createRow(i);
			if(i==0) {
				for (int j = 0; j < 2; j++) {
					Cell cell = r.createCell(j);
					if(j==0) {
					cell.setCellValue("Email");
					}
					if (j==1) {
						cell.setCellValue("Password");
					}
				}
			}
			if(i==1) {
				for (int j = 0; j < 2; j++) {
					Cell cell = r.createCell(j);
					if(j==0) {
						cell.setCellValue("mathew@gmail");	
					}
					if(j==1) {
						cell.setCellValue("pass@123");
					}
				}
			}
			if(i==2) {
					for (int j = 0; j < 2; j++) {
						Cell cell = r.createCell(j);
						if(j==0) {
							cell.setCellValue("john@gmail");	
						}
						if(j==1) {
							cell.setCellValue("jj@123");
						}
					}
				}
				if(i==3) {
					for (int j = 0; j < 2; j++) {
						Cell cell = r.createCell(j);
						if(j==0) {
							cell.setCellValue("sam@gmail");	
						}
						if(j==1) {
							cell.setCellValue("ss@123");
						}
					}
				}
			}
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("written Success");
	}
	
// get fbLogin details from xcel
	public static String getfbLoginDetails(int row, int cell) throws IOException{
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\FrameworkTask\\xcelfiles\\fbLogin.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("Sheet1");
		String value="";
			Row r = sh.getRow(row);
			Cell c = r.getCell(cell);
			value = c.getStringCellValue();
	return value;
	}
	
// fill data
	public static void sendTxtUser(WebElement ele, String name) {
		ele.sendKeys(name);
	}
	public static void sendTxtPass(WebElement ele, String passwd) {
		ele.sendKeys(passwd);
	}
	public static void fbBtnlogin(WebElement ele) {
		ele.click();
	}
	public static String getTxtOfWebElement(WebElement ele) {
		String txt = ele.getText();
		return txt;
	}
	
	public static void switchFrame(String nameorId) {
		driver.switchTo().frame(nameorId);
			}

	public static void switchFramebyXpath(WebElement ele) {
		driver.switchTo().frame(ele);
			}

	//fill 
		public static void fill(WebElement ele, String name) {
			ele.sendKeys(name);
		}
		
		
	// read xcel
		
		public static String readXcelData (String location, String sheet) throws IOException {
			File f = new File(location);
			FileInputStream fInput = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fInput);
			Sheet sh = w.getSheet(sheet);
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
			return value;
		}
		
		
		
		
	//www.demoqa.com  -----user details
	
	// www.demoqa.com---regist detials) 
	
		public static void setDemoqaData(int numOfUsers,String firstname,String lastname,String mail,String mob,String country,String city, String msg) throws IOException {
		File f =new File("C:\\Users\\Admin\\eclipse-workspace\\FbLogin\\xcelfiles\\demoqaReg.xlsx");
		FileInputStream fin = new FileInputStream(f);
		XSSFWorkbook w = new XSSFWorkbook(fin);
		Sheet sh = w.createSheet("DataSheet");
		int cellCount=8;
		for (int i = 0; i <= numOfUsers; i++) {
		Row r = sh.createRow(i);
		if(i==0) {
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
		}	
		if(i>0) {
			
			for (int j = 0; j < cellCount; j++) {
				Cell cell = r.createCell(j);
				cell.setCellType(1);
				if(j==0) {
					cell.setCellValue(firstname);	
				}
				if(j==1) {
					cell.setCellValue(lastname);
				}
				if(j==2) {
					cell.setCellValue(mail);
				}
				if(j==3) {
					cell.setCellValue(mob);
				}
				if(j==4) {
					cell.setCellValue(country);
				}
				if(j==5) {
					cell.setCellValue(city);
				}	
				if(j==6) {
					cell.setCellValue(msg);
				}
				}
			}	
		}	
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("success created xcel");	
	}
		
		
	// getdtata for demoqa
		
		public static String getDemoqaData(int row, int cell) throws IOException {
			File f =new File("C:\\Users\\Admin\\eclipse-workspace\\FrameworkTask\\xcelfiles\\demoqaReg.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fin);
			Sheet sh = w.getSheet("DataSheet");
			Row r = sh.getRow(row);
			String value="";
			Cell c = r.getCell(cell);
			int cellType = c.getCellType();
			if (cellType==1) {
				value = c.getStringCellValue();
				return value;
			}
			else if (cellType==0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date dateCell = c.getDateCellValue();
					SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/YYYY");
					value = dateform.format(dateCell);
					return value;
				}
				else {
					double numericCellValue = c.getNumericCellValue();
					long l = (long)numericCellValue;
					value=String.valueOf(l);
					return value;
				}
				
			}
			return value;
		}

		
	// adaction update orderNo in xcel	
		public static void setDemoqaData(String bookingOrderNo) throws IOException {
			File f =new File("C:\\Users\\Admin\\eclipse-workspace\\FrameworkTask\\xcelfiles\\demoqaReg.xlsx");
			FileInputStream fin = new FileInputStream(f);
			XSSFWorkbook w = new XSSFWorkbook(fin);
			Sheet sh = w.getSheet("DataSheet");
			Row r = sh.createRow(12);
			Cell c = r.createCell(0);
			c.setCellType(1);
			c.setCellValue("BookingOrderNo = :" + bookingOrderNo);	
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
			System.out.println("success updated in xcel Database");	
		}
			
		
		
	// demoqa ----firstname
		public static WebElement firstName() {
			WebElement ele = driver.findElement(By.id("first-name"));
			return ele;
		}
		public static WebElement lasttName() {
			WebElement ele = driver.findElement(By.id("last-name"));
			return ele;
		}
		public static WebElement email() {
			WebElement ele = driver.findElement(By.id("email"));
			return ele;
		}
		public static WebElement mobile() {
			WebElement ele = driver.findElement(By.id("mobile"));
			return ele;
		}
		public static WebElement country() {
			WebElement ele = driver.findElement(By.id("country"));
			return ele;
		}
		public static void selectCountry(WebElement ele) {
			Select s = new Select(ele);
			s.selectByValue("4");
		}
		public static WebElement city() {
			WebElement ele = driver.findElement(By.id("city"));
			return ele;
		}
		public static WebElement messgage() {
			WebElement ele = driver.findElement(By.name("message"));
			return ele;
		}
		public static String captchaManual() {
			String captcha = driver.findElement(By.xpath("//img[@class='upcoming__registration--captcha']")).getText();
			return captcha;
		}
		public static WebElement btnSend() {
			WebElement ele = driver.findElement(By.xpath("//button[text()='Send']"));
			return ele;
		}
		public static void btnClick(WebElement ele) {
			ele.click();
		}
		
		
		//smallpop up at login time
		public static WebElement popupWind() {
			WebElement ele = driver.findElement(By.className("modal__close"));
			return ele;
		}
	//
		public void sampleAdd() {
			System.out.println("started GITHUB and Checks for modified code update push");
		}
	// Actions class ---- mouse over
		public static void mouseOver(WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).perform();
		}
		
		
		public static void mouseOverAndClick(WebElement ele) {
			Actions a = new Actions(driver);
			a.moveToElement(ele).click().perform();
		}
			
	// JavaScript
		public static void scrollAsTop(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",ele);
		}
		public static void scrollAsBottom(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)",ele);
		}
		
		
	
//Select Class
		public static void selectOptText(WebElement ele, String Text) {
			Select s = new Select(ele);
			s.selectByVisibleText(Text);
		}
		
		public static void selectOptValue(WebElement ele, String Text) {
			Select s = new Select(ele);
			s.selectByValue(Text);
		}
	
		public static void selectOptIndex(WebElement ele, int index) {
			Select s = new Select(ele);
			s.selectByIndex(index);
		}
}
