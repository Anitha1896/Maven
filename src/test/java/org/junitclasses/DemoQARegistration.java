package org.junitclasses;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.DemoQARegister;
import org.openqa.selenium.WebElement;

public class DemoQARegistration extends BaseClass {
	@BeforeClass
	public static void accessWebPage() {
		launchChromeDriver();
		launchURL("https://demoqa.com/automation-practice-form");
		maxWindow();
	}
//
//	@AfterClass
//	public static void close() {
//		closeBrowser();
//	}

	@Before
	public void startTime() {
		System.out.println(getDateAndTime());
	}

	@After
	public void endTime() {
		System.out.println(getDateAndTime());
	}

	@Test
	public void register() throws AWTException, IOException, InterruptedException {
		DemoQARegister d = new DemoQARegister();
		implicitWait(40);
		sendUserText(d.getFirstName(), readExcel("TestData", "DemoQA", 1, 1));
		sendUserText(d.getLastName(), readExcel("TestData", "DemoQA", 1, 2));
		sendUserText(d.getEmail(), readExcel("TestData", "DemoQA", 1, 3));

		jsClickButton(d.getGender().get(2));

		sendUserText(d.getMobileNumber(), readExcel("TestData", "DemoQA", 1, 4));

		jsClickButton(d.getdOBField());
		WebElement month = d.getSelectMonth();
		selectByValue(month, "0");

		selectByVisibleText(d.getSelectYear(), "2003");
		
		jsClickButton(d.getSelectDate().get(10));
		
		jsScrollDown(d.getdOBField());
//		jsSendUserText(readExcel("TestData", "DemoQA", 1, 6), d.getSubjects());
		clickButton(d.getSubjects());
		jsSendUserText("Math", d.getSubjects());
		
		enterKey();
		
		
		clickButton(d.getHobby1());
		clickButton(d.getHobby2());

		clickButton(d.getAddress());
		sendUserText(d.getAddress() ,readExcel("TestData", "DemoQA", 1, 5));

//		jsClickButton(d.getStateAndCity().get(0));
//		movedownKey();
//		enterKey();
//
//		jsClickButton(d.getStateAndCity().get(1));
//		movedownKey();
//		movedownKey();
//		enterKey();
		
//		clickButton(d.getSubmit());

	}
}
