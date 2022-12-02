package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage 
{
	@FindBy(xpath="//a[@title='Core Java For Selenium Training']")
	private WebElement corejava;
	
	public CoreJavaPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}

	public void corejavacourse()
	{
		corejava.click();
	}
}
