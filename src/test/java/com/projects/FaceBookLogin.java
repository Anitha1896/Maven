package com.projects;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FaceBookLogin extends BaseClass{
public static void main(String[] args) throws IOException, AWTException {
	launchChromeDriver();
	launchURL("https://www.facebook.com/");
	maxWindow();
	
	WebElement email = driver.findElement(By.id("email"));
	jsSendUserText(readExcel("TestData", "Facebook Login", 1, 1), email);
	
	WebElement pwd = driver.findElement(By.id("pass"));
	jsSendUserText(readExcel("TestData", "Facebook Login", 1, 2), pwd);
	
	tabKey();
	enterKey();
	
}
}
