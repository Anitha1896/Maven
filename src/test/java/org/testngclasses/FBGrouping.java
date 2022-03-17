package org.testngclasses;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.locators.FacebookLoginPOJO;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBGrouping extends BaseClass {
	@BeforeClass(groups= {"Login1","Login2"})
	private void accessWebPage() {
		launchChromeDriver();
		launchURL("https://www.facebook.com/");
		maxWindow();
	}
	@AfterClass(groups= {"Login1","Login2"})
	private void close() {
		closeBrowser();
	}
	@BeforeMethod(groups= {"Login1","Login2"})
	private void startTime() {
		System.out.println(getDateAndTime());
	}
	@AfterMethod(groups= {"Login1","Login2"})
	private void endTime() {
		System.out.println(getDateAndTime());
	}
	
	@Test(groups= "Login1")
	private void log1() throws IOException {
			FacebookLoginPOJO fB = new FacebookLoginPOJO();
			sendUserText(fB.getEmail(), readExcel("TestData", "Facebook Login", 1, 1));
			Assert.assertEquals(fB.getEmail().getAttribute("value"), "Ani@gmail.com", "Check User ID");
			sendUserText(fB.getPwd(), readExcel("TestData", "Facebook Login", 1, 2));
	}
	
	@Test(groups="Login2")
	private void log2() throws IOException {
			FacebookLoginPOJO fB = new FacebookLoginPOJO();
			sendUserText(fB.getEmail(), readExcel("TestData", "Facebook Login", 2, 1));
			Assert.assertEquals(fB.getEmail().getAttribute("value"), "Ani@gmail.com", "Check User ID");
			sendUserText(fB.getPwd(), readExcel("TestData", "Facebook Login", 2, 2));
	}
	
}

