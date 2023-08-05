package org.pojo;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPage extends Base{
	public HotelLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[id=username]")
	private WebElement userName;
	
	@FindBy(css="input#password")
	private WebElement pass;

	@FindBy(css="input#login")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}
