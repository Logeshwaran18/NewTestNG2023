package org.login.tester;

import org.baseclass.Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Base{

	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
}
