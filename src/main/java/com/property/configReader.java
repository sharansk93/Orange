package com.property;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class configReader {
	
	Properties p;
	public configReader() throws IOException {
		File a= new File("C:\\Users\\VDI007\\eclipse-workspace\\Orange\\src\\test\\java\\resource\\org.properties");
		FileInputStream f= new FileInputStream(a);
		p= new Properties();
		p.load(f);
		
	}
	
	
	public String browser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String username() {
		String username = p.getProperty("username");
		return username;
	}
	
	
	public String url() {
		String url = p.getProperty("url");
		return url;
	}
	public String pass() {
		String pass = p.getProperty("pass");
		return pass;
	}
	
	
	public String firsrname() {
		String firsrname = p.getProperty("firstname");
		return firsrname;
	}
	
	
	public String middlename() {
		String middlename = p.getProperty("middlename");
		return middlename;
	}
	
	public String lastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

}
