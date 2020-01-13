/**
 * Description : TestFundoopush.java -Main test running two test cases
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */
package scripts;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pompages.HomePage;
import pompages.LoginPage;

@Test
public class TestFundoopush extends BaseTest
{
	public void TestFundoo() throws InterruptedException 
	{
		LoginPage LP = new LoginPage(driver);
		HomePage HP = new HomePage(driver);
		
		//User name - 1st Row and 0th Column value
		String un = Lib.getCellValue(EXCEL_PATH, "Sheet1", 1, 0);
		
		//Password - 1st Row and 1st Column value
		String pw = Lib.getCellValue(EXCEL_PATH, "Sheet1", 1, 1);
		
		//Calling Methods of LoginPage
		LP.setUsername(un);
		Thread.sleep(1000);
		LP.setPassword(pw);
		Thread.sleep(500);
		LP.clickLogin();
		Thread.sleep(5000);
		
    	//Calling Methods of Home page
//		HP.ClickAddbtn();
//		Thread.sleep(2000);
//		HP.ClickAddStory();
//		Thread.sleep(1000);
//	    HP.ClickRedirectLink();
//		Thread.sleep(10000);
//		HP.ClickPost();
//		Thread.sleep(10000);
	}
}
