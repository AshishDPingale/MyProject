package Scripts;

import org.testng.annotations.Test;

import PomPages.SkillraryDemoLogin;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass 
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s=new SkillraryLoginPage(Driver);
		s.gearsButton();
		s.SkillrayDemoApp();
		
		SkillraryDemoLogin sd=new SkillraryDemoLogin(Driver);
		DriverUtilities.switchTabs(Driver);
		DriverUtilities.MouseHover(Driver, sd.getCoursetab());
		sd.selenium();
		DriverUtilities.doubleClick(Driver, sd.getAddbutton());
		sd.addtocartButton();
		DriverUtilities.alertpopup(Driver);
		
	}
}
