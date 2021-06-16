package spiceJetPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='navbar-collapse collapse clearfix'] //ul[1]//li[7]")
	WebElement practice;
	
	@FindBy(xpath="//div[@class='pull-left'] //h2")
	WebElement getPageContent;
		
	public LandingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPageContent()
	{
		return getPageContent.getText();
	}
	
	public PracticePage validatePracticeClick()
	{
		practice.click();
		return new PracticePage(driver);
	}
}
