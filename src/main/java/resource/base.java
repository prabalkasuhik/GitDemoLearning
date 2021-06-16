package resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public static WebDriver initilization()
	{
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Selenium_new\\Workspace\\SpiceJetAutomation\\src\\main\\java\\resource\\Property.propeties");
			prop= new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabal Kaushik\\Downloads\\Chromnew\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	
		
		
		
	}

}
