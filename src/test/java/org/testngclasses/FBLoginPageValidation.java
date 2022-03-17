package org.testngclasses;

import java.io.IOException;
import java.util.Date;
import org.baseclass.BaseClass;
import org.locators.FacebookLoginPOJO;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBLoginPageValidation extends BaseClass {
	static Date d;

	@BeforeClass
	private void accessWebPage() {
		launchChromeDriver();
		launchURL("https://en-gb.facebook.com/");
		maxWindow();
	}

	@AfterClass
	private void close() {
		closeBrowser();
	}

	@BeforeMethod
	private void startTime() {
		System.out.println(getDateAndTime());
	}

	@AfterMethod
	private void endTime() {
		System.out.println(getDateAndTime());
	}

	@Test(priority = -24)
	private void printUrlAndTitle() {
		Assert.assertTrue(getCurrentUrl().startsWith("https"), "Check URL");
		System.out.println("Current URL: " + getCurrentUrl());

		Assert.assertTrue(getTitle().contains("Facebook"), "Check Title");
		System.out.println("Title: " + getTitle());
	}

	@Test(priority = -12)
	private void loginFunctionality() throws IOException {
		FacebookLoginPOJO fB = new FacebookLoginPOJO();
		sendUserText(fB.getEmail(), readExcel("TestData", "Facebook Login", 1, 1));
		Assert.assertEquals(fB.getEmail().getAttribute("value"), "Ani@gmail.com", "Check User ID");
		sendUserText(fB.getPwd(), readExcel("TestData", "Facebook Login", 1, 2));
		Assert.assertEquals(fB.getPwd().getAttribute("value"), "12345@yh", "Check Password");
		System.out.println("User ID and password entered successfully");
	}
}
