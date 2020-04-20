package com.bridgelabz.fundoopush.generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bridgelabz.fundoopush.pages.BasicActions;

public class CustomListener extends BaseTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		BasicActions.takeScreenShot(driver,result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		BasicActions.takeScreenShot(driver,result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		BasicActions.takeScreenShot(driver,result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		BasicActions.takeScreenShot(driver,result.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}