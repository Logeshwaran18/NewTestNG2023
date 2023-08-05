package org.task.tester;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.baseclass.Base;
import org.openqa.selenium.support.ui.Select;
import org.pojo.RegistractionPojo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ5 extends Base{
	
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}
	
	@Test
	private void tc1() throws AWTException, IOException  {
		
		launchUrl("https://demoqa.com/automation-practice-form");
				
		RegistractionPojo rp = new RegistractionPojo();
		readExcel("E:\\eclipse_workspace\\TestNGProject\\ExcelSheetsTestNg\\TestDatasss.xlsx", "A1");
		
		fill(rp.getFirstName(),getParticularCell(1, 0));
		Assert.assertEquals(rp.getFirstName().getAttribute("value"), "logesh","check the FirstName");
		
		fill(rp.getLastName(), getParticularCell(1, 1));
		Assert.assertEquals(rp.getLastName().getAttribute("value"), "waran","check the lastName");
		
		fill(rp.getEmail(), getParticularCell(1, 2));
		Assert.assertEquals(rp.getEmail().getAttribute("value"), "logesh@gmail.com","check the Email");
		
		btnClick(rp.getGender());
		fill(rp.getMobile(), getParticularCell(1, 3));
		Assert.assertEquals(rp.getMobile().getAttribute("value"), "9629930060","check the MobileNumber");
		
		btnClick(rp.getDob());
		Select s = new Select(rp.getMonth());
		s.selectByVisibleText("October");
		
		Select s1 = new Select(rp.getYear());
		s1.selectByVisibleText("1997");
		btnClick(rp.getDate());
		
		fill(rp.getSubject(), getParticularCell(1, 4));
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
				
		btnClick(rp.getHobbies());
		fill(rp.getAddress(), getParticularCell(1, 5));
		Assert.assertEquals(rp.getAddress().getAttribute("value"), "salem","check the Address");
		
	}
}
