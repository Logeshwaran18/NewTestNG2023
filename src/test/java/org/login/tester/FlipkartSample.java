package org.login.tester;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipkartSample extends Base{
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}

	@Test(dataProviderClass=FlipkartSample.class,dataProvider="SearchData")
	private void tc1(String product) throws InterruptedException {
		launchUrl("https://www.flipkart.com/");
		implictWait(10);
		
		WebElement wrong = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClick(wrong);
		
		WebElement productName = driver.findElement(By.name("q"));
		fill(productName, product);
		
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		btnClick(search);
		Thread.sleep(5000);
	}
	
	
	@DataProvider(name="SearchData")
	private Object[][] data() {
		return new Object[][] {
			{"book"},
			{"shoes"},
			{"watches"}
			
		};
	}

}
