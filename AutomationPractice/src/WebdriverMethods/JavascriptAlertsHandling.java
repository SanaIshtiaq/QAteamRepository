package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptAlertsHandling 
{
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver" , "E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//HTaccess
		//String URL = "https://" + "ferdinand" + ":" + "coeus123" + "@" + "www.housepilot.de/user/login";
		String URL = "http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert" ;
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*
		// LogIn ----------------------------------------------------
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("test4@coeus-solutions.de");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Ste123");
        driver.findElement(By.id("user-login-btn")).click();
        // --------------------------------------------------------------
        */
		
		driver.switchTo().frame(0);
		
        //driver.findElement(By.id("invite-link")).click();
		driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
        
        try 
        {
        	// explicit wait
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            // Get a handle to the open alert, prompt or confirmation
            //Alert alert = driver.switchTo().alert();
            
            driver.switchTo().alert().accept();
            
           // Alert is an interface. There below are the methods that are used
            
            //will get the text which is present on th Alert.
            //String alertTxt = alert.getText();
            //System.out.println("Alert text : "+alertTxt);
            
            //Will pass the text to the prompt popup
            //alert.sendKeys("test@coeus.de");
           
            //alert.accept();
        } 
        catch (Exception e) 
        {
            //exception handling
        	System.out.println("the alert is not present : "+e);
        	driver.close();
        }
                
        /*
        
         
        //Will Click on OK button.
        alert.accept();

        // Will click on Cancel button.
        //alert.dismiss();

        //Is used to Authenticate by passing the credentials
        //alert.authenticateUsing(Credentials credentials);
        */
	}
}
