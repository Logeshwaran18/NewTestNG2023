package org.hackerrank;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apple extends Base {
	@Test
	private void tc1() throws AWTException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");

		WebElement alertBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		alertBtn.click();
		WebElement from = driver.findElement(By.xpath("(//input[@role='searchbox'])[1]"));
		from.sendKeys("Salem");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement to = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		to.sendKeys("chennai");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement generalbtn = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c66-12 ui-dropdown')]"));
		generalbtn.click();

		WebElement table = driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> rows = table.findElements(By.tagName("p-dropdownitem"));
		WebElement data = rows.get(0).findElement(By.tagName("li"));
		data.click();

		WebElement Date = driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c59-10 ui-inputtext')]"));
		Date.click();

		WebElement month = driver
				.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c59-10']"));
		month.click();
		WebElement table1 = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c59-10']"));
		List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
		List<WebElement> datas = rows1.get(4).findElements(By.tagName("td"));
		datas.get(4).click();
		
		WebElement classes = driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c66-11 ui-dropdown')]"));
		classes.click();
		WebElement classTable = driver.findElement(By.xpath("//div[@class='ui-dropdown-items-wrapper ng-tns-c66-11']"));
		List<WebElement> classRows = classTable.findElements(By.tagName("p-dropdownitem"));
		WebElement classData = classRows.get(5).findElement(By.tagName("li"));
		classData.click();
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@class='search_btn train_Search']"));
		searchBtn.click();
		
		WebElement journeyTable = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content ng-tns-c76-30']"));		
		WebElement journeyrow = journeyTable.findElement(By.tagName("tr"));
		List<WebElement>  journeyData= journeyrow.findElements(By.tagName("td"));
		journeyData.get(0).click();
		
		WebElement depatureTable = driver.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content ng-tns-c76-32']"));
		List<WebElement> depatureData = depatureTable.findElements(By.tagName("td"));
		depatureData.get(2).click();
		
		WebElement trainTable = driver.findElement(By.xpath("(//div[@class='form-group no-pad col-xs-12 bull-back border-all'])[3]"));
		WebElement trainRow = trainTable.findElement(By.xpath("(//div[@class='white-back col-xs-12 ng-star-inserted'])[3]"));
		List<WebElement> trainData = trainRow.findElements(By.tagName("td"));
		trainData.get(1).click();
		List<WebElement> trainBook = trainTable.findElements(By.tagName("button"));
		trainBook.get(1).click();
		WebElement agree = driver.findElement(By.xpath("//span[text()='I Agree']"));
		agree.click();   
		
		WebElement yesBtn = driver.findElement(By.xpath("//span[text()='Yes'"));
		yesBtn.click();
		
		
		
	}

}
