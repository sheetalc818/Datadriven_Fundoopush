
/**
 * Description : LoginPage.java init all web elements and Contains the Methods
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */
package com.bridgelabz.fundoopush.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class LoginPage 
{
	@FindBy(id="mat-input-0")
	private WebElement Email;
	
	@FindBy(id ="mat-input-1")
	private WebElement Password;
	
	@FindBy(xpath="//span[@class='mat-button-wrapper']")
	private WebElement loginBtn;

	//Initialization
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUsername(String un)
	{
		Email.sendKeys(un);
	}
	
	public void setPassword(String pw) 
	{
		Password.sendKeys(pw);
	}
	
	public void clickLogin() 
	{
		loginBtn.click();
	}
	
}
