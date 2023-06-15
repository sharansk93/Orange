package com.book.Sauce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
public static WebDriver driver;

public WebDriver browserlaunch(String browser) {
	if(browser=="chrome") {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op= new ChromeOptions();
		op.addArguments("start-maximized");
		driver= new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	}
	return driver;
	
}
}
