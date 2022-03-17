package org.testngclasses;

import org.baseclass.BaseClass;
import org.locators.FlipKartLogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FlipKartParallelTests extends BaseClass {
	@Parameters("Browser")
	@Test
	private void login(String name) throws InterruptedException {

		if (name.contains("rom")) {
			launchChromeDriver();

		} else if (name.startsWith("Fire")) {
			holdProgram(5000);
			launchFireFoxDriver();

		} else {
			holdProgram(20000);
			launchEdgeDriver();
		}
		launchURL("https://www.flipkart.com/account/login");
		maxWindow();
		FlipKartLogin f = new FlipKartLogin();
		sendUserText(f.getUserId(), "Anitha@gmail");
		sendUserText(f.getPassword(), "65348762");
		System.out.println("Credentials has been entered in " + name + " browser");
		holdProgram(5000);
	}

	@BeforeMethod
	private void bef() {
		System.out.println("Test Starts: " + getDateAndTime());
	}

	@AfterMethod
	private void aft() {
		System.out.println("Test Ends: " + getDateAndTime());
	}
}
