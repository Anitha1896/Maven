package org.junitclasses;

import java.util.List;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class RedBusLogin extends BaseClass {

	@BeforeClass
	public static void accessWebPage() {
		launchChromeDriver();
		launchURL("https://www.redbus.in/");
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
	public void signIn() {
		implicitWait(40);
		WebElement btnSign = driver.findElement(By.id("i-icon-profile"));
		clickButton(btnSign);
		WebElement signInBtn = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		clickButton(signInBtn);
		
		switchToFrameByWebElementRef(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		WebElement phNo = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		sendUserText(phNo, "9946734620");
		
		Assert.assertEquals("Check Ph No.", "9946734620", phNo.getAttribute("value"));
		System.out.println("Phone number entered is correct");
	}
	
	
}
