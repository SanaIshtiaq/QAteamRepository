package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver" , "E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://" + "ferdinand" + ":" + "coeus123" + "@" + "www.housepilot.de/admin/login";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// LogIn ----------------------------------------------------
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("super.admin@ferdinand.de");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='loginform']/p[4]/button")).click();
        // --------------------------------------------------------------
        
        //click on add new PO
        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/ul/li[4]/a")).click();
       
	    // 11 id = no_of_rooms         ... dropdown (no.s)
	    new Select(driver.findElement(By.id("gender"))).selectByVisibleText("3");	     
	    // 12 id = property_type           ... dropdown
	    new Select(driver.findElement(By.id("civil_status"))).selectByIndex(2);
	}
}
