package org.testngclasses;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.locators.AdactinBookHotel;
import org.locators.AdactinBookingConfirmation;
import org.locators.AdactinLoginPage;
import org.locators.AdactinSearchHotel;
import org.locators.AdactinSelectHotel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinOrder extends BaseClass {
	@BeforeClass
	private void befCls() {
		launchChromeDriver();
		launchURL("http://adactinhotelapp.com/");
		maxWindow();
		implicitWait(10000);
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
	private void tc1() throws IOException {
		AdactinLoginPage a1 = new AdactinLoginPage();
		jsSendUserText(readExcel("TestData", "Adactin", 1, 1), a1.getLoginId());
		jsSendUserText(readExcel("TestData", "Adactin", 1, 2), a1.getPwd());
		jsClickButton(a1.getSubmitButton());
	}
	
	@Test
	private void tc2() throws IOException {
		AdactinSearchHotel a2= new AdactinSearchHotel();
		selectByIndex(a2.getLocation(), 1);
		selectByValue(a2.getHotel(), "Hotel Sunshine");
		selectByVisibleText(a2.getRoomType(), "Standard");
		selectByIndex(a2.getRoomsReq(), 1);
		jsSendUserText(readExcel("TestData", "Adactin", 1, 3), a2.getCheckIn());
		sendUserText(a2.getCheckOut(), readExcel("TestData", "Adactin", 1, 4));
		selectByVisibleText(a2.getAdultsPerRoom(), "1 - One");
		selectByValue(a2.getChildPerRoom(), "0");
		clickButtonAction(a2.getSearch());
	}
	
	@Test
	private void tc3() {
		AdactinSelectHotel a3=new AdactinSelectHotel();
		clickButton(a3.getSelectRadioBtn());
		clickButton(a3.getContinueBtn());
	}
	
	@Test
	private void tc4() throws IOException {
		AdactinBookHotel a4= new AdactinBookHotel();
		sendUserText(a4.getfName(), readExcel("TestData", "Adactin", 1, 5));
		sendUserText(a4.getlName(), readExcel("TestData", "Adactin", 1, 6));
		sendUserText(a4.getAddr(), readExcel("TestData", "Adactin", 1, 7));
		sendUserText(a4.getCreditCardNo(), readExcel("TestData", "Adactin", 1, 8));
		selectByValue(a4.getCcType(), "AMEX");
		selectByVisibleText(a4.getExpMonth(), "January");
		selectByValue(a4.getExpYear(), "2022");
		jsSendUserText(readExcel("TestData", "Adactin", 1, 9), a4.getCvv());
		clickButton(a4.getBookNow());

	}
	@Test
	private void tc5() throws IOException {
		AdactinBookingConfirmation a5= new AdactinBookingConfirmation();
		waitForVisibilityOfElementWebDriver(10000, a5.getOrderNo());
		System.out.println("Order No:"+getAttributeValue(a5.getOrderNo(), "value"));
	}
}
