package testScripts;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import externalLib.Config;
import pageObjects.BaseClass;
import pageObjects.LoginPage;

public class Login {
    static WebDriver driver;
	@BeforeMethod
  public void setUp() throws IOException
  {
	  driver = externalLib.Utils.getDriverInstance(Config.broswerName);
	  new BaseClass(driver);
	  driver.get(Config.baseUrl);
	  externalLib.ExcellOperations.setFilePath(Config.testDataPath, "Login");
  }
  @Test
  public void loginTest() throws IOException 
  {
	  String userName,password;
	  userName = externalLib.ExcellOperations.getCellValue(1,0);
	  password = externalLib.ExcellOperations.getCellValue(1,1);
	  LoginPage.setUserName(userName);
	  LoginPage.setPassword(password);
	  LoginPage.btnLogin();
	  Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
	  Reporter.log("Login is successfull");
	  externalLib.Utils.captureSreen(Config.screenPath, "Login");
  }
  
  @AfterMethod
  public void tearDown()
  {
	  externalLib.Utils.closerBrowser();
  }
}