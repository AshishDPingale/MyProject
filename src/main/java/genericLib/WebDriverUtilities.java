package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	
	
	public void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByValue(text);
		
	}
	public void MouseHover(WebDriver Driver, WebElement ele )
	{
		Actions a= new Actions(Driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void doubleClick(WebDriver Driver, WebElement ele)
	{
		Actions a= new Actions(Driver);
		a.doubleClick(ele).perform();
	}
	
	public void draganddrop(WebDriver Driver, WebElement src, WebElement dest)
	{
		Actions a= new Actions(Driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void switchFrame(WebDriver Driver)
	{
		Driver.switchTo().frame(0);
	}
	public void switchBack(WebDriver Driver)
	{
		Driver.switchTo().defaultContent();
	}
	
	public void alertpopup(WebDriver Driver)
	{
		Driver.switchTo().alert().accept();
	}
	
	public void switchTabs(WebDriver Driver)
	{
		Set<String> child = Driver.getWindowHandles();
		
		for(String b:child)
		{
			Driver.switchTo().window(b);
		}
		
	}
	
	public void scrollbar(WebDriver Driver, int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) Driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	
}
