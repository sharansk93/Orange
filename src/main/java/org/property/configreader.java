package org.property;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class configreader {
	Properties p;
	public configreader() throws IOException {
		File a=new File("C:\\Users\\VDI007\\eclipse-workspace\\Katalon\\src\\main\\java\\org\\property\\katalon.properties");
		FileInputStream f= new FileInputStream(a);
		p=new Properties();
		p.load(f);
		
	}
	
     public String browser() {
    	 String browser = p.getProperty("Browser");
    	 return browser;
     }
     
     public String url() {
    	 String url = p.getProperty("url");
    	 return url;
     }
     
     
     public String username() {
    	 String username = p.getProperty("username");
    	 return username;
     }
     
     public String pass() {
    	 String pass = p.getProperty("pass");
    	 return pass;
     }
     
     public String centre() {
    	 String centre = p.getProperty("centre");
    	 return centre;
     }
     
     public String date() {
    	 String date = p.getProperty("date");
    	 return date;
     }
     
     public String destination() {
    	 String destination = p.getProperty("destination");
    	 return destination;
     }
     
     public String des() {
    	 String des = p.getProperty("des");
    	 return des;
     }

}
