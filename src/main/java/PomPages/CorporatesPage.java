package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporatesPage 
{
	
	@FindBy(xpath="//p[text()='Software Testing']")
	private WebElement courseST;
	
	@FindBy(xpath="//button[contains(text(),'Test Automation')]")
	private WebElement AUTcourse;
	
	@FindBy(xpath="(//h3[text()='Upskill Your Team']) [2]")
	private WebElement upgrade;
	
	public CorporatesPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}



	public WebElement getCourseST() 
	{
		return courseST;
	}
	
	
	public void automationCourse()
	{
		AUTcourse.click();
	}



	public WebElement getUpgrade() {
		return upgrade;
	}
	
	
}
