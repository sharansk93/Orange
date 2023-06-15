package com.book.Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout {
	public static WebDriver driver;
	
	public checkout(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
		
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;

}
