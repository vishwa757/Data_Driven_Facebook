package com.qa.testlayer;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.pagelayer.facebook_login_page;
import com.qa.pagelayer.fbHome_page;
import com.qa.pagelayer.google_search_page;
import com.qa.testbase.Testbase;

public class Testclass extends Testbase
{
	@Test
	public void check_fbFunctionality() throws EncryptedDocumentException, IOException, InterruptedException
	{

		FileInputStream file = new FileInputStream("C:\\Users\\kavya\\Desktop\\fb\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		/* google_search_page gsp = new google_search_page(driver);
		gsp.enterURL(sh.getRow(0).getCell(0).getStringCellValue());
		gsp.ClickOnSerachBtn();
		gsp.ClickFburl(); */
		
		Thread.sleep(2000);
		facebook_login_page login = new facebook_login_page(driver);
		login.enterUN(sh.getRow(1).getCell(1).getStringCellValue());
		login.enterPWD(sh.getRow(2).getCell(1).getStringCellValue());
		login.ClickOnLoginBtn();
		Thread.sleep(2000);
		login.ClickonAccount();
		Thread.sleep(2000);
		login.logOut();
		
		
		
		

		/* Thread.sleep(2000);
		fbHome_page home = new fbHome_page(driver);
		home.verifyUserID(sh.getRow(6).getCell(0).getStringCellValue());
		Thread.sleep(2000); */
		
		
	}
}
