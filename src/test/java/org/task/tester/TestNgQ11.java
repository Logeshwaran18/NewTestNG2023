package org.task.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ11 extends Base{
	
	@BeforeClass(groups="smoke")
	private void launchBrowser() {
		loadBrowser();
		maxWindow();

	}
	@Test(groups="smoke")
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		fill(txtEmail, "logesh");
		
	}
	@Test(groups="smoke")
	private void tc2() {
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, "123456");

	}

}
