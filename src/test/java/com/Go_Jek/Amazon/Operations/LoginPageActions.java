package com.Go_Jek.Amazon.Operations;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.Go_Jek.Amazon.ObjectRepository.LoginPageRepository;
import com.Go_Jek.Amazon.Utilities.CommonFunctions;
import com.Go_Jek.Amazon.Utilities.DriverInitiation;
import com.Go_Jek.Amazon.Utilities.ReadPropertyFile;

public class LoginPageActions {

	LoginPageRepository loginRepository = PageFactory.initElements(DriverInitiation.getDriver(),
			LoginPageRepository.class);

	CommonFunctions commonFunctions = new CommonFunctions();
	ReadPropertyFile readPropertyFile = new ReadPropertyFile();

	Actions action = new Actions(DriverInitiation.getDriver());

	public void LoginIntoApp() throws Exception {

		try {

			readPropertyFile.ReadProperty();
			action.moveToElement(loginRepository.oMyAccountLink).moveToElement(loginRepository.oSignInLink).click()
					.build().perform();
			loginRepository.oUserName.sendKeys(readPropertyFile.getUrl());
			loginRepository.oContinueBtn.click();
			commonFunctions.WaitforElementToBeVisible(loginRepository.oPassword);
			loginRepository.oPassword.sendKeys(readPropertyFile.getUrl());
			loginRepository.oLoginBtn.click();
			commonFunctions.WaitforElementToBeVisible(loginRepository.oWelcomeText);
			System.out.println("Login Successful Test");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clickOnLogoutButton() throws Exception {

		action.moveToElement(loginRepository.oMyAccountLink).moveToElement(loginRepository.oSignInLink).click().build()
				.perform();

		System.out.println("Logout Successfull");
	}

}
