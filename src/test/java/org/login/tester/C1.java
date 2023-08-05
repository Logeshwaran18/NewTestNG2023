package org.login.tester;

import org.testng.annotations.Test;

public class C1 {
	@Test(groups="sanity")
	private void tc7() {
		System.out.println("Test7 : "+Thread.currentThread().getId());

	}
	@Test(groups="regression")
	private void tc8() {
		 
		System.out.println("Test8 : "+Thread.currentThread().getId());

	}
	@Test(groups="sanity")
	private void tc9() {
		System.out.println("Test9 : "+Thread.currentThread().getId());

	}

}
