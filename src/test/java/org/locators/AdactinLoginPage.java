package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends BaseClass {

	public AdactinLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(id = "username"), @FindBy(name = "username"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement loginId;

	@FindAll({ @FindBy(id = "password"), @FindBy(name = "password"), @FindBy(xpath = "//input[@type='password']") })

	private WebElement pwd;
	@FindAll({ @FindBy(id = "login"), @FindBy(name = "login"), @FindBy(xpath = "//input[@type='Submit']") })

	private WebElement submitButton;

	@FindAll({ @FindBy(xpath = "//a[text()='Forgot Password?']"), @FindBy(xpath = "//div[@class='login_forgot']") })
	private WebElement forgotPwd;

	@FindAll({ @FindBy(xpath = "//a[text()='New User Register Here']"),
			@FindBy(xpath = "//td[@class='login_register']") })
	private WebElement newRegister;

	public WebElement getLoginId() {
		return loginId;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getForgotPwd() {
		return forgotPwd;
	}

	public WebElement getNewRegister() {
		return newRegister;
	}
	
}
