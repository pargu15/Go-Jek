package com.Go_Jek.Amazon.Operations;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.Go_Jek.Amazon.ObjectRepository.LoginPageRepository;
import com.Go_Jek.Amazon.Utilities.CommonFunctions;
import com.Go_Jek.Amazon.Utilities.DriverInitiation;




public class LoginPageActions {
	

	LoginPageRepository loginRepository =PageFactory.initElements(DriverInitiation.getDriver(), LoginPageRepository.class);

	CommonFunctions commonFunctions = new CommonFunctions();
	Actions action = new Actions(DriverInitiation.getDriver());
	
	
	public void LoginIntoApp() throws Exception{
		action.moveToElement(loginRepository.oMyAccountLink)
		      .moveToElement(loginRepository.oSignInLink).click().build().perform();
		loginRepository.oUserName.sendKeys("gojekgurgaon@gmail.com");
		loginRepository.oContinueBtn.click();
		commonFunctions.WaitforElementToBeVisible(loginRepository.oPassword);
		loginRepository.oPassword.sendKeys("Trial@123");
		loginRepository.oLoginBtn.click();
		commonFunctions.WaitforElementToBeVisible(loginRepository.oWelcomeText);
		System.out.println("Login Successful Test");
	}
	
	
}
