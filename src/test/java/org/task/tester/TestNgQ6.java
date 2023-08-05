package org.task.tester;

import org.baseclass.Base;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgQ6 extends Base{
	

	@Parameters("browser")
	@Test
	private void tc1(String name) {
		if (name.equals("chrome")) {
			 loadBrowser();
		} else if (name.equals("firefox")) {
			loadFireFoxBrowser();
		} else {
			loadEdgeBrowser();
		}	
	}
}
