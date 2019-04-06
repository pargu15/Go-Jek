package com.Go_Jek.Amazon.MainTestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Go_Jek.Amazon.Operations.LoginPageActions;
import com.Go_Jek.Amazon.Operations.ProductsSelectionActions;
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
	
	@Test(priority = 1)
	public void DirectToHeadPhonesSelectionScreen() throws Exception{
		try {
			ProductsSelectionActions productsSelectionActions = new ProductsSelectionActions();
			productsSelectionActions.DirectToHeadPhonesSelectionScreen();
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	@Test(dependsOnMethods = "DirectToHeadPhonesSelectionScreen")
	public void AddHeadPhonesScreen() throws Exception{
		try {
			ProductsSelectionActions productsSelectionActions = new ProductsSelectionActions();
			productsSelectionActions.AddHeadPhones();
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	@Test(dependsOnMethods = "AddHeadPhonesSelectionScreen")
	@Parameters("ProductName")
	public void SearchAndAddProduct(String ProductName) throws Exception{
		try {
			
			ProductsSelectionActions productsSelectionActions = new ProductsSelectionActions();
			productsSelectionActions.SearchProduct(ProductName);
			productsSelectionActions.AddSearchedProduct();
			
			
	}
		catch(Exception e)
		{
			System.out.println(e);
	
			}
		}
	
	@Test(dependsOnMethods = "SearchAndAddProduct")
	public void RemoveHeadphones() throws Exception{
		try {
			
			ProductsSelectionActions productsSelectionActions = new ProductsSelectionActions();
			productsSelectionActions.RemoveHeadphones();
			
	}
		catch(Exception e)
		{
			System.out.println(e);
	
			}
		}
	
	@Test(dependsOnMethods = "RemoveHeadphones")
	public void ReduceProductQuantity() throws Exception{
		try {
			
			ProductsSelectionActions productsSelectionActions = new ProductsSelectionActions();
			productsSelectionActions.ReduceProductQuantity();
			
	}
		catch(Exception e)
		{
			System.out.println(e);
	
			}
		}
	
	@Test(dependsOnMethods = "ReduceProductQuantity")
	public void MoveToCheckout(String ProductName) throws Exception{
		try {
			
			ProductsSelectionActions productsSelectionActions = new ProductsSelectionActions();
			productsSelectionActions.ReduceProductQuantity();
			
	}
		catch(Exception e)
		{
			System.out.println(e);
	
			}
		}

	@AfterClass
	public void DriverClose() throws Exception
	{	
		LoginPageActions loginActions = new LoginPageActions();
		loginActions.clickOnLogoutButton();
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();
	}
}
