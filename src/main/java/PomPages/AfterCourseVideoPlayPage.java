package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterCourseVideoPlayPage 
{
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closebtn;
	
	public AfterCourseVideoPlayPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	public void closeicon()
	{
		closebtn.click();
	}
	public void play()
	{
		playbtn.click();
	}

	
	
	
}
