package org.locators;


import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPOJO extends BaseClass {
	// 1.Create non parameterized constructor
	public FacebookLoginPOJO() {
		PageFactory.initElements(driver, this);
	}

	// 2.Create private WebElements
	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement email;

	@FindAll({ @FindBy(name = "pass"), @FindBy(id = "pass")	})
	private WebElement pwd;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
