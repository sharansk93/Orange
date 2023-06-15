package com.property;

import java.io.IOException;

public class ConfigHelper {
	
	private ConfigHelper() {
		
	}
	
	public static configReader getInstanceCR() throws IOException {
		configReader cr= new configReader();
		return cr;
	}

}
