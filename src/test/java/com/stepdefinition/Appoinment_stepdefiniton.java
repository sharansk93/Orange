package com.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.property.configHelper;

import com.Reuse.Base;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Appoinment_stepdefiniton extends Base {
	public static WebDriver driver;
	public static com.katalon.sdp ss;

@Given("launch the URL")
public void launch_the_url() throws IOException {
	driver=Browserlaunch(configHelper.getInstanceCR().browser());
	driver.get(configHelper.getInstanceCR().url());

}
 
@When("I Login using Username and Password")
public void i_login_using_username_and_password() throws IOException {
	ss=new com.katalon.sdp(driver);
	ss.getLoginpage().getUsername().sendKeys(configHelper.getInstanceCR().username());
	ss.getLoginpage().getPass().sendKeys(configHelper.getInstanceCR().pass());
  
}

@When("Click the Login Button")
public void click_the_login_button() {
	ss.getLoginpage().getLogin().click();

}

@When("I Select Hongkong Health centre from the facility")
public void i_select_hongkong_health_centre_from_the_facility() throws IOException {
	WebElement facility = ss.getHomepage().getFacility();
Select s= new Select(facility);
List<WebElement> options = s.getOptions();
for (WebElement webElement : options) {
	String text = webElement.getText();
	if(text.equalsIgnoreCase(configHelper.getInstanceCR().centre())) {
		s.selectByVisibleText(configHelper.getInstanceCR().centre());
		break;
	}
}
 
	
}



@When("I select Medicare from Healthcare program")
public void i_select_medicare_from_healthcare_program() {
//	ss.getHomepage().getHealthcare().click();
	Click(ss.getHomepage().getHealthcare());
    
}

@When("I select the Visit date and enter the des")
public void i_select_the_visit_date_and_enter_the_des() throws IOException {
	
	SendKeys(ss.getHomepage().getDate(), configHelper.getInstanceCR().date());
	Click(ss.getHomepage().getDes());
	SendKeys(ss.getHomepage().getDes(), configHelper.getInstanceCR().des());
    
}

@When("click the book appoinment button")
public void click_the_book_appoinment_button() {
	Click(ss.getHomepage().getBook());
 
}

@Then("capture the message")
public void capture_the_message() throws IOException {
	
String text = ss.getHomepage().getStatus().getText();
System.out.println(text);
TakesScreenshot ts= (TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File des= new File(configHelper.getInstanceCR().destination());
FileUtils.copyFile(source, des);
driver.close();
   
}


}
