package org.pojo;

import java.util.List;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPojo extends Base{
	
	public RegPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[@for='gender-radio-1']")
	private WebElement genderBtn;
	
	@FindBy(id="userNumber")
	private WebElement mobile;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement date;
	
	@FindBy(xpath="//div[text()='24']")
	private WebElement day;
	
	@FindBy(id="subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	private List<WebElement> hobies;
	
	@FindBy(id="currentAddress")
	private WebElement address;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getGenderBtn() {
		return genderBtn;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getSubject() {
		return subject;
	}

	public List<WebElement> getHobies() {
		return hobies;
	}

	public WebElement getAddress() {
		return address;
	}

	
	
	
}
