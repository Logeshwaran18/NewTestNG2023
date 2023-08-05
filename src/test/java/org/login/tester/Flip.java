package org.login.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flip extends Base {
	
	
	@Test(dataProviderClass=Flip.class,dataProvider="SearchNames")
	private void tc1(String names) {
		loadBrowser();
		maxWindow();
		implictWait(10);
		launchUrl("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys(names);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@DataProvider(name="SearchNames")
	public Object[][] data() {
		return new Object[][] {
			{"Iphone"},{"Samsung"},{"Chimney"}
		};

	}
	
}
