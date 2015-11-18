package WebdriverMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWithMultipleAttributes 
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.ie.driver", "E:/eDrive data/Selenium Projects/IEDriver/IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		driver.get("E:\\eDrive data\\Selenium Projects\\WebDriverWork\\MultiSelectHTM.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		/*
		//To get all the options present in the dropdown
		List<WebElement> allOptions = se.getOptions();
		for (WebElement webElement : allOptions)
		{
		System.out.println(webElement.getText());
		}
		*/
		
		/*
		//To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
		System.out.println("You have selected ::"+ webElement.getText());
		}
		*/
		
		try
		{
			// It will return the first selected option in this select tag 
			//(or the currently selected option in a normal select)
			WebElement element=driver.findElement(By.name("Mobdevices"));
			Select se=new Select(element);
			se.selectByVisibleText("Nokia");
			se.selectByVisibleText("HTC");
			//To get the first selected option in the dropdown
			WebElement firstOption = se.getFirstSelectedOption();
			System.out.println("The First selected option is::" +firstOption.getText());
			
			//To check whether the Select element supports selecting multiple options. This will be done by checking the value of the "multiple" attributes in Select tag.
			if(se.isMultiple())
			{
				System.out.println("Select tag allows multiple selection");	
			}
			else
			{
				System.out.println("Select does not allow multiple selections");
			}
		}
		catch(Exception e)
		{
			System.out.println("here is an exception : "+e);
		}
		
	}
}
