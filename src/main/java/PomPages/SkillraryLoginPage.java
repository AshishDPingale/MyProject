package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP']) [2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()='Course']")
	private WebElement coursebtn;
	
	public SkillraryLoginPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	
	public void gearsButton()
	{
		gearbtn.click();
	}
	public void SkillrayDemoApp()
	{
		demoapp.click();
	}
	public void searchtextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	
	public void searchbutton()
	{
		searchbtn.click(); 
	}
	
	public void courses()
	{
		coursebtn.click();
	}
	
	
	
	
	
	
}
