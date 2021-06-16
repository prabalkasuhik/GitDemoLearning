package spiceJetPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	
	WebDriver driver;
	Properties prop;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//div[@class='form-column col-md-6 col-sm-8 col-xs-12'] //h2")
	WebElement centerHeader;
	
	@FindBy(xpath="//div[@class='copyright']")
	WebElement copyrte;
	
	@FindBy(xpath="//*[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//div[@class='form-group col-md-12 col-sm-12 col-xs-12'] //*[@class='theme-btn btn-style-one']")
	WebElement submit;
	
	
	public PracticePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateCenterHeader()
	{
		return centerHeader.getText();
	}
	
	public String validateCopyWrite()
	{
		return copyrte.getText();
	}
	
	public HomePage validateLogin(String names,String emails)
	{
//		Actions a=new Actions(driver);
//		a.moveToElement(name).click().sendKeys(names).build().perform();
		name.click();
		name.sendKeys(names);
		email.clear();
		email.sendKeys(emails);
//		a.moveToElement(email).click().sendKeys(emails).build().perform();
		checkbox.click();
		submit.click();
		return new HomePage();
	}
	
}
