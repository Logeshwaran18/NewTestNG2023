package org.task.tester;

import java.awt.AWTException;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ10 extends Base{
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}
	@Test
	private void tc1() {
		launchUrl("https://demoqa.com/automation-practice-form");
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		fill(firstName, "logesh");
		Assert.assertEquals(PrintAttribute(firstName, "value"), "logesh","check the username");
	}
	@Test
	private void tc2() {
		WebElement lastName = driver.findElement(By.id("lastName"));
		fill(lastName, "waran");
		Assert.assertEquals(PrintAttribute(lastName, "value"), "wara","check the lastname");
	}
	@Test
	private void tc3() { 
		WebElement email = driver.findElement(By.id("userEmail"));
		fill(email, "logesh@gmail.com");
		Assert.assertEquals(PrintAttribute(email, "value"), "logesh@gmail.com","check the email");
	}
	@Test
	private void tc4() {
		WebElement mobileNo = driver.findElement(By.id("userNumber"));
		fill(mobileNo, "9629930820");
		Assert.assertEquals(PrintAttribute(mobileNo, "value"), "9629930820","check the mobileNum");
	}
	@Test
	private void tc5() throws AWTException {
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		fill(subject, "maths");
		activateRobot();
		enterPress();
		enterRelease();
	}
	@Test
	private void tc6() {
		WebElement address = driver.findElement(By.id("currentAddress"));
		fill(address, "Salem");
		Assert.assertEquals(PrintAttribute(address, "value"), "Salem","check the Address");
	}
}
