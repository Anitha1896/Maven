package org.testngclasses;

import org.baseclass.BaseClass;
import org.testng.annotations.Test;

public class SampleReport extends BaseClass {
@Test
private void generateReport() {
	launchChromeDriver();
	launchURL("http://www.greenstechnologys.com/");	
	maxWindow();
}
}
