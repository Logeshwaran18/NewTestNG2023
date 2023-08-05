package org.task.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgQ14 extends Base {

	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}
	
	@Parameters("userEmail")
	@Test()
	private void tc1(String email) {
		launchUrl("https://mail.google.com/");
		WebElement txtemail = driver.findElement(By.id("identifierId"));
		fill(txtemail, email);

		WebElement nextBtn = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		btnClick(nextBtn);
	
	}
	

}
