package org.login.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C extends Base{
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
	}

	@Test(dataProviderClass=DataProviderExample.class,dataProvider="logindatas")
	private void tc1(String email,String pass) throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		fill(txtEmail, email);
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, pass);
		WebElement loginBtn = driver.findElement(By.name("login"));
		btnClick(loginBtn);
		Thread.sleep(3000);
	}
}
