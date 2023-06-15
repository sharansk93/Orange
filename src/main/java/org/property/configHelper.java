package org.property;

import java.io.IOException;

public class configHelper {
	private configHelper() {
		
	}
	public static configreader getInstanceCR() throws IOException {
		configreader cr= new configreader();
		return cr;
	}

}
