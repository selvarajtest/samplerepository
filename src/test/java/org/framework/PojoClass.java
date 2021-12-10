package org.framework;

import org.Utiltiles.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
	
	public PojoClass() {
	PageFactory.initElements(driver, this);	
	}
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
	
	

}
