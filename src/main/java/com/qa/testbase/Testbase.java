package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.pagelayer.facebook_login_page;
import com.qa.pagelayer.fbHome_page;
import com.qa.pagelayer.google_search_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase 
{
	public static WebDriver driver;
	public static  Logger logger;
	
	@BeforeClass
	public void loggerStart()
	{
		logger = Logger.getLogger("Telecom Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework Started");
	}

	@AfterClass
	public void loggerEnd()
	{
		logger.info("Framework Execution Completed");
	}
	
	@BeforeMethod
	
	public void setUp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions n = new ChromeOptions();
			n.addArguments("--remote-allow-origins=*");
			n.addArguments("--disable-notifications");
			driver = new ChromeDriver(n);
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("plz provide correct browser");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		
		
		
		
	
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}

}
