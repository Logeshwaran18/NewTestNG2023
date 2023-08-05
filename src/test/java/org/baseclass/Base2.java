package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base2 {
	public static WebDriver driver;
	public static Actions actions;
	public static Robot robot;
	public static JavascriptExecutor js;
	public static Select select;
	public static File file;
	public static Workbook workbook;
	public static FileInputStream fin;
	public static Sheet sheet;
	public static Row row;
	
	
	
	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	// WebDriver methods.....
	
	public static void launchUrl(String urlName) {
		driver.get(urlName);
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String windowHandle() {
		String parWindowId = driver.getWindowHandle();
		return parWindowId;
	}
	public static Set<String> windowHandles() {
		Set<String> allWindowId = driver.getWindowHandles();
		return allWindowId;
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void launchUrlNavigation(String urlName) {
		driver.navigate().to(urlName);
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	// WebElement methods.........
	
	public static void fill(WebElement element,String userName) {
		element.sendKeys(userName);
	}
	
	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public static void clearValues(WebElement element) {
		element.clear();
	}
	
	public static String printText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static String printAttribute(WebElement element,String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	
	public static String printTagName(WebElement element) {
		String tagName = element.getTagName();
		return tagName;
	}
	
	public static String printCssValue(WebElement element, String value) {
		String cssValue = element.getCssValue(value);
		return cssValue;
	}

	public static boolean displayElement(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	public static boolean enableElement(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public static boolean selectElement(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	
	public static Point printLocation(WebElement element) {
		Point location = element.getLocation();
		return location;
	}
	
	public static Dimension printSize(WebElement element) {
		Dimension size = element.getSize();
		return size;
	}
	
	// Action class methods...........
	
	public static void activateActions() {
		 actions = new Actions(driver);
	}
	
	public static void mouseOver(WebElement target) {
		actions.moveToElement(target).perform();
	}
	
	public static void dragDrop(WebElement source, WebElement target) {
		actions.dragAndDrop(source, target).perform();
	}
	
	public static void mouseRightClick(WebElement target) {
		actions.contextClick(target).perform();
	}
	
	public static void mouseDoubleClick(WebElement element) {
		actions.doubleClick(element).perform();
	}
	
	// Robotclass Methods
	
	public static void activateRobot() throws AWTException {
		robot = new Robot();
	}
	
	public static void controlPress() {
		robot.keyPress(KeyEvent.VK_CONTROL);
	}
	
	public static void controlRelease() {
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public static void tabPress() {
		robot.keyPress(KeyEvent.VK_TAB);
	}

	public static void tabRelease() {
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public static void shiftPress() {
		robot.keyPress(KeyEvent.VK_SHIFT);
	}
	
	public static void shiftRelease() {
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}
	
	public static void downArrowPress() {
		robot.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void downArrowRelease() {
		robot.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void enterPress() {
		robot.keyPress(KeyEvent.VK_ENTER);
	}

	public static void enterRelease() {
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void cPress() {
		robot.keyPress(KeyEvent.VK_C);
	}

	public static void cRelease() {
		robot.keyRelease(KeyEvent.VK_C);
	}

	public static void vPress() {
		robot.keyPress(KeyEvent.VK_V);
	}

	public static void vRelease() {
		robot.keyRelease(KeyEvent.VK_V);
	}

	public static void xPress() {
		robot.keyPress(KeyEvent.VK_X);
	}

	public static void xRelease() {
		robot.keyRelease(KeyEvent.VK_X);
	}

	// JavaScript methods
	
	public static void activateJavaScript() {
		 js =(JavascriptExecutor)driver;
	}
	
	public static void javaScriptEntertext(WebElement element,String textValue) {
		js.executeScript("arguments[0].setAttribute('value','"+ textValue +"')", element);
	}
	
	public static String javaScriptGetText(WebElement element) {
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", element);
		String text =(String)obj;
		return text;
	}
	
	public static void javaScriptBtnClick(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}
	
	public static void ScrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void ScrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public static void highlightText(WebElement element,String color) {
		js.executeScript("arguments[0].setAttribute('style','background:"+ color +"')", element);
	}
	
	// TakesScreenshot methods

	public static void screenShot(String path) throws IOException  {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}
	
	// SwitchToAlert
	
	public static Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}
	
	// SwitchToWindow
	
	public static void switchToWindow() {
		String parId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for(String x:allId) {
			if(!(x.equals(parId))) {
				driver.switchTo().window(x);
			}
		}
	}
	
	//Waits
	// Implict Wait
	public static void implicitWait(long l) {
		driver.manage().timeouts().implicitlyWait(l, TimeUnit.SECONDS);
	}
	
	// Select......
	
	public static void selectByText(WebElement element,String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void selectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement element,int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	
	// DataDriver
	//ExcelRead
	public static void readExcel(String path,String sheetName) throws IOException {
		file = new File(path);
		fin = new FileInputStream(file);
		workbook = new XSSFWorkbook(fin);
		sheet = workbook.getSheet(sheetName);
	}
	public static String getParticularCell(int rownum, int cellnum) {
		row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		String value="";
		if(cellType==1) {
			 value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date date= cell.getDateCellValue();	
			SimpleDateFormat simple =new SimpleDateFormat("dd-MM-yyyy");
			value = simple.format(date);
		}
		else {
			double d = cell.getNumericCellValue();
			long l = (long)d;
			value = String.valueOf(l);
		}
		return value;
	}
	
	//ExcelWrite
	public static void writeExcel(String path,String sheetName) {
	    file = new File(path);
	    workbook = new XSSFWorkbook();
		sheet = workbook.createSheet(sheetName);
	}
	
	public static void createParticularRow(int rownum) {
		row = sheet.createRow(rownum);
	}
	
	public static void createParticularCell(int cellnum,String value) {
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(value);
	}
	
	public static void writeOutputFile() throws IOException {
		FileOutputStream fout = new FileOutputStream(file);
		workbook.write(fout);
	}
	
	// Read Already existing File and create new Sheet[Single excel File create
		// muliplte Sheet]
	// single excel with multiple Sheets
	
	public static void readExcelAndCreateNewSheet(String path, String sheetName) throws IOException {
		file = new File(path);
		fin = new FileInputStream(file);
		workbook = new XSSFWorkbook(fin);
		sheet = workbook.createSheet(sheetName);
	}
	
}
