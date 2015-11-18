package IEandChromeBrowsers;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class scriptForIEbrowser 
{
	public static void main(String [] args)
	{
		File file = new File("E:/eDrive data/Selenium Projects/IEDriver/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driver = new InternetExplorerDriver();
		
		String URL = "http://vidmonials-web.coeus-solutions.de/login";
		driver.get(URL);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize(); 
	}
}
