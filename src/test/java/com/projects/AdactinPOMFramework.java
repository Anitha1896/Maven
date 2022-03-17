package com.projects;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.locators.AdactinBookHotel;
import org.locators.AdactinBookingConfirmation;
import org.locators.AdactinLoginPage;
import org.locators.AdactinSearchHotel;
import org.locators.AdactinSelectHotel;

public class AdactinPOMFramework extends BaseClass {
	public static void main(String[] args) throws IOException {

		launchChromeDriver();
		launchURL("http://adactinhotelapp.com/");
		maxWindow();

		implicitWait(10000);
		AdactinLoginPage a1=new AdactinLoginPage();
		jsSendUserText(readExcel("TestData", "Adactin", 1, 1), a1.getLoginId());
		jsSendUserText(readExcel("TestData", "Adactin", 1, 2), a1.getPwd());
		jsClickButton(a1.getSubmitButton());

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
		
		AdactinSelectHotel a3=new AdactinSelectHotel();
		clickButton(a3.getSelectRadioBtn());
		clickButton(a3.getContinueBtn());

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

		AdactinBookingConfirmation a5= new AdactinBookingConfirmation();
		waitForVisibilityOfElementWebDriver(10000, a5.getOrderNo());
		takeSingleScreenShot("AdactinOrderNo_POM.Sc1");
		jsScrollDown(a5.getOrderNo());
		takeSingleScreenShot("AdactinOrderNo_POM.Sc2");
		writeToExistingRow("TestData", "Adactin", 1, 10, jsGetAttributeValue(a5.getOrderNo()));		
		
		System.out.println(getAttributeValue(a5.getOrderNo(), "value"));
	}
}
