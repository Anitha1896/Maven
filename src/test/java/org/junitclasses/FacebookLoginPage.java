package org.junitclasses;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.FacebookLoginPOJO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class FacebookLoginPage extends BaseClass {
	static Date d;

	@BeforeClass
	public static void accessWebPage() {
		launchChromeDriver();
		launchURL("https://en-gb.facebook.com/");
		maxWindow();
	}

	@AfterClass
	public static void close() {
		closeBrowser();
	}

	@Before
	public void startTime() {
		System.out.println(getDateAndTime());
	}

	@After
	public void endTime() {
		System.out.println(getDateAndTime());
	}

	@Test
	public void printUrlAndTitle() {
		Assert.assertTrue("Check URL", getCurrentUrl().startsWith("https"));
		System.out.println("Current URL: " + getCurrentUrl());

		Assert.assertTrue("Check Title", getTitle().contains("Facebook"));
		System.out.println("Title: " + getTitle());
	}

	@Test
	public void loginFunctionality() throws IOException {
		FacebookLoginPOJO fB = new FacebookLoginPOJO();
		sendUserText(fB.getEmail(), readExcel("TestData", "Facebook Login", 1, 1));
		Assert.assertEquals("Check User ID: ", "Ani@gmail.com", fB.getEmail().getAttribute("value"));
		sendUserText(fB.getPwd(), readExcel("TestData", "Facebook Login", 1, 2));
		Assert.assertEquals("Check Password: ", "12345@yh", fB.getPwd().getAttribute("value"));
		System.out.println("User ID and password entered successfully");
	}
}
