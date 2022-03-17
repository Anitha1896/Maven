package org.testngclasses;

import org.baseclass.BaseClass;
import org.locators.GmailPageOne;
import org.locators.GmailPageTwo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailDataProvider extends BaseClass {

	@DataProvider(name="Authentication")
	public Object[][] credentials() {
		return new Object[][] {
		{"anitha@gmail.com",532876383l},
		{"maria@gmail.com","hfg863876"}
		};
}

	@Test(dataProvider="Authentication")
	private void test(Object id,Object pass) {
		launchURL("https://mail.google.com/");
		
		implicitWait(30);
		GmailPageOne one = new GmailPageOne();
		sendUserText(one.getUser(), id.toString());
		clickButton(one.getNext());
		
//		GmailPageTwo two= new GmailPageTwo();
//		sendUserText(two.getPass(), pass.toString());
	}

@BeforeClass
private void accessWebPage() {
	launchEdgeDriver();
	
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

