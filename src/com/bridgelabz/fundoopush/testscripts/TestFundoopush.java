/**
 * Description : TestFundoopush.java -Main test running two test cases
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */
package com.bridgelabz.fundoopush.testscripts;


import org.testng.annotations.Test;
import com.bridgelabz.fundoopush.generic.BaseTest;
import com.bridgelabz.fundoopush.generic.Lib;
import com.bridgelabz.fundoopush.pages.AddArticle;
import com.bridgelabz.fundoopush.pages.LoginPage;

public class TestFundoopush extends BaseTest
{
	@Test
	public void testFundoo() throws InterruptedException 
	{
		LoginPage login = new LoginPage(driver);
		AddArticle article = new AddArticle(driver);
		
		//User name - 1st Row and 0th Column value
		String username = Lib.getCellValue(EXCEL_PATH, "Sheet1", 1, 0);
		
		//Password - 1st Row and 1st Column value
		String password = Lib.getCellValue(EXCEL_PATH, "Sheet1", 1, 1);
		
		//Calling Methods of LoginPage
		login.setUsername(username);
		Thread.sleep(1000);
		login.setPassword(password);
		Thread.sleep(500);
		login.clickLogin();
		Thread.sleep(5000);
		
    	//Calling Methods of AddArticle page
		article.validateAddArticle();
	}
}
