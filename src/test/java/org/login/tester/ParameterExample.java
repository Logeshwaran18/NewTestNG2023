package org.login.tester;

import java.util.Date;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample extends Base {
	
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Parameters({ "username", "password" })
	@Test
	private void tc1(@Optional("praveen") String email, @Optional("boss") String pass) {
		launchUrl("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		fill(txtEmail, email);

		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, pass);

		WebElement loginBtn = driver.findElement(By.name("login"));
		btnClick(loginBtn);

	}
}
