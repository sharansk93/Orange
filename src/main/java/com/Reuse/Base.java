package com.Reuse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public static  WebDriver Browserlaunch(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions op= new ChromeOptions();
			op.addArguments("start-maximized");
			driver= new ChromeDriver(op);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		return driver;
	}
	
	public void Click(WebElement e) {
		e.click();
	}
	
	public void SendKeys(WebElement e,String s) {
		e.sendKeys(s);
	}

}
