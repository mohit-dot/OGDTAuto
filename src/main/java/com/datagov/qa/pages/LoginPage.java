package com.datagov.qa.pages;

//import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import com.datagov.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Define Page factory - OR:
	
	@FindBy(name="name")
	 WebElement name;
 
	@FindBy(name="pass")
	 WebElement pass;

	@FindBy(xpath = "//img[@alt = 'MyGov Auth']")
	 WebElement loginbtn;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	 WebElement authlogo;
	
	//Initializing the Page Objects 
	public LoginPage()
	{
	 PageFactory.initElements(driver,this);
	}
	
	
	//Actions 
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	 public boolean validateAuthImage() {
		 return authlogo.isDisplayed();
	 }
	
	public HomePage login(String un, String pwd) {
		name.sendKeys(un);
		pass.sendKeys(pwd);
		loginbtn.click();
		return new HomePage(); 
	}
	
	
}
