package com.projects;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinDataDrivenFrameWork extends BaseClass {
public static void main(String[] args) throws IOException {
	launchChromeDriver();
	launchURL("http://adactinhotelapp.com/");
	maxWindow();

	implicitWait(10000);
	WebElement userId = driver.findElement(By.id("username"));
	jsSendUserText(readExcel("TestData", "Adactin", 1, 1), userId);

	WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
	jsSendUserText(readExcel("TestData", "Adactin", 1, 2), pwd);

	WebElement loginButton = driver.findElement(By.id("login"));
	jsClickButton(loginButton);

	WebElement location = driver.findElement(By.id("location"));
	selectByIndex(location, 1);

	WebElement hotel = driver.findElement(By.id("hotels"));
	selectByValue(hotel, "Hotel Sunshine");

	WebElement roomType = driver.findElement(By.id("room_type"));
	selectByVisibleText(roomType, "Standard");

	WebElement roomNo = driver.findElement(By.id("room_nos"));
	selectByIndex(roomNo, 1);

	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	jsSendUserText(readExcel("TestData", "Adactin", 1, 3), checkIn);

	WebElement checkOut = driver.findElement(By.id("datepick_out"));
	sendUserText(checkOut, readExcel("TestData", "Adactin", 1, 4));

	WebElement adultRoom = driver.findElement(By.id("adult_room"));
	selectByVisibleText(adultRoom, "1 - One");

	WebElement childRoom = driver.findElement(By.id("child_room"));
	selectByValue(childRoom, "0");

	WebElement searchButton = driver.findElement(By.id("Submit"));
	clickButtonAction(searchButton);

	WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
	clickButton(radioButton);

	WebElement continueButton = driver.findElement(By.id("continue"));
	clickButton(continueButton);

	WebElement fName = driver.findElement(By.id("first_name"));
	sendUserText(fName, readExcel("TestData", "Adactin", 1, 5));

	WebElement lName = driver.findElement(By.id("last_name"));
	sendUserText(lName, readExcel("TestData", "Adactin", 1, 6));

	WebElement address = driver.findElement(By.id("address"));
	sendUserText(address, readExcel("TestData", "Adactin", 1, 7));

	WebElement creditCard = driver.findElement(By.id("cc_num"));
	sendUserText(creditCard, readExcel("TestData", "Adactin", 1, 8));

	WebElement cCType = driver.findElement(By.id("cc_type"));
	selectByValue(cCType, "AMEX");

	WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
	selectByVisibleText(expMonth, "January");

	WebElement expYear = driver.findElement(By.id("cc_exp_year"));
	selectByValue(expYear, "2022");

	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	jsSendUserText(readExcel("TestData", "Adactin", 1, 9), cvv);

	WebElement bookButton = driver.findElement(By.id("book_now"));
	clickButton(bookButton);
	
	WebElement orderNo = driver.findElement(By.id("order_no"));
	waitForVisibilityOfElementWebDriver(10000, orderNo);
	
	jsScrollDown(orderNo);
	
	writeToExistingRow("TestData", "Adactin", 0, 10, "Order No");
	writeToExistingRow("TestData", "Adactin", 1, 10, jsGetAttributeValue(orderNo));
}
}
