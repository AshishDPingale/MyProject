package Scripts;

import java.io.IOException;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PomPages.CoreJavaPage;
import PomPages.CorporatesPage;
import PomPages.SkillraryLoginPage;
import PomPages.WishList;
import genericLib.BaseClass;

public class Testcase3 extends BaseClass
{
	@Test
	public void tc3 () throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(Driver);
		s.searchtextbox(pdata.getData("search"));
		s.searchbutton();
		
		CoreJavaPage j=new CoreJavaPage(Driver);
		j.corejavacourse();
		
		WishList wl=new WishList(Driver);
		wl.popup();
		wl.Corporates();
		Thread.sleep(2000);
		
		CorporatesPage cop=new CorporatesPage(Driver);
		DriverUtilities.switchTabs(Driver);
		WebElement loc = cop.getUpgrade();
		Point l = loc.getLocation();
		int x=l.getX();
		int y=l.getY();
		DriverUtilities.scrollbar(Driver, x, y);
		DriverUtilities.MouseHover(Driver, cop.getCourseST());
		cop.automationCourse();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}
}
