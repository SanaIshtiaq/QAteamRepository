package IEandChromeBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptForChromeBrowser 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver" , "E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://" + "ferdinand" + ":" + "coeus123" + "@" + "www.housepilot.de/admin/login";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}
