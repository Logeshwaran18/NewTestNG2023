package org.hackerrank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy {
	@DataProvider(name="loginPage")
	private Object[][] data() {
		return new Object[][] {
			{"9629930","123456"},
			{"9629930060","9629"},
			{"sam","96299300"},
			{"9629930060","96299300"},
		};

	}
	
	@Test(dataProviderClass=Dummy.class,dataProvider="loginPage")
	private void tc1(String email,String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(email);
		SoftAssert s = new SoftAssert();
		s.assertEquals(username.getAttribute("value"), "hai","check userName");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		Assert.assertEquals(pass.getAttribute("value"), password,"check password");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		s.assertAll();
	}

}
