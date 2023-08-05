package org.login.tester;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B1 {
	@Test(groups="regression")
	private void tc4() {
		System.out.println("Test4 : "+Thread.currentThread().getId());

	}
	@Test(groups="smoke")
	private void tc5() {
		Assert.assertTrue(false);
		System.out.println("Test5 : "+Thread.currentThread().getId());

	}
	@Test(groups="regression")
	private void tc6() {
		System.out.println("Test6 : "+Thread.currentThread().getId());

	}

}
