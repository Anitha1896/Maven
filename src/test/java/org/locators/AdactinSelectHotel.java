package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotel extends BaseClass {

	public AdactinSelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Search Hotel']")
	private WebElement searchHotel;

	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement chgPwd;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement booked;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	@FindAll({ @FindBy(name = "radiobutton_0"), @FindBy(id = "radiobutton_0"), @FindBy(xpath = "//input[@type='radio']") })
	private WebElement selectRadioBtn;

	@FindAll({ @FindBy(id = "continue"), @FindBy(name = "continue"), @FindBy(xpath = "//input[@type='submit']"),
			@FindBy(xpath = "//input[@value='Continue']") })
	private WebElement continueBtn;

	@FindAll({ @FindBy(id = "cancel"), @FindBy(name = "cancel"), @FindBy(xpath = "//input[@type='button']"),
			@FindBy(xpath = "//input[@value='Cancel']") })
	private WebElement cancelBtn;

	public WebElement getSearchHotel() {
		return searchHotel;
	}

	public WebElement getChgPwd() {
		return chgPwd;
	}

	public WebElement getBooked() {
		return booked;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSelectRadioBtn() {
		return selectRadioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

}
