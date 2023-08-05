package org.pojo;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPojo extends Base{
	
	public FlipkartLoginPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement txtEmail;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginBtn;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
