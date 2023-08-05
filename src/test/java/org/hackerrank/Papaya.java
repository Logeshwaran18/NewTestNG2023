package org.hackerrank;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Papaya {

	@Test
	private void tc1() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement x : links) {
			String text = x.getAttribute("href");

			URL u = new URL(text);
			URLConnection open = u.openConnection();
			HttpURLConnection h = (HttpURLConnection) open;
			int code = h.getResponseCode();

			if (!(code == 200)) {
				System.out.println(code + " : " + text);
			}

		}
	}
}
