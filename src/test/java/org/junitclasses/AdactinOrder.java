package org.junitclasses;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.AdactinBookHotel;
import org.locators.AdactinBookingConfirmation;
import org.locators.AdactinLoginPage;
import org.locators.AdactinSearchHotel;
import org.locators.AdactinSelectHotel;

public class AdactinOrder extends BaseClass {
	@BeforeClass
	public static void befCls() {
		launchChromeDriver();
		launchURL("http://adactinhotelapp.com/");
		maxWindow();
		implicitWait(10000);
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

	@Test
	public void tc1() throws IOException {
		AdactinLoginPage a1 = new AdactinLoginPage();
		jsSendUserText("anitha1896", a1.getLoginId());
		jsSendUserText("Anitha", a1.getPwd());
		jsClickButton(a1.getSubmitButton());
	}
	
	@Test
	public void tc2() throws IOException {
		AdactinSearchHotel a2= new AdactinSearchHotel();
		selectByIndex(a2.getLocation(), 1);
		selectByValue(a2.getHotel(), "Hotel Sunshine");
		selectByVisibleText(a2.getRoomType(), "Standard");
		selectByIndex(a2.getRoomsReq(), 1);
		jsSendUserText("28/12/2021", a2.getCheckIn());
		sendUserText(a2.getCheckOut(), "30/12/2021");
		selectByVisibleText(a2.getAdultsPerRoom(), "1 - One");
		selectByValue(a2.getChildPerRoom(), "0");
		clickButtonAction(a2.getSearch());
	}
	
	@Test
	public void tc3() {
		AdactinSelectHotel a3=new AdactinSelectHotel();
		clickButton(a3.getSelectRadioBtn());
		clickButton(a3.getContinueBtn());
	}
	
	@Test
	public void tc4() throws IOException {
		AdactinBookHotel a4= new AdactinBookHotel();
		sendUserText(a4.getfName(), "Ani");
		sendUserText(a4.getlName(), "S");
		sendUserText(a4.getAddr(), "Chennai");
		sendUserText(a4.getCreditCardNo(), "1234567890123456");
		selectByValue(a4.getCcType(), "AMEX");
		selectByVisibleText(a4.getExpMonth(), "January");
		selectByValue(a4.getExpYear(), "2022");
		jsSendUserText("3642", a4.getCvv());
		clickButton(a4.getBookNow());

	}
	@Test
	public void tc5() throws IOException {
		AdactinBookingConfirmation a5= new AdactinBookingConfirmation();
		waitForVisibilityOfElementWebDriver(10000, a5.getOrderNo());
		String orderNo = getAttributeValue(a5.getOrderNo(), "value");
		System.out.println("Order No:"+orderNo);
	}
}
