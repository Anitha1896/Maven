package org.testngclasses;

import org.baseclass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser extends BaseClass {

	@Parameters("Browser")
	@Test
	private void launchGreensTech(String name) {
		if (name.contains("rom")) {
			launchChromeDriver();
		}
		else if (name.startsWith("f")) {
			launchFireFoxDriver();
		}
		else {
			launchEdgeDriver();
		}
	launchURL("http://www.greenstechnologys.com/");	
	maxWindow();
	
	}
}
