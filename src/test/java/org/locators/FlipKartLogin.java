package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlipKartLogin extends BaseClass {

	public FlipKartLogin() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserId() {
		return userId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindAll({
		@FindBy(xpath="(//input[@type='text'])[2]"),
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	})
	private WebElement userId;
	
	@FindAll({
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement password;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement loginButton;
}
