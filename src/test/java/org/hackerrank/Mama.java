package org.hackerrank;

import org.baseclass.Base;
import org.openqa.selenium.support.ui.Select;
import org.pojo.HotelBookingPage;
import org.pojo.HotelLoginPage;
import org.testng.annotations.Test;



public class Mama extends Base {

	@Test
	private void tc1() {
		loadBrowser();
		driver.get("http://www.adactin.com/HotelApp/");
		HotelLoginPage h = new HotelLoginPage();
		h.getUserName().sendKeys("logeshwaranP");
		h.getPass().sendKeys("12345678");
		h.getLoginBtn().click();
		
		HotelBookingPage hb = new HotelBookingPage();
		
		Select s1 = new Select(hb.getLocation());
		s1.selectByVisibleText("London");
		
		Select s2 = new Select(hb.getHotel());
		s2.selectByVisibleText("Hotel Creek");
	}
}
