package org.pojo;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPage extends Base {
	public HotelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="select#location")
	private WebElement location;
	
	@FindBy(css="select#hotels")
	private WebElement hotel;
	
	@FindBy(css="select#room_type")
	private WebElement roomType;
	
	@FindBy(css="select#room_nos")
	private WebElement NumOfRooms;
	
	@FindBy(css="select#adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(css="select#child_room")
	private WebElement childPerRoom;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumOfRooms() {
		return NumOfRooms;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	
	
}
