package com.katalon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class sdp {
	private Login_page lp;
	private Home_page hp;
	
	public static WebDriver driver;
	
	public sdp(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
		
		
	}
	
	public Login_page getLoginpage() {
		if(lp==null) {
			lp=new Login_page(driver);
		}
		return lp;
	}
	
	public Home_page getHomepage() {
		if(hp==null) {
			hp=new Home_page(driver);
		}
		return hp;
	}
	

}
