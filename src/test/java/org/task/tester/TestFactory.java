package org.task.tester;

import org.hackerrank.GG;
import org.testng.annotations.Factory;

public class TestFactory {


	@Factory
	public Object[] datas() {
		return new Object[] {
				new GG("Logii","happy"),new GG("pravee","789455")
		};
	}

}
