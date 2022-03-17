package org.junitclasses;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.FlipKartLogin;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class FlipkartLoginAssert extends BaseClass {

	@BeforeClass
	public static void befCls() {
		launchChromeDriver();
		launchURL("https://www.flipkart.com/account/login");
		maxWindow();
		implicitWait(20);
	}

	@AfterClass
	public static void aftCls() {
		closeBrowser();
	}
	
	@Before
	public void bef() {
		System.out.println("Test Starts: " + getDateAndTime());
	}

	@After
	public void aft() {
		System.out.println("Test Ends: " + getDateAndTime());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		FlipKartLogin f= new FlipKartLogin();
		WebElement u = f.getUserId();
		sendUserText(u, "Anitha@gmail");
		String u1 = getAttributeValue(u, "value");
		Assert.assertEquals("Check userId", "Anitha@gmail", u1);
		
		WebElement p = f.getPassword();
		sendUserText(p, "65348762");
		Assert.assertEquals("Check password", "65348762", jsGetAttributeValue(p));
		
		System.out.println("Enter credentials are correct");
		
	}
	}


