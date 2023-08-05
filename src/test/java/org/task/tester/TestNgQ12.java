package org.task.tester;

import java.awt.AWTException;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ12 extends Base {
	@BeforeClass(groups = "smoke")
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}

	@Test(groups = "smoke")
	private void tc1() {
		launchUrl("https://demoqa.com/automation-practice-form");

		WebElement firstName = driver.findElement(By.id("firstName"));
		fill(firstName, "logesh");
	}

	@Test
	private void tc2() {
		WebElement lastName = driver.findElement(By.id("lastName"));
		fill(lastName, "waran");
	}

	@Test
	private void tc3() {
		WebElement email = driver.findElement(By.id("userEmail"));
		fill(email, "logesh@gmail.com");
	}

	@Test(groups = "smoke")
	private void tc4() {
		WebElement mobileNo = driver.findElement(By.id("userNumber"));
		fill(mobileNo, "9629930820");
	}

	@Test
	private void tc5() throws AWTException {
		WebElement subject = driver.findElement(By.id("subjectsInput"));
		fill(subject, "maths");
		activateRobot();
		enterPress();
		enterRelease();
	}

	@Test(groups = "smoke")
	private void tc6() {
		WebElement address = driver.findElement(By.id("currentAddress"));
		fill(address, "Salem");
	}

}
