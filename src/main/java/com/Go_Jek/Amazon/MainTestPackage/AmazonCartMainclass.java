package com.Go_Jek.Amazon.MainTestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.Go_Jek.Amazon.Operations.LoginPageActions;
import com.Go_Jek.Amazon.Utilities.BrowserTypes;
import com.Go_Jek.Amazon.Utilities.CommonVariables;
import com.Go_Jek.Amazon.Utilities.DriverInitiation;


public class AmazonCartMainclass {

	@BeforeClass
	@Parameters("Browser")
	public static void InitiateDriver(String Browser) throws Exception {
		try {
			if(Browser.equalsIgnoreCase("Chrome"))
		{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\resources\\chromedriver.exe");
				CommonVariables.BrowserName = BrowserTypes.Chrome;
		}
			else if(Browser.equalsIgnoreCase("Firefox")) {	
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\src\\resources\\geckodriver.exe");
				CommonVariables.BrowserName = BrowserTypes.FireFox;
			}
		DriverInitiation.getDriver().get("https://www.amazon.in/");
		LoginPageActions loginActions = new LoginPageActions();
		loginActions.LoginIntoApp();	
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	
	@AfterClass
	public void DriverClose() throws Exception
	{	
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();
	}
}
