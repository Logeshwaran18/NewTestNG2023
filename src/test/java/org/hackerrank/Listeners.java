package org.hackerrank;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	public void onFinish(ITestContext context) {
		
		System.out.println("Start Date : "+context.getEndDate());
	}

	public void onStart(ITestContext context) {
		
		System.out.println("End Date : "+context.getStartDate());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getStatus());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failure Method Name : "+result.getName());
		System.out.println(result.getStatus());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getStatus());
	}

	public void onTestStart(ITestResult result) {
//		System.out.println(result.getStatus());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Success Method Name : "+result.getName());
		System.out.println(result.getStatus());
		
	}



}
