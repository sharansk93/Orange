package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Reuse.Base;
import com.book.Sauce.base;
import com.book.Sauce.sdp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition_sauce extends Base{
	public static WebDriver driver;
	public static sdp s;
	@Given("Launch the url using valid username {string} and password {string}")
	public void launch_the_url_using_valid_username_and_password(String username, String pass) {
		
		driver=Browserlaunch("chrome");
		driver.get("https://www.saucedemo.com");
		s= new sdp(driver);
		s.getlogin().getUsername().sendKeys(username);
		s.getlogin().getPassword().sendKeys(pass);
//		driver.findElement(By.id("user-name")).sendKeys(username);
		s.getlogin().getLogin().click();
		
	   
	}
	@When("I add a product to the cart and click on cart button")
	public void i_add_a_product_to_the_cart_and_click_on_cart_button() {
		s.getHome().getAdd().click();
		s.getHome().getCart().click();
	  
	}
	@When("Check out button is clicked")
	public void check_out_button_is_clicked() {
	   s.getcheckout().getCheckout().click();
	}
	@When("customer details are filled and click on continue button")
	public void customer_details_are_filled_and_click_on_continue_button() {
	   s.getdetails().getFirstname().sendKeys("sharan");
	   s.getdetails().getLastname().sendKeys("kumar");
	   s.getdetails().getPin().sendKeys("600096");
	   s.getdetails().getContinuebutton().click();
	}
	@Then("place the order and validate the message")
	public void place_the_order_and_validate_the_message() throws IOException {
		s.getorder().getFinish().click();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\VDI007\\eclipse-workspace\\Sauce\\src\\test\\java\\screenshot/sauce.png");
		FileUtils.copyFile(source, des);
		
		driver.close();
	   
	}




}
