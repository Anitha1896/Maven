package org.locators;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;;

public class AdactinBookingConfirmation extends BaseClass {

	public AdactinBookingConfirmation() {
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

	@FindAll({ @FindBy(id = "hotel_name"), @FindBy(name = "hotel_name") })
	private WebElement hotelName;

	@FindAll({ @FindBy(id = "location"), @FindBy(name = "location") })
	private WebElement location;

	@FindAll({ @FindBy(id = "room_type"), @FindBy(name = "room_type") })
	private WebElement roomType;

	@FindAll({ @FindBy(id = "arrival_date"), @FindBy(name = "arrival_date") })
	private WebElement arrDate;

	@FindAll({ @FindBy(id = "departure_date"), @FindBy(name = "departure_date") })
	private WebElement depDate;

	@FindAll({ @FindBy(id = "total_rooms"), @FindBy(name = "total_rooms") })
	private WebElement totalRooms;

	@FindAll({ @FindBy(id = "adults_room"), @FindBy(name = "adults_room") })
	private WebElement adultsPerRoom;

	@FindAll({ @FindBy(id = "children_room"), @FindBy(name = "children_room") })
	private WebElement childPerRoom;

	@FindAll({ @FindBy(id = "price_night"), @FindBy(name = "price_night") })
	private WebElement pricePerNight;

	@FindAll({ @FindBy(id = "total_price"), @FindBy(name = "total_price") })
	private WebElement totalPrice;

	@FindAll({ @FindBy(id = "gst"), @FindBy(name = "gst") })
	private WebElement gST;

	@FindAll({ @FindBy(id = "final_price"), @FindBy(name = "final_price") })
	private WebElement finalPrice;

	@FindAll({ @FindBy(id = "first_name"), @FindBy(name = "first_name") })
	private WebElement firstName;

	@FindAll({ @FindBy(id = "last_name"), @FindBy(name = "last_name") })
	private WebElement lastName;

	@FindAll({ @FindBy(id = "address"), @FindBy(name = "address") })
	private WebElement address;

	@FindAll({ @FindBy(id = "order_no"), @FindBy(name = "order_no") })
	private WebElement orderNo;

	@FindAll({ @FindBy(id = "search_hotel"), @FindBy(name = "search_hotel"),
			@FindBy(xpath = "//input[@value='Search Hotel']") })
	private WebElement search_Hotel;

	@FindAll({ @FindBy(id = "my_itinerary"), @FindBy(name = "my_itinerary"),
			@FindBy(xpath = "//input[@value='My Itinerary']") })
	private WebElement myItinerary;

	@FindAll({ @FindBy(id = "logout"), @FindBy(name = "logout"), @FindBy(xpath = "//input[@value='Logout']") })
	private WebElement logoutEnd;
	
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

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getArrDate() {
		return arrDate;
	}

	public WebElement getDepDate() {
		return depDate;
	}

	public WebElement getTotalRooms() {
		return totalRooms;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getPricePerNight() {
		return pricePerNight;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getgST() {
		return gST;
	}

	public WebElement getFinalPrice() {
		return finalPrice;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getSearch_Hotel() {
		return search_Hotel;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogoutEnd() {
		return logoutEnd;
	}

	
}
