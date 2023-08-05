package org.login.tester;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B {
	@Test
	private void tc11() {
		System.out.println("test 11");
		SoftAssert s = new SoftAssert();
		s.assertTrue(false, "check the method");
		
		System.out.println("test 22");
		s.assertAll();
	}
	
	
	
}
