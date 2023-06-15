package com.Reuse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {
	
	public static WebDriver driver;
	private  Loginpage l;
	private Homepage h;
	
	public Sdp(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
		
	}
	
	public com.Reuse.Loginpage Loginpage() {
		if(l==null) {
			l=new Loginpage(driver);
		}
		return l;
	}
	

	public Homepage  Homepage() {
		if(h==null) {
			h=new Homepage(driver);
		}
		return h;
	}
	

}
