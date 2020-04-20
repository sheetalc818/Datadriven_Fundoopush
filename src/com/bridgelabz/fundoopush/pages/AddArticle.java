package com.bridgelabz.fundoopush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


@Test
public class AddArticle extends BasicActions  {
	
	@FindBy(xpath="//app-dashboard[@class='ng-star-inserted']")
	private WebElement dashboardPage;
	
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-article/div/div[3]/div/mat-icon")
	private WebElement ClickAdd;
	
	@FindBy(xpath="//button[contains(text(),'ADD ARTICLE')]")
	private WebElement AddArticle;
	
	@FindBy(xpath="//textarea[@placeholder='Title']")
	private WebElement AddTitle;
	
	@FindBy(className="addMedia")
	private WebElement AddMedia;
	
	@FindBy(xpath="//div[4]//img[1]")
	private WebElement ClickRedirectBtn;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	private WebElement Sendlink;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	private WebElement DoneBtn;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	private WebElement AddDescription;
	
	@FindBy(xpath="//div[@class='quill-style']")
	private WebElement AddImageBtn;
	
	private static String filePath = System.getProperty("user.dir") + "/Aimage/nature.jpg";

	@FindBy(xpath="//i[@class='material-icons save-btn']")
	private WebElement UploadBtn;
	
	
	public AddArticle(WebDriver driver) 
	{
		super(driver);
	}
	
	//Checking for the dashboard page Element
	public void validateDashboardPage() 
	{
		checkElementPresent(dashboardPage);
	}
		
	//Adding Article Card into the Fundoopush dashboard
	public void validateAddArticle() throws InterruptedException 
	{
			checkElementPresent(ClickAdd);
			Thread.sleep(1000); 
			Clickbtn(ClickAdd);
			Thread.sleep(1000);
			Clickbtn(AddArticle);
			Thread.sleep(1000);
			addTitle(AddTitle);
			Thread.sleep(1000);
			Clickbtn(AddMedia);
			Thread.sleep(100);
			Clickbtn(ClickRedirectBtn);
			Thread.sleep(100);
			RedirectL(Sendlink);
			Thread.sleep(500);
			Clickbtn(DoneBtn);
			Thread.sleep(500);
			addDescription(AddDescription);
			Thread.sleep(500);
			addImage(AddImageBtn);
			Thread.sleep(500);
			uploadFileWithRobot(filePath);
			Thread.sleep(3000);
			Clickbtn(UploadBtn);
			Thread.sleep(5000);
			takeScreenshot();
   }

}
