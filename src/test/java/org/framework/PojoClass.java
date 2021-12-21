package org.framework;

import org.Utiltiles.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PojoClass extends BaseClass{
	
	
	public PojoClass() {
	PageFactory.initElements(driver, this);	
	}
	
	// facebook ---- PojoClass
	
	@FindBy(id="email")
	private WebElement txtUser;
	@FindBy(id="pass")
	private WebElement txPass;
	@FindBy(name="login")
	private WebElement btnLogin;
	
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxPass() {
		return txPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	// Demoqa  -   pojoclass
	
	@FindBy(id="first-name")
	private WebElement DemoFirstNamer;
	
	@FindBy(id="last-name")
	private WebElement DemoLastname;
	
	@FindBy(id="email")
	private WebElement DemoEmail;
	
	@FindBy(id="mobile")
	private WebElement DemoMobile;
	
	@FindBy(id="country")
	private WebElement DemoCountry;
	
	@FindBy(id="city")
	private WebElement DemoCity;
	
	@FindBy(name="message")
	private WebElement DemoMessage;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement DemoBtnsend;

	public WebElement getDemoFirstNamer() {
		return DemoFirstNamer;
	}

	public WebElement getDemoLastname() {
		return DemoLastname;
	}

	public WebElement getDemoEmail() {
		return DemoEmail;
	}

	public WebElement getDemoMobile() {
		return DemoMobile;
	}

	public WebElement getDemoCountry() {
		return DemoCountry;
	}

	public WebElement getDemoCity() {
		return DemoCity;
	}

	public WebElement getDemoMessage() {
		return DemoMessage;
	}

	public WebElement getDemoBtnsend() {
		return DemoBtnsend;
	}
	
	
//GteensTech
	@FindBy(id="footer-wrapper")
	private WebElement greensPageBottom;
	
	@FindBy(className="activeLink")
	private WebElement greensScrollTop;
	
	@FindBy(xpath="//h1[contains(text(),'No 1')]")
	private WebElement greensTxtNo1;
	
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement greensTxtCertification;
	
	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement greensSelCourseCont;
	
	@FindBy(xpath="//p[@style='line-height:20px;']")
	private WebElement greensParaBlwTestimo;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement greensCourse;
	
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement greensJavaTr;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement greensCoreJavaTraining;
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement greensCarrers;
	
	@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[1]")
	private WebElement greensEmail;
	
	@FindBy(xpath="(//span[text()='  contact@greenstechnologys.com'])[1]")
	private WebElement greensCarrerPageEmail;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement greensTxtTestimonial;
	
	@FindBy(xpath="//a[text()='+91 8939 915 577 ']")
	private WebElement greensTxtTestimonialMobile;
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement greensContactus;
	
	@FindBy(xpath="//h3[@class='title divider-3']")
	private WebElement greensTxtMainBranch;
	
	@FindBy(xpath="//div[@class='col-md-6 col-sm-6 left-side']")
	private WebElement greensTxtCopyright;
	
	public WebElement getGreensCarrerPageEmail() {
		return greensCarrerPageEmail;
	}
	
	public WebElement getGreensCarrers() {
		return greensCarrers;
	}

	public WebElement getGreensEmail() {
		return greensEmail;
	}

	public WebElement getGreensTxtTestimonial() {
		return greensTxtTestimonial;
	}

	public WebElement getGreensTxtTestimonialMobile() {
		return greensTxtTestimonialMobile;
	}

	public WebElement getGreensContactus() {
		return greensContactus;
	}

	public WebElement getGreensTxtMainBranch() {
		return greensTxtMainBranch;
	}

	public WebElement getGreensTxtCopyright() {
		return greensTxtCopyright;
	}


	public WebElement getGreensCourse() {
		return greensCourse;
	}

	public WebElement getGreensJavaTr() {
		return greensJavaTr;
	}

	public WebElement getGreensCoreJavaTraining() {
		return greensCoreJavaTraining;
	}

	public WebElement getGreensPageBottom() {
		return greensPageBottom;
	}

	public WebElement getGreensScrollTop() {
		return greensScrollTop;
	}

	public WebElement getGreensTxtNo1() {
		return greensTxtNo1;
	}

	public WebElement getGreensTxtCertification() {
		return greensTxtCertification;
	}

	public WebElement getGreensSelCourseCont() {
		return greensSelCourseCont;
	}

	public WebElement getGreensParaBlwTestimo() {
		return greensParaBlwTestimo;
	}
	
// RedBus PojoClass
	@FindBy(id="i-icon-profile")
	private WebElement redBusSignIcon;
	
	@FindBy(id="signInLink")
	private WebElement redBusSigninLink;
	
	@FindBy(id="mobileNoInp")
	private WebElement redBusMobileNo;

	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement redBusSignInIframe;

	public WebElement getRedBusSignInIframe() {
		return redBusSignInIframe;
	}

	public WebElement getRedBusSignIcon() {
		return redBusSignIcon;
	}

	public WebElement getRedBusSigninLink() {
		return redBusSigninLink;
	}

	public WebElement getRedBusMobileNo() {
		return redBusMobileNo;
	}
	
	
	
// facebook
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement FlipkartUserId;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement FlipkartPasswd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement FlipkartlLogin;

	public WebElement getFlipkartUserId() {
		return FlipkartUserId;
	}
	public WebElement getFlipkartPasswd() {
		return FlipkartPasswd;
	}
	public WebElement getFlipkartlLogin() {
		return FlipkartlLogin;
	}
	
	
	
	// 
	@FindBy(id="username")
	private WebElement adactUser;
	
	@FindBy(id="password")
	private WebElement adactPass;
	
	@FindBy(id="login")
	private WebElement adactLogin;

	@FindBy(id="location")
	private WebElement adactLocation;
	
	@FindBy(id="hotels")
	private WebElement adactHotels;
	
	public WebElement getAdactHotels() {
		return adactHotels;
	}

	@FindBy(id="room_type")
	private WebElement adactRoom;
	
	@FindBy(id="room_nos")
	private WebElement adactRoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement adactDateIn;

	@FindBy(id="adult_room")
	private WebElement adactAdultNo;
	
	@FindBy(id="child_room")
	private WebElement adactChildNo;
	
	@FindBy(id="datepick_out")
	private WebElement adactDateOut;
	
	@FindBy(id="Submit")
	private WebElement adactSearch;
	
	@FindBy(id="radiobutton_0")
	private WebElement adactRadioBtn;

	@FindBy(id="continue")
	private WebElement adactContinue;
	
	@FindBy(id="first_name")
	private WebElement adactFirstName;

	@FindBy(id="last_name")
	private WebElement adactLastName;
	
	@FindBy(id="address")
	private WebElement adactAddress;
	
	@FindBy(id="cc_num")
	private WebElement adactCreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement adactCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement adactCcExpryMonth;

	@FindBy(id="cc_exp_year")
	private WebElement adactCcExpryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement adactCcCvvNo;
	
	@FindBy(id="book_now")
	private WebElement adactBookNow;
	
	public WebElement getAdactOrderNo() {
		return adactOrderNo;
	}

	@FindBy(id="order_no")
	private WebElement adactOrderNo;


	public WebElement getAdactFirstName() {
		return adactFirstName;
	}
	public WebElement getAdactLastName() {
		return adactLastName;
	}
	public WebElement getAdactAddress() {
		return adactAddress;
	}
	public WebElement getAdactCreditCardNo() {
		return adactCreditCardNo;
	}
	public WebElement getAdactCardType() {
		return adactCardType;
	}
	public WebElement getAdactCcExpryMonth() {
		return adactCcExpryMonth;
	}
	public WebElement getAdactCcExpryYear() {
		return adactCcExpryYear;
	}
	public WebElement getAdactCcCvvNo() {
		return adactCcCvvNo;
	}
	public WebElement getAdactBookNow() {
		return adactBookNow;
	}
	public WebElement getAdactRadioBtn() {
		return adactRadioBtn;
	}
	public WebElement getAdactContinue() {
		return adactContinue;
	}
	public WebElement getAdactUser() {
		return adactUser;
	}
	public WebElement getAdactPass() {
		return adactPass;
	}
	public WebElement getAdactLogin() {
		return adactLogin;
	}
	public WebElement getAdactLocation() {
		return adactLocation;
	}
	public WebElement getAdactRoom() {
		return adactRoom;
	}
	public WebElement getAdactRoomNo() {
		return adactRoomNo;
	}
	public WebElement getAdactDateIn() {
		return adactDateIn;
	}
	public WebElement getAdactAdultNo() {
		return adactAdultNo;
	}
	public WebElement getAdactChildNo() {
		return adactChildNo;
	}
	public WebElement getAdactDateOut() {
		return adactDateOut;
	}
	public WebElement getAdactSearch() {
		return adactSearch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

}
