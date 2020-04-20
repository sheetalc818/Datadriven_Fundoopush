package com.bridgelabz.fundoopush.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicActions 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public static final int TIME_OUT = 100;
	
	//Initializing PageFactory Web Elements by creating Constructor
	public BasicActions(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIME_OUT), this);
		wait = new WebDriverWait(driver, TIME_OUT);
		//driver.manage().timeouts().setScriptTimeout(300, TimeUnit.SECONDS);
	}
	

	/*********************************Dashboard Page Method***********************************************/
    
	//Method to check Visibility of WebElements
	public void checkElementPresent(WebElement element) 
	{
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void Clickbtn(WebElement element)
	{
		element.click();
	}
	
    public void RedirectL(WebElement element) 
	{
		element.sendKeys("https://www.bbc.com/news/world-52350262");
    	//((JavascriptExecutor)driver).executeScript("arguments[0].value='https://www.bbc.com/news/business-49160406'", element);
	}
    
    /********************************Add Article*********************************************************/
    
    public void addTitle(WebElement element) 
    {
    	element.sendKeys("What is mean by testing?");
    }
    
	public void addDescription(WebElement element)
	{
		element.sendKeys("Testing is to evaluate the functionality of a software application with an intent to find whether the developed software met the specified requirements or not and to identify the defects to ensure that the product is defect free in order to produce the quality product.");
	}
	
	public void addImage(WebElement element) 
	{
		element.click();
		//element.sendKeys("/home/admin1/eclipse-workspace/CucumberFundoopush/src/test/resources/Image/3D-Nature-Images-Free-Download.jpg");
	}
	
	//File upload by Robot Class
    public void uploadFileWithRobot(String imagePath) 
    {
        StringSelection stringSelection = new StringSelection(imagePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
 
        Robot robot = null;
 
        try 
        {
          robot = new Robot();
        } catch (AWTException e) 
        {
            e.printStackTrace();
        }
        
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    
	/*********************************Take Screenshot Method*********************************************/
	
	public void takeScreenshot() 
	{
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
		 // now copy the  screenshot to desired location using copyFile //method
		 FileUtils.copyFile(src, new File("Screenshot/screenshot.png"));
		}
		catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
	}
	
    /*********************************getDriver Method**************************************************/
	
	//Method for getDriver()
	public WebDriver getDriver() 
	{
		return driver;
	}


	public static void takeScreenShot(WebDriver driver, String methodName) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
		try {
			FileUtils.copyFile(src,new File("FailedTestScreenShot"+"/"+methodName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


