package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPageTwo extends BaseClass {
public WebElement getPass() {
		return pass;
	}
public GmailPageTwo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='password']")
private WebElement pass;
}
