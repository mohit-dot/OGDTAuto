package com.datagov.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datagov.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath = "//span[@class = 'user-name']")
	WebElement usernamelable;
	
	@FindBy(xpath= "//a[@title='View All Catalogs']")
	WebElement viewallcatalog;
	
	public HomePage()
	{
	 PageFactory.initElements(driver,this);
	}
	
	//Actions 
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public AllCatalogPage clickOnCatalogs() {
		return new AllCatalogPage();
	}
	
	

}
