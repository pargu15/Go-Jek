package com.Go_Jek.Amazon.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveProductsRepository {
	
	@FindBy(xpath = "//*[@id=\"nav-link-shopall\"]")
	public WebElement oCategoryink;
	
	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span")
	public WebElement oMobileComputersLink;
		
	@FindBy(xpath = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[6]/div[2]/div/a[11]/span[1]")
	public WebElement oElectronicsLink;
	
	@FindBy(xpath = "//*[@id=\"leftNav\"]/ul[1]/ul/div/li[6]/span/a")
	public WebElement oHeadPhonesLink;
	
	@FindBy(xpath = "//*[@id=\"a-autoid-0\"]")
	public WebElement oAddHeadPhones;
	
	@FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]")
	public WebElement oHomeScreenLink;
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement oSearchBox;
	
	@FindBy(id = "nav-search-submit-text")
	public WebElement oSearchBtn;
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a")
	public WebElement oSelectProduct;
	
	@FindBy(id = "quantity")
	public WebElement oSelectQuantity;
	
	
	@FindBy(id = "submit.add-to-cart")
	public WebElement oAddToCart;
	
	@FindBy(id = "nav-cart")
	public WebElement oMoveToCart;
	
	@FindBy(xpath = "//*[@id=\"sc-item-Ce293597e-ef9a-4d5c-b79d-81fad01295f6\"]/div[4]/div/div[1]/div/div/div[2]/div/span[1]/span/input")
	public WebElement oRemoveHeadPhones;
	
	@FindBy(id = "a-autoid-0-announce")
	public WebElement oReduceProductQuantity;
	
	@FindBy(id = "dropdown1_0")
	public WebElement oSelectOneQuantity;
	
	@FindBy(id = "sc-buy-box-ptc-button-announce")
	public WebElement oCheckOutbtn;
	
	
}