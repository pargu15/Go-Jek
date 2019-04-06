package com.Go_Jek.Amazon.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository {
	
	@FindBy(xpath = "//*[@id=\"nav-link-yourAccount\"]")
	public WebElement oMyAccountLink;
	
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	public WebElement oSignInLink;
		
	@FindBy(id = "ap_email")
	public WebElement oUserName;
	
	@FindBy(id = "continue")
	public WebElement oContinueBtn;
	
	@FindBy(id = "ap_password")
	public WebElement oPassword;
	
	@FindBy(id = "signInSubmit")
	public WebElement oLoginBtn;
	
	@FindBy(xpath = "//*[@id=\"nav-link-yourAccount\"]/span[2]")
	public WebElement oWelcomeText;

}