package com.Go_Jek.Amazon.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class CommonFunctions {
	
		public void WaitforElementToBeVisible(final WebElement webElement) throws Exception
		{
			try{
			WebDriverWait wait = new WebDriverWait(DriverInitiation.getDriver(),10);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			}
		}

	}
	