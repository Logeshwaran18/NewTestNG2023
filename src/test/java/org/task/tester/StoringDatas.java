package org.task.tester;

import org.testng.annotations.DataProvider;

public class StoringDatas {
	
	@DataProvider(name = "FaceBookLogin")
	public Object[][] data1() {
		return new Object[][] { 
			{ "logesh", "123456" } 
			};
	}

	@DataProvider(name="Authentication")
	public Object[][] credentials() {
		return new Object[][] {
			{"logesh@gmail.com"}
		};

	}
	
	@DataProvider(name="logesh")
	private Object[][] hai() {
		return new Object[][] {
			{"hai","jjaa"},{"ja","kk"}
		};

	}
	
}
