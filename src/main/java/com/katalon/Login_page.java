package com.katalon;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public static WebDriver driver;
	
	public Login_page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1,this);
	}
	
	@FindBy(id="txt-username")
	private WebElement username;
	
//	By username=By.id("txt-username");
	
	@FindBy(id="txt-password")
	private WebElement pass;
	
	
	@FindBy(id="btn-login")
	private WebElement login; 

	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogin() {
		return login;
	}

}
