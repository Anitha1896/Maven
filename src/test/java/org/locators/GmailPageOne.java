package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPageOne  extends BaseClass{
public GmailPageOne() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@id='identifierId']")
private WebElement user;


@FindBy(xpath="//span[text()='Next']")
private WebElement next;


public WebElement getUser() {
	return user;
}


public WebElement getNext() {
	return next;
}
}
