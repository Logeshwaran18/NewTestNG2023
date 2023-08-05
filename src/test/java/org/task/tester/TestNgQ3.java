package org.task.tester;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.RegistractionPojo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ3 extends Base {
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}

	@Test
	private void tc1() throws AWTException {
		launchUrl("https://demoqa.com/automation-practice-form");

//		 RegistractionPojo rp = new RegistractionPojo();
//		 fill(rp.getFirstName(), "logesh");
//		 Assert.assertEquals(rp.getFirstName().getAttribute("value"), "logesh","check the FirstName");
//		
//		 fill(rp.getLastName(), "waran");
//		 Assert.assertEquals(rp.getLastName().getAttribute("value"), "waran","check the lastName");
//		
//		 fill(rp.getEmail(), "logesh@gmail.com");
//		 Assert.assertEquals(rp.getEmail().getAttribute("value"),"logesh@gmail.com","check the Email");
//		
//		 btnClick(rp.getGender());
//		 fill(rp.getMobile(), "9629930060");
//		 Assert.assertEquals(rp.getMobile().getAttribute("value"), "9629930060","check the MobileNumber");
//		
//		 btnClick(rp.getDob());
//		 Select s = new Select(rp.getMonth());
//		 s.selectByVisibleText("October");
//		
//		 Select s1 = new Select(rp.getYear());
//		 s1.selectByVisibleText("1997");
//		 btnClick(rp.getDate());
//		
//		 fill(rp.getSubject(), "maths");
//		 Robot r = new Robot();
//		 r.keyPress(KeyEvent.VK_ENTER);
//		 r.keyRelease(KeyEvent.VK_ENTER);
//		
//		 btnClick(rp.getHobbies());
//		 fill(rp.getAddress(), "salem");
//		 Assert.assertEquals(rp.getAddress().getAttribute("value"), "salem","check the Address");
	
		
	}
}
