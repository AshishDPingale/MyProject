package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	
	
	
	public void getPhoto(WebDriver Driver, String name) throws IOException
	{
		Date currentdate =new Date();
		currentdate.toString().replaceAll(":", "-"); 
		TakesScreenshot ts=(TakesScreenshot)Driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photopath+currentdate+name+".png");
		FileUtils.copyDirectory(src, dest);
		
		
		
	}
	
	
	
	
	
	
	
}
