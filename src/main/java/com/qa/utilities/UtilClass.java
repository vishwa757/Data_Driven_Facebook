package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class UtilClass extends Testbase
{
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	public static void TakesSS(String filename)
	{
		String path = "C:\\Users\\kavya\\eclipse-workspace\\Data_Driven_Facebook\\screenshot";
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path+filename+".png");
			FileHandler.copy(source, destination);
		} catch (WebDriverException e) 
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
