package com.book.Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class order {
	public static WebDriver driver;
	public order(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
		
		
	}
	
	@FindBy(id="finish")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}

}
