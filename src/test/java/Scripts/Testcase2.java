package Scripts;

import java.io.IOException;


import org.testng.annotations.Test;

import PomPages.AfterCourseVideoPlayPage;
import PomPages.CoursePage;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(Driver);
		s.courses();
		
		
		CoursePage cp=new CoursePage(Driver);
		DriverUtilities.switchTabs(Driver);
		DriverUtilities.MouseHover(Driver, cp.getApti());
		cp.VerbalApti();
		cp.cocubeCourse();
		
		AfterCourseVideoPlayPage acp=new AfterCourseVideoPlayPage(Driver);
		acp.closeicon();
		Thread.sleep(3000);
		DriverUtilities.switchFrame(Driver);
		acp.play();
		Thread.sleep(10000);
		DriverUtilities.switchBack(Driver);
		
	}
}
