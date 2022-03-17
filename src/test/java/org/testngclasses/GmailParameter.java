package org.testngclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.baseclass.BaseClass;
import org.locators.GmailPageOne;
import org.locators.GmailPageTwo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailParameter extends BaseClass {

	@Parameters({"Email","Password"})
	@Test
	private void login(String userId,String pwd) {
		implicitWait(30);
		GmailPageOne one = new GmailPageOne();
		sendUserText(one.getUser(), userId);
		clickButton(one.getNext());
		
//		GmailPageTwo two= new GmailPageTwo();
//		sendUserText(two.getPass(), pwd);
	}
	
	@BeforeClass
	private void accessWebPage() {
		launchEdgeDriver();
		launchURL("https://mail.google.com/");
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
	
}
