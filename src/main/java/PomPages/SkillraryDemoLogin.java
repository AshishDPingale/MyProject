package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin 
{
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="(//a[text()='Selenium Training']) [2]")
	private WebElement seleniumTrainning;
	
	@FindBy(id="add")
	private WebElement addbutton;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtoCartbtn;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	

	public SkillraryDemoLogin(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}

	public WebElement getCoursetab() 
	{
		return coursetab;
	}
	
	public void selenium() 
	{
		seleniumTrainning.click();
	}

	public WebElement getAddbutton() {
		return addbutton;
	}
	
	public void addtocartButton ()
	{
		addtoCartbtn.click();
	}
	
	public WebElement getCoursedd() 
	{
		return coursedd;
	}
	
	
	
	
	
}
