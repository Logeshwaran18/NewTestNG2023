package org.pojo;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistractionPojo extends Base{
	public RegistractionPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement email;
		
	@FindBy(xpath="//label[@for='gender-radio-1']")
	private WebElement gender;
	
	@FindBy(id="userNumber")
	private WebElement mobile;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement month;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement year;
	
	@FindBy(xpath="//div[text()='19']")
	private WebElement date;
	
	@FindBy(id="subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath="//label[@for='hobbies-checkbox-3']")
	private WebElement hobbies;
	
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

	public WebElement getGender() {
		return gender;
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

	public WebElement getYear() {
		return year;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getAddress() {
		return address;
	}

}
