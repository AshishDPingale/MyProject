package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage 
{
	
	@FindBy(xpath="(//span[@class='category-name'])[2]")
	private WebElement apti;
	
	@FindBy(xpath="//a[text()='Verbal Aptitude']")
	private WebElement verbalAptiCourse;
	
	@FindBy(xpath="//a[text()=' Cocubes Verbal Aptitude']")
	private WebElement cocubesVa;
	
	
	
	public CoursePage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}



	public WebElement getApti() 
	{
		return apti;
	}
    
	public void VerbalApti()
	{
		verbalAptiCourse.click();
	}
	public void cocubeCourse()
	{
		cocubesVa.click();
	}
	
	
	
	
	
	

}
