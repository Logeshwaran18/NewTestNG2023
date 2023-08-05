package org.task.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgQ7 extends Base {
	public WebDriver d;

	@Parameters("browser")
	@Test
	private void tc1(String name) throws InterruptedException {
		if (name.equals("chrome")) {
			d = loadBrowser();
		} else if (name.equals("firefox")) {
			d = loadFireFoxBrowser();
		} else {
			d = loadEdgeBrowser();
		}
		// driver.get("https://www.flipkart.com/account/login");
		launchUrl("https://www.flipkart.com/account/login");

		WebElement email = d.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		fill(email, "logesh@gmail.com");
		// email.sendKeys("logesh@gmail.com");

		WebElement password = d.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		fill(password, "123456");
		// password.sendKeys("123456");

	}
}
