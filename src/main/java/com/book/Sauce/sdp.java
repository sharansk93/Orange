package com.book.Sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class sdp {
	public static WebDriver driver;
	private Login l;
	private Home h;
	private details d;
	private order o;
	private checkout c;
	
	public sdp(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
	}

	public Login getlogin() {
		if(l==null) {
			l=new Login(driver);
		}
		return l;
	}

	public Home getHome() {
		if(h==null) {
			h=new Home(driver);
		}
		return h;
	}

	public details getdetails() {
		if(d==null) {
			d=new details(driver);
		}
		return d;
	}

	public order getorder() {
		if(o==null) {
			o=new order(driver);
		}
		return o;
	}

	public checkout getcheckout() {
		if(c==null) {
			c=new checkout(driver);
		}
		return c;
	}
}
