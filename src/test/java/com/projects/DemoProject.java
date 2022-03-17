package com.projects;


import java.io.IOException;

import org.baseclass.BaseClass;
import org.locators.FacebookLoginPOJO;

public class DemoProject extends BaseClass {

	public static void main(String[] args) throws IOException {

		launchChromeDriver();
		launchURL("https://en-gb.facebook.com/");
		implicitWait(40);
		FacebookLoginPOJO fBPOM = new FacebookLoginPOJO();

		sendUserText(fBPOM.getEmail(), readExcel("TestData", "Facebook Login", 1, 1));
		sendUserTextAction(fBPOM.getPwd(), readExcel("TestData", "Facebook Login", 1, 2));
//		clickButton(fBPOM.getLoginButton().get(0));
		refreshPage();
		sendUserText(fBPOM.getEmail(), readExcel("TestData", "Facebook Login", 2, 1));
		sendUserTextAction(fBPOM.getPwd(), readExcel("TestData", "Facebook Login", 2, 2));
		
		
		closeTab();

	}
}