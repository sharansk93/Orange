package com.katalon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver BrowserLaunch(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("start-maximized");
			driver=new ChromeDriver(options);
//			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		return driver;
	}
	
	
	public static void click(WebElement e) {
		e.click();
		
	}
	
	public static void sendkeys(WebElement e,String s) {
		e.sendKeys(s);
	}
	

}
