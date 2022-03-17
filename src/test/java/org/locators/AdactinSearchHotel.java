package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchHotel extends BaseClass {

	public AdactinSearchHotel() {
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

	@FindAll({ @FindBy(id = "location"), @FindBy(name = "location") })
	private WebElement location;

	@FindAll({ @FindBy(id = "hotels"), @FindBy(name = "hotels") })
	private WebElement hotel;

	@FindAll({ @FindBy(id = "room_type"), @FindBy(name = "room_type") })
	private WebElement roomType;

	@FindAll({ @FindBy(id = "room_nos"), @FindBy(name = "room_nos") })
	private WebElement roomsReq;

	@FindAll({ @FindBy(id = "datepick_in"), @FindBy(name = "datepick_in"), @FindBy(xpath = "(//input[@class='date_pick'])[1]") })
	private WebElement checkIn;

	@FindAll({ @FindBy(id = "datepick_out"), @FindBy(name = "datepick_out"), @FindBy(xpath = "(//input[@class='date_pick'])[2]") })
	private WebElement checkOut;

	@FindAll({ @FindBy(id = "adult_room"), @FindBy(name = "adult_room") })
	private WebElement adultsPerRoom;

	@FindAll({ @FindBy(id = "child_room"), @FindBy(name = "child_room") })
	private WebElement ChildPerRoom;

	@FindAll({ @FindBy(id = "Submit"), @FindBy(name = "Submit"), @FindBy(xpath = "//input[@type='submit']") })
	private WebElement search;

	@FindAll({ @FindBy(id = "Reset"), @FindBy(name = "Reset"), @FindBy(xpath = "//input[@type='reset']") })
	private WebElement reset;

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

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomsReq() {
		return roomsReq;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
}
