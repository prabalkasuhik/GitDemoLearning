package TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resource.base;
import spiceJetPages.HomePage;
import spiceJetPages.LandingPage;
import spiceJetPages.PracticePage;

public class PracticePageTest extends base {
	
	
	WebDriver driver;
	PracticePage pp;
	HomePage homepage;
		
	
	@BeforeTest
	public void bowserInitilze() throws IOException{
		driver=initilization();
		pp=new PracticePage(driver);
		
	}
	
	@Test(priority=0)
	public void validateCopyWriteTest()
	{
		
		String expeccopy=pp.validateCopyWrite();
		Assert.assertEquals(expeccopy, "All Right Reserved RahulShettyAcademy © 2021");

	}
	
	@Test(priority=1)
	public void validateCenterHeaderTest()
	{
		
		String expectedd=pp.validateCenterHeader();
		Assert.assertEquals(expectedd, "Join now to Practice");

	}
	@Test(priority=2)
	public void validateLoginTest()
	{
		//System.out.println(prop.getProperty("name"));
		homepage=pp.validateLogin(prop.getProperty("name"), prop.getProperty("email"));
	}
}
