package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationMethods 
{
	public static void main(String [] args)
	{
		// driver setup
		System.setProperty("webdriver.chrome.driver","E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		String URL = "http://vidmonials-web.coeus-solutions.de/login";
		driver.navigate().to(URL);;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		// driver setup end
		
		//email and password
	  	driver.findElement(By.id("username")).clear();
	  	driver.findElement(By.id("username")).sendKeys("test1@coeus-solutions.de");
		  	  
	  	driver.findElement(By.id("passwd")).clear();
	  	driver.findElement(By.id("passwd")).sendKeys("123");
	  	
	  //login button
	  	driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/div/button")).click();
	  	
	  	//To move back a single "item" in the web browser's history. 
	  	//And it will not perform any action if you are on the first page viewed.
	  	driver.navigate().back();
	  	
	  	//To move a single "item" forward in the web browser's history. 
	  	//And it will not perform any action if we are on the latest page viewed.
	  	driver.navigate().forward();
	  	
	  	// It refreshes the current web page
	  	driver.navigate().refresh();
	  	
	  	//Below is the sample code to perform page refresh using Action Driver class
	  	Actions actions = new Actions(driver);
	  	actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	  	
	  	driver.close();
	  	
	}

}
