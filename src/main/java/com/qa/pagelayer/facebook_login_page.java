package com.qa.pagelayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class facebook_login_page extends Testbase 
{
	
	public facebook_login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	//pom class 2
	
		//step : declaration

		@FindBy(xpath="//input[@id='email']")
		private WebElement UN;
		//private WebElement UN = driver.findElement(By.xpath("//input[@id='email']"))

		@FindBy(xpath="//input[@id='pass']")
		private WebElement PWD;
		//private WebElement PWD = driver.findElement(By.xpath("//input[@id='pass']"))

		@FindBy(xpath="//button[text()='Log in']")
		private WebElement LoginBtn;
		//private WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"))

		@FindBy (xpath ="//div[@class = 'x78zum5 x1n2onr6']")
		private WebElement linktext;
		
		@FindBy (xpath = "//span[text() = 'Log Out']")
		private WebElement logout;
//===========================================================================================
		// step 2 : initialization

		

		//step :3

		public void enterUN(String username) 
		{
			UN.sendKeys(username);
		}

		public void enterPWD(String password) 
		{
			PWD.sendKeys(password);
		}

		public void ClickOnLoginBtn() 
		{
			LoginBtn.click();
		}
		
		public void ClickonAccount()
		{
			linktext.click();
		}
		
		public void logOut()
		{
			logout.click();
		}
		
		

	}


