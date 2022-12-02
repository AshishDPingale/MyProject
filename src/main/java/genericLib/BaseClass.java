package genericLib;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver Driver;
	public PropertyFileData pdata=new PropertyFileData();
	public WebDriverUtilities DriverUtilities =new WebDriverUtilities ();   
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();   
		                                          // webdrivermanager is dependency which gives acess to chrome browser
		                                          //WebDriverManager.FirefoxDriver(.setup();     //for firefox Driver
	    Driver=new ChromeDriver();
		Driver.get(pdata.getData("url"));                                       
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //this is syntax for selenium server 3.141.59
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		Driver.quit();
	}
}
