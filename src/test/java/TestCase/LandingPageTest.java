package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resource.base;
import spiceJetPages.LandingPage;
import spiceJetPages.PracticePage;

public class LandingPageTest extends base {
	WebDriver driver;
	LandingPage lp;
	PracticePage pp;
	
	@BeforeTest
	public void bowserInitilze() throws IOException{
		driver=initilization();
		lp=new LandingPage(driver);
		
	}
	
	@Test(priority=0)
	public void validatePageContentTest()
	{
		String pageContent=lp.getPageContent();
		Assert.assertEquals(pageContent, "Featured Courses");
	}

	
	@Test(priority=1)
	public void validatePracticeTest()
	{
		
		pp=lp.validatePracticeClick();
	}
	
	
}
