package com.book.Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public static WebDriver driver;
	
	public Home(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
		
		
	}
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//parent::div//parent::div//button")
	private WebElement add;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCart() {
		return cart;
	}

}
