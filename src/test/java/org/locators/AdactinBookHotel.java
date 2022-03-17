package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookHotel extends BaseClass {

	public AdactinBookHotel() {
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

	@FindAll({ @FindBy(id = "first_name"), @FindBy(name = "first_name")})
	private WebElement fName;

	@FindAll({ @FindBy(id = "last_name"), @FindBy(name = "last_name")})
	private WebElement lName;

	@FindAll({ @FindBy(id = "address"), @FindBy(name = "address"), @FindBy(xpath = "//textarea[@class='txtarea']") })
	private WebElement addr;

	@FindAll({ @FindBy(id = "cc_num"), @FindBy(name = "cc_num") })
	private WebElement creditCardNo;

	@FindAll({ @FindBy(id = "cc_type"), @FindBy(name = "cc_type") })
	private WebElement ccType;

	@FindAll({ @FindBy(id = "cc_exp_month"), @FindBy(name = "cc_exp_month")})
	private WebElement expMonth;

	@FindAll({ @FindBy(id = "cc_exp_year"), @FindBy(name = "cc_exp_year")})
	private WebElement expYear;

	@FindAll({ @FindBy(id = "cc_cvv"), @FindBy(name = "cc_cvv")})
	private WebElement cvv;

	@FindAll({ @FindBy(id = "book_now"), @FindBy(name = "book_now"), @FindBy(xpath = "//input[@value='Book Now']")})
	private WebElement bookNow;

	@FindAll({ @FindBy(id = "cancel"), @FindBy(name = "cancel"), @FindBy(xpath = "//input[@value='Cancel']") })
	private WebElement cancel;

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

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
}
