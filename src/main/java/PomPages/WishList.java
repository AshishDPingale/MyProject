package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList 
{
	    
	   @FindBy(xpath="//a[text()='X']")
	   private WebElement popupbtn;
	   
	   @FindBy(xpath="//a[text()='Corporates']")
	   private WebElement corpbtn;
	    
	   public WishList(WebDriver Driver)
	   {
	    	PageFactory.initElements(Driver, this);
	   }
      
       public void popup()
       {
    	   popupbtn.click();
       }
       public void Corporates()
       {
    	   corpbtn.click();
       }
}
