package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserWidthAndHeight 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.ie.driver", "E:/eDrive data/Selenium Projects/IEDriver/IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		driver.get("www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// setting of browser width and height 
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(420,600);
		//Resize the current window to the given dimension
		driver.manage().window().setSize(d);
	}

}
