package FileReadAndWrite;

import java.awt.Robot;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadingAndWriting 
{
	static FileWriter fw ;
	static BufferedWriter bw ;
	
	static FileReader fr ;
	static BufferedReader br ;
	
	public static void main(String [] args)
	{
		// driver setup
		System.setProperty("webdriver.chrome.driver","E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:\\eDrive data\\Selenium Projects\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		System.out.println("11111");
		
		//HTaccess
		String URL = "https://" + "ferdinand" + ":" + "coeus123" + "@" + "www.housepilot.de/user/login";
		driver.get(URL);
		
		System.out.println("222222222");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			// driver setup end
		System.out.println("33333333333");
		
		// LogIn ----------------------------------------------------
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("test2@coeus-solutions.de");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Ste123");
        driver.findElement(By.id("user-login-btn")).click();
        // --------------------------------------------------------------
		
        //click on add new property
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[1]")).click();
		Random rand = new Random();
        
		try
		{
			System.out.println("4444444444444");
			
			String file = "E:/eDrive data/Selenium Projects/WebDriverWork/AutomationPractice/src/FileReadAndWrite/TestData.csv" ;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			System.out.println("555555555555555");
			
			String line = "";
			String cvsSplitBy = ",";

			
			br.readLine();
			while ((line = br.readLine()) != null) 
			{
		        // use comma as separator
				String[] ArrValues = line.split(cvsSplitBy);
				System.out.println("values in the first row are : ");
				for(int i=0 ; i<ArrValues.length ; i++)
				{
					System.out.println(ArrValues[i]+ " , " );
				}
				
				// 1 id = title - - any type of input is acceptable
				//valid condition for title  
				driver.findElement(By.id("title")).clear();
			    driver.findElement(By.id("title")).sendKeys(ArrValues[0]);
			    
			    // 2 id = property_desc - - any type of input is acceptable except of integers only
			    //Invalid input for description field 
			    driver.findElement(By.id("property_desc")).clear();
			    driver.findElement(By.id("property_desc")).sendKeys(ArrValues[1]); // RandomStringUtils.randomAlphabetic(7) 
			    //Assert.assertTrue(true); //, "The field can not contain numbers only"
			    
			    // 3 id = street - - any data is valid for street
				//valid condition for street 
				driver.findElement(By.id("street")).clear();
				driver.findElement(By.id("street")).sendKeys(ArrValues[2]);
				
			    // .............................................................
			    // 4 id = house_number - - only integers are acceptable
		        //Invalid condition for house#
		        driver.findElement(By.id("house_number")).clear();
		    	driver.findElement(By.id("house_number")).sendKeys(ArrValues[3]);
			    //Assert.assertTrue(true, "The field value must be a number");   
			    
		    	// 5 id = property_zip - - only integers are acceptable
			    //valid data for zip code
			    driver.findElement(By.id("property_zip")).clear();
			    driver.findElement(By.id("property_zip")).sendKeys(ArrValues[4]);
				
			    //id = location
			    try
			    {
			    driver.findElement(By.id("location")).click();
			    Robot robot1 = new Robot();
			    robot1.keyPress(66);
			    robot1.keyRelease(66);
			    robot1.keyPress(69);
			    robot1.keyRelease(69);
			    robot1.keyPress(82);
			    robot1.keyRelease(82);
			    robot1.keyPress(76);
			    robot1.keyRelease(76);
			    robot1.keyPress(73);
			    robot1.keyRelease(73);
			    //driver.findElement(By.xpath("/html/body/div[7]/div[4]")).click();
			    //driver.findElement(By.xpath("//*[@id='ui-id-16']/a")).click();
			    driver.findElement(By.id("ui-id-36")).click();
			    ////*[@id="ui-id-36"]
			    }
			    catch(Exception e)
			    {
			    	System.out.println("location exception "+e);
			    }
			    
			    // 11 id = no_of_rooms         ... dropdown (no.s)
			    new Select(driver.findElement(By.id("no_of_rooms"))).selectByVisibleText("3.5");
			    
			    // 14 id = date_picker_create_property ... calendar
			    driver.findElement(By.id("date_picker_create_property")).click();
			    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[5]/a")).click();
			    
			    
			    // 20 id = living_area_approx
			    driver.findElement(By.id("living_area_approx")).clear();
			    driver.findElement(By.id("living_area_approx")).sendKeys(ArrValues[8]);
			    
			    
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("exceptionnn : "+e);
		}
		catch(IOException e)
		{
			System.out.println("exceptionnn : "+e);
		}
		/*
		try
		{
			fw = new FileWriter("TestData.csv" , true);
			bw = new BufferedWriter(fw);
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		*/
		//driver.close();
	}
}
