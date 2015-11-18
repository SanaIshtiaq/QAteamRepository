package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames 
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver" , "E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://software-testing-tutorials-automation.blogspot.com/p/learn-selenium-ide.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(int arg0);
		switchToFrameWithIndex(driver , 0);
		
		switchtoDefaultFrame(driver);
	}
	
	public static void switchToFrameWithIndex(WebDriver driver , int index) 
	{
		try 
		{
			driver.switchTo().frame(index);
			System.out.println("Navigated to frame with id " + index);
		} 
		catch (NoSuchFrameException e) 
		{
			System.out.println("Unable to locate frame with id " + index+ e.getStackTrace());
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to navigate to frame with id " + index+ e.getStackTrace());
		}
	}
	
	//After working with the frames, control should come back to the web page. 
	//if we don't switch back to the default page, driver will throw an exception. 
	public static void switchtoDefaultFrame(WebDriver driver) 
	{
			try 
			{
				driver.switchTo().defaultContent();
				System.out.println("Navigated back to webpage from frame");
			} 
			catch (Exception e) 
			{
				System.out.println("unable to navigate back to main webpage from frame"+ e.getStackTrace());
			}
		}
}
