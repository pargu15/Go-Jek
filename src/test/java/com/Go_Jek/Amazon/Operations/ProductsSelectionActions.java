package com.Go_Jek.Amazon.Operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Go_Jek.Amazon.ObjectRepository.AddRemoveProductsRepository;
import com.Go_Jek.Amazon.Utilities.CommonFunctions;
import com.Go_Jek.Amazon.Utilities.DriverInitiation;


public class ProductsSelectionActions {
	
	AddRemoveProductsRepository addProductsRepository = PageFactory.initElements(DriverInitiation.getDriver(),AddRemoveProductsRepository.class);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDateTime localDateTime = LocalDateTime.now();
	LocalDateTime localDateTime2 = LocalDateTime.now().plusDays(7);
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
	
	CommonFunctions commonFunctions = new CommonFunctions();
	
	JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();
	
	Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file
	private final static Logger logger1 = Logger.getLogger(ProductsSelectionActions.class); 
	
	Actions action = new Actions(DriverInitiation.getDriver());
	
	
	public void DirectToHeadPhonesSelectionScreen() throws Exception
	{
		
		try {
			action.moveToElement(addProductsRepository.oCategoryink)
			      .moveToElement(addProductsRepository.oMobileComputersLink)
		          .moveToElement(addProductsRepository.oElectronicsLink)
		          .click().build().perform();
			addProductsRepository.oHeadPhonesLink.click();
			
			System.out.println("User directed to Add head Phones Screen");
				}
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	
	public void AddHeadPhones() throws Exception
	{
		
		try {
			commonFunctions.WaitforElementToBeVisible(addProductsRepository.oAddHeadPhones);
			addProductsRepository.oAddHeadPhones.click();
	
			System.out.println("Head Phones Added");
				}
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	
	public void SearchProduct(String ProductName) throws Exception
	{
		
		try {
			addProductsRepository.oHomeScreenLink.click();
			commonFunctions.WaitforElementToBeVisible(addProductsRepository.oSearchBox);
			addProductsRepository.oSearchBox.sendKeys(ProductName);
			addProductsRepository.oSearchBtn.click();

			System.out.println("Head Phones Added");
			
				}
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	
	public void AddSearchedProduct() throws Exception
	{
		
		try {
			addProductsRepository.oSelectProduct.click();
			Select dropdown = new Select(addProductsRepository.oSelectQuantity);
			dropdown.selectByIndex(1);
			addProductsRepository.oAddToCart.click();
			System.out.println("Product Added with Quatity");
			
				}
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	public void RemoveHeadphones() throws Exception
	{
		
		try {
			addProductsRepository.oMoveToCart.click();
			addProductsRepository.oRemoveHeadPhones.click();
			
			System.out.println("HeadPhones Removed Successfully");
			
		}
				
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	
	
	public void ReduceProductQuantity() throws Exception
	{
		
		try {
			Select dropdown = new Select(addProductsRepository.oReduceProductQuantity);
			dropdown.selectByIndex(0);
			addProductsRepository.oReduceProductQuantity.click();
			addProductsRepository.oSelectOneQuantity.click();
			System.out.println("Product Quantity Reduced to one");
			
				}
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	
	public void MoveToCheckout() throws Exception
	{
		
		try {
			addProductsRepository.oCheckOutbtn.click();
			System.out.println("Proceded to Checkout Screen");
			
			
				}
		catch(Exception e)
		{
			System.out.println(e);
			logger1.error(e);
		}
	}
	
		}
	

