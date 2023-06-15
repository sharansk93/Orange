package com.katalon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public static WebDriver driver;
	
	
	public Home_page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1,this );
		
		
	}
	
	@FindBy(xpath="//select[@id='combo_facility']")
	private WebElement facility;
	
	@FindBy(id="radio_program_medicaid")
	private WebElement healthcare;
	
	@FindBy(id="txt_visit_date")
	private WebElement date;
	
	@FindBy(id="txt_comment")
	private WebElement des;
	
	@FindBy(id="btn-book-appointment")
	private WebElement book;
	
	@FindBy(xpath="//div//h2[contains(text(),'Appointment Confirmation')]")
	private WebElement status;


	public WebElement getStatus() {
		return status;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFacility() {
		return facility;
	}

	public WebElement getHealthcare() {
		return healthcare;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDes() {
		return des;
	}

	public WebElement getBook() {
		return book;
	}
	
	

}
