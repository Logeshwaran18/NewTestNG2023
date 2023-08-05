package org.task.tester;

import org.baseclass.Base;
import org.pojo.FlipkartLoginPojo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgQ4 extends Base{

	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}
	
	@Test
	private void tc1() {
		launchUrl("https://www.flipkart.com/account/login");
		
		FlipkartLoginPojo fp = new FlipkartLoginPojo();
		fill(fp.getTxtEmail(), "logesh@gmail.com");
		
		SoftAssert s = new SoftAssert();

		s.assertEquals(fp.getTxtEmail().getAttribute("value"), "logesh@gmail.com","Check the UserEmail");
		fill(fp.getPassword(), "123456");
		s.assertEquals(fp.getPassword().getAttribute("value"), "123456","Check the UserPassword");
		btnClick(fp.getLoginBtn());
		s.assertAll();
	}
}
