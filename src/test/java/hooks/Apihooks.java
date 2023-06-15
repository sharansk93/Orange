package hooks;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

import com.Reuse.Base;
import com.property.ConfigHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Apihooks extends Base {
	
public static WebDriver driver;
	
	@Before ("@web")
	public  static void setup() throws IOException {
		driver= Browserlaunch(ConfigHelper.getInstanceCR().browser());
		driver.get(ConfigHelper.getInstanceCR().url());
		
	}
	
	@After("@web")
	public static void close() {
		driver.close();
	}

}
