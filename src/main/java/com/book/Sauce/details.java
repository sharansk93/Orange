package com.book.Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class details {
	public static WebDriver driver;
	
	public details(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
		
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	@FindBy(id="first-name")
	private WebElement firstname;

	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="postal-code")
	private WebElement pin;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
}
