package com.qa.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.Testbase;

public class ListenerClass extends Testbase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Execution Completed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Execution Failed");
		UtilClass.TakesSS(result.getName() + System.currentTimeMillis());
		System.out.println("Screenshot Captured");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Execution Skipped");
	}

}
