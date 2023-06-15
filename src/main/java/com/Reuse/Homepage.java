package com.Reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

public static WebDriver driver;
	
	public Homepage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//span)[2]")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement Addemployee;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPim() {
		return pim;
	}

	public WebElement getAddemployee() {
		return Addemployee;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	
}

