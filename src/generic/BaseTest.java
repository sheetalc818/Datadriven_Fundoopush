
/**
 * Description : BaseTest.java Initialize the Driver and Launch the application by taking the URL from Lib.java
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */

package generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant
{
	public WebDriver driver;
	static 
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	
	@BeforeMethod
	public void openApplication() 
	{
		driver = new ChromeDriver();
		String url = Lib.getProperty(CONFIG_PATH,"URL");
		driver.manage().window().maximize();
		driver.get(url);
		String ITO = Lib.getProperty(CONFIG_PATH,"ImplicitTimeOut");
		int timeoutPeriod = Integer.parseInt(ITO); 
		driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}
}
