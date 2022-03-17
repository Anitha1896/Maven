package org.testngclasses;
import org.baseclass.BaseClass;
import org.locators.FlipKartLogin;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipKartLoginAssertion extends BaseClass{
	@BeforeClass
	private void befCls() {
		launchChromeDriver();
		launchURL("https://www.flipkart.com/account/login");
		maxWindow();
		implicitWait(20);
	}
	@AfterClass
	private void aftCls() {
		closeBrowser();
	}
	@BeforeMethod
	private void bef() {
		System.out.println("Test Starts: " + getDateAndTime());
	}
	@AfterMethod
	private void aft() {
		System.out.println("Test Ends: " + getDateAndTime());
	}
	@Test
	private void login() {
		FlipKartLogin f= new FlipKartLogin();
		WebElement u = f.getUserId();
		sendUserText(u, "Anitha@gmail");
		String u1 = getAttributeValue(u, "value");
		Assert.assertEquals(u1, "Anitha@gmail", "Validate UserID");
		
		WebElement p = f.getPassword();
		sendUserText(p, "65348762");
		Assert.assertEquals(getAttributeValue(p, "value"), "65348762", "Validate Password");
		System.out.println("Entered credentials are correct");	
	}
}
