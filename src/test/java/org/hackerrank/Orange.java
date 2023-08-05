package org.hackerrank;

import org.testng.annotations.Test;

public class Orange {
	@Test
	private void tc1() {
		int num =12345;
		int rem=0;
		int res=1;
		while(num>0) {
			rem=num%10;
			res=res*rem;
			num=num/10;
		}
		System.out.println(res);
	}
	
	@Test
	private void tc2() {
		System.out.println("happuy");

	}
	

}
