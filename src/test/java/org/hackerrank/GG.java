package org.hackerrank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(org.hackerrank.Listeners.class)
public class GG {
	private String st1;
	private String st2;
	
	
	public GG(String st1, String st2) {
		
	this.st1=st1;
	this.st2=st2;
	
	}

	@Test
	public void insert() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(3000);
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
	}
	
	@Test
	public void select() {
		System.out.println(st1+" : "+st2);
		System.out.println("selecting demo data");
	
	}
	
	@Test
	public void update() {
		System.out.println(st1+" : "+st2);
		System.out.println("updating demo data");
		System.out.println(Thread.currentThread().getId());

//		Assert.assertTrue(false);
	}
	
	@Test
	public void delete() {
		System.out.println("deleting demo data");
		Assert.assertTrue(false);
	}
	

	
	
}
