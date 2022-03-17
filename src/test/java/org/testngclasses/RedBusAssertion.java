package org.testngclasses;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusAssertion extends BaseClass {
	@BeforeClass
	private void accessWebPage() {
		launchChromeDriver();
		launchURL("https://www.redbus.in/");
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
	@Test
	private void signIn() {
		implicitWait(40);
		WebElement btnSign = driver.findElement(By.id("i-icon-profile"));
		clickButton(btnSign);
		WebElement signInBtn = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		clickButton(signInBtn);
		switchToFrameByWebElementRef(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		WebElement phNo = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		sendUserText(phNo, "9946734620");
		Assert.assertEquals(phNo.getAttribute("value"), "9946734620", "Check Ph No.");;
		System.out.println("Phone number entered is correct");
	}
}
