package externalLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utils {
static WebDriver driver;

public static WebDriver getDriverInstance(String browserType)
{
	switch(browserType)
	{
	case "Firefox":
		driver = new FirefoxDriver();
		break;
	case "Chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
	case "IE":
		System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new InternetExplorerDriver();
		break;
	}
	return(driver);
}

public static void closerBrowser()
{
	driver.close();
}

public static void captureSreen(String path,String testName) throws IOException
{
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	int randNum = (int) (Math.random()*1000);
	FileUtils.copyFile(scr, new File(path+testName+randNum+".png"));
}

}