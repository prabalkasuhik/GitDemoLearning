package resource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utils {

	WebDriver driver;	
	
	public String getScreenshot(String testcasename,WebDriver driver)
	{		
		TakesScreenshot scrshot= (TakesScreenshot)driver;
		File srcFile= scrshot.getScreenshotAs(OutputType.FILE);
		String destFile=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destFile;
		
	}
	
}
