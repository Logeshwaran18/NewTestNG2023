package org.task.tester;

import org.baseclass.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgQ8 extends Base {
	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}

	@Test
	private void tc1() {
		launchUrl("http://www.greenstechnologys.com/");
	}
}
