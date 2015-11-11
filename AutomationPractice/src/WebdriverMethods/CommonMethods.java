package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 Exercise Task 
1) Launch a new Firefox browser. 
2) Open ToolsQA.com 
3) Get Page Title name and Title length 
4) Print Page Title and Title length on the Eclipse Console. 
5) Get Page URL and URL length 
6) Print URL and URL length on the Eclipse Console. 
7) Refresh current page 
8) Get Page Source (HTML Source code) and Page Source length 
9) Print Page Source and length on Eclipse Console. 
10) Close the Browser. 
 */

/* we are covering all this
 get()
 getTitle()
 getCurrentUrl()
 getPageSource()
 close()
 quit()
 */
public class CommonMethods 
{
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
		
		 /*WebDriver driver = new FirefoxDriver();
		 // http://vidmonials-web.coeus-solutions.de/login
		 // get() method
		 driver.get("http://docs.rackspace.com/servers/api/v2/cs-devguide/content/curl.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
		 
		 // getTitle() method
		 String strTitle = driver.getTitle();
		 
		 System.out.println("title of page : "+strTitle);
		 System.out.println("length of title : "+strTitle.length());
		 
		 System.out.println();
		 
		 // getCurrentUrl() method
		 String strUrl = driver.getCurrentUrl();
		 
		 System.out.println("URL of current page : "+strUrl);
		 System.out.println("length of URL : "+strUrl.length());
		 
		 System.out.println();
		 
		 // get getPageSource() method
		 String strPageSource = driver.getPageSource();
		 
		 System.out.println("Page Source of current page : "+strPageSource);
		 System.out.println("length of PageSource : "+strPageSource.length());
		 
		 System.out.println();
		 
		 /*
		 // close() method
		 driver.close();
		 */
		 
		 // quit() method
		 driver.quit();
	}

}
