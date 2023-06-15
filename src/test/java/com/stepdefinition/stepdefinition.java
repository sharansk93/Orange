package com.stepdefinition;



import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Reuse.Base;
import com.Reuse.Sdp;
import com.property.ConfigHelper;
import com.property.configReader;
import com.runner.api_runner;

import hooks.Apihooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition extends Base{
	
	public static WebDriver driver = Apihooks.driver;
	Sdp s;

@Given("Launch the url with valid username and pass")
public void launch_the_url_with_valid_username_and_pass() throws IOException {
	
//	System.out.println();
//	String browser = ConfigHelper.getInstanceCR().browser();
//  driver= Browserlaunch(ConfigHelper.getInstanceCR().browser());
//  driver.get(ConfigHelper.getInstanceCR().url());
//  System.out.println("ssssssssssss"+driver);
  s= new Sdp(driver);
  SendKeys(s.Loginpage().getUsername(), ConfigHelper.getInstanceCR().username());
  SendKeys(s.Loginpage().getPass(), ConfigHelper.getInstanceCR().pass());
  Click(s.Loginpage().getLogin());
  
}

@When("I select fcm and add employee from the dash")
public void i_select_fcm_and_add_employee_from_the_dash() throws IOException {
	
	Click(s.Homepage().getPim());
	Click(s.Homepage().getAddemployee());
	
}

@Then("enter the details and click on submit")
public void enter_the_details_and_click_on_submit() throws IOException {
	SendKeys(s.Homepage().getFirstname(), ConfigHelper.getInstanceCR().firsrname());
	SendKeys(s.Homepage().getMiddleName(), ConfigHelper.getInstanceCR().middlename());
	SendKeys(s.Homepage().getLastName(), ConfigHelper.getInstanceCR().lastname());
	Click(s.Homepage().getSubmit());
  

}

}
