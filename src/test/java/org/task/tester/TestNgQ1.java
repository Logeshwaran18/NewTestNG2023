package org.task.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ1 extends Base {
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}

	@Test(dataProviderClass=StoringDatas.class,dataProvider="FaceBookLogin")
	private void tc1(String email,String pass) {
		
		launchUrl("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		fill(txtEmail, email);
		
		Assert.assertTrue(txtEmail.getAttribute("value").equals("logesh"), "Check the UserName");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, pass);
		
		Assert.assertEquals(txtPass.getAttribute("value"), "123456","Check the UserPassword");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		btnClick(loginBtn);
		
	}
}

