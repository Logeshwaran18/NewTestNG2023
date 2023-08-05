package org.hackerrank;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FF extends Base {

	public static void main(String[] args) {

		loadBrowser();
		maxWindow();
		// http://the-internet.herokuapp.com/challenging_dom
		launchUrl("http://the-internet.herokuapp.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Context Menu']"));
	}

}
