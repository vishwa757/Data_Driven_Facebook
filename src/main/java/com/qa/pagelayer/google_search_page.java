package com.qa.pagelayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;


public class google_search_page extends Testbase
{
	


	
	
	//pom class 1
	
		//step : declaration
		
		@FindBy(xpath="//textarea[@class='gLFyf']")private WebElement URL;
		//private WebElement URL = driver.findElement(By.xpath("//textarea[@id='APjFqb']"))

		@FindBy(xpath="(//input[@class='gNO89b'])[1]")private WebElement SerachBtn;
		//			private WebElement SerachBtn = driver.findElement(By.xpath(""))

		@FindBy(xpath="//a[text()='Log In']")private WebElement FBlink;
		//			private WebElement SerachBtn = driver.findElement(By.xpath(""))


		public google_search_page(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		//step :3


		public void enterURL(String url) 
		{
			URL.sendKeys(url);
		}

		public void ClickOnSerachBtn() 
		{
			SerachBtn.click();
		}
		public void ClickFburl() 
		{
			FBlink.click();
		}
	}



