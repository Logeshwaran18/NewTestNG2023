package org.login.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A extends Base{
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();

	}
	@Test
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		
		
		Assert.assertTrue(pageTitle().contains("Facebook"), "check the titile");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		fill(txtEmail, "logesh");
		Assert.assertEquals(txtEmail.getAttribute("value"), "logesh","check the user name");
		driver.navigate().refresh();
		WebElement txtEmail1 = driver.findElement(By.id("email"));
		fill(txtEmail1, "logesh");
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, "12345");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		btnClick(loginBtn);
		
		

	}

}
