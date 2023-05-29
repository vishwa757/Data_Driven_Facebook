package com.qa.pagelayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.Testbase;

public class fbHome_page extends Testbase
{
	

	
	// pmo class 3
	

		   @FindBy(xpath="(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'])[1]")
		   private WebElement UserID;
		   
		   public fbHome_page(WebDriver driver) 
		   {
			   PageFactory.initElements(driver, this);
		   }
		   
		   public void verifyUserID(String expUserID) 
		   {
			   String actUserID = UserID.getText();
			   
			   if(actUserID.equals(expUserID)) 
			   {
				   System.out.println("PASS");
			   }
			   else 
			   {
				   System.out.println("FAIL");
			   }
	     }
	}


