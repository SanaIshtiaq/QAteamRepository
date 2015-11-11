package WebdriverMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsForWebPageElements 
{
	//static List<WebElement> arrList = new ArrayList<>();
	
	public static void main(String [] args)
	{
		// driver setup
		System.setProperty("webdriver.chrome.driver","E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		String URL = "http://vidmonials-web.coeus-solutions.de/login";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		// driver setup end
		
		 List<WebElement> elements = driver.findElements(By.xpath("//text"));
		//*[@id="passwd"] 
		 for(WebElement ele : elements)
		 {
			 System.out.println(ele.getText());
			 System.out.println();
		 }

		 
		 // close() method
		 driver.close();
		 
		 
		 // quit() method
		 //driver.quit();
	}

}
