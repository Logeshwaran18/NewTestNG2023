package org.login.tester;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A1 {

	@Test
	private void tc1() {
		System.out.println("Test1 : " + Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		Assert.assertTrue(false);
		System.out.println("Test2 : " + Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		
		System.out.println("Test3 : " + Thread.currentThread().getId());

	}
	
}
