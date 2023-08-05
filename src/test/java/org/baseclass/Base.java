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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Actions action;
	public static Robot robot;
	public static JavascriptExecutor js;
	public static Select select;
	public static Sheet sheet;
	public static File file;
	public static Workbook workbook;
	public static FileInputStream fin;
	public static FileOutputStream fout;
	public static Row row;
	public static Cell cell;

	public static WebDriver loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver loadFireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}
	public static WebDriver loadEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void fill(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static String PrintAttribute(WebElement element, String attributeName) {

		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	public static String printText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// Actions class methods
	public static void activateActions() {
		action = new Actions(driver);
	}

	public static void mouseHover(WebElement element) {
		action.moveToElement(element).perform();
	}

	public static void dragDrop(WebElement src, WebElement dest) {
		action.dragAndDrop(src, dest).perform();
	}

	public static void mouseDoubleClick(WebElement element) {
		action.doubleClick(element).perform();
	}

	public static void mouseRightClick(WebElement element) {
		action.contextClick(element).perform();
	}

	// Robot class methods
	public static void activateRobot() throws AWTException {
		robot = new Robot();
	}

	public static void contolPress() {
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

	public static void downPress() {
		robot.keyPress(KeyEvent.VK_DOWN);
	}

	public static void downRelease() {
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

	// JavaScriptExecutor methods
	public static void activateJavaScriptExecutor() {
		js = (JavascriptExecutor) driver;
	}

	public static void javaScriptEnterText(WebElement element, String text) {
		js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
	}

	public static String javaScriptGetText(WebElement element) {
		Object o = js.executeScript("return arguments[0].getAttribute('value')", element);
		String text = (String) o;
		return text;
	}

	public static void JavascriptBtnClick(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}

	public static void scrollDown(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void scrollUp(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void highLightsText(WebElement element, String colour) {
		js.executeScript("arguments[0].setAttribute('style','background:" + colour + "')", element);
	}

	// TakesScreenshot methods
	public static void screenShot(String path) throws IOException  {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}

	// SwithtoAlert
	public static Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;

	}

	// SwitchToWindows
	public static void switchToWindow() {
		String parId = driver.getWindowHandle();

		Set<String> allId = driver.getWindowHandles();

		for (String x : allId) {
			if (!parId.equals(x)) {
				driver.switchTo().window(x);
			}
		}
	}

	// Waits
	// Implicit Wait
	public static void implictWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	// Select
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
	
	// DataDrivern Excel method
	// ExcelRead
	public static void readExcel(String fileLocation, String sheetName) throws IOException {
		file = new File(fileLocation);
		fin = new FileInputStream(file); 
		workbook = new XSSFWorkbook(fin);
		sheet = workbook.getSheet(sheetName);
	}

	public static int getNumOfRows() {
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		return physicalNumberOfRows;
	}

	public static int getNumOfCells(int rowNo) {
		Row r = sheet.getRow(0);
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		return physicalNumberOfCells;
	}

	public static String getParticularCell(int rowNum, int cellNum) {

		String value;
		Row r = sheet.getRow(rowNum);

		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		if (cellType == 1) {
			value = c.getStringCellValue();
		

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();

			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			value = sim.format(d);

		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);
		}
		return value;
	}

	// Excel Write
	public static void writeExcel(String fileLocation, String sheetName) {
		file = new File(fileLocation);
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet(sheetName);
	}

	public static void createParticularRow(int rowNum) {
		row = sheet.createRow(rowNum);
	}

	public static void createParticularCell(int cellNum, String value) {
		cell = row.createCell(cellNum);
		cell.setCellValue(value);
	}

	public static void writeOutputExcel() throws IOException {
		fout = new FileOutputStream(file);
		workbook.write(fout);
	}

	// Read Already existing File and create new Sheet[Single excel File create
	// muliplte Sheet]

	public static void readExcelAndCreateNewSheet(String fileLocation, String newSheetName) throws IOException {
		file = new File(fileLocation);
		fin = new FileInputStream(file);
		workbook = new XSSFWorkbook(fin);
		sheet = workbook.createSheet(newSheetName);	
	}	
	
}
