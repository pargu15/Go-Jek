package com.Go_Jek.Amazon.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitiation {

	private static WebDriver driver;
	public static WebDriver getDriver()
	{
		if(driver==null){
			if(CommonVariables.BrowserName.equals(BrowserTypes.Chrome))
			{
			driver = new ChromeDriver();
			}
			else if(CommonVariables.BrowserName.equals(BrowserTypes.FireFox))
			{
			driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;
		}
		else{
			return driver;
		}
	}
	}

