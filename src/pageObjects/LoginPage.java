package pageObjects;

import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
	LoginPage()
	{
		super(dLocal);
	}

	public static void setUserName(String userName)
	{
		if(dLocal.findElement(By.name("userName")).isDisplayed())
		{
			dLocal.findElement(By.name("userName")).clear();
			dLocal.findElement(By.name("userName")).sendKeys(userName);
		}
	}
	
	public static void setPassword(String passwword)
	{
		if(dLocal.findElement(By.name("password")).isDisplayed())
		{
			dLocal.findElement(By.name("password")).clear();
			dLocal.findElement(By.name("password")).sendKeys(passwword);
		}
	}
	
	public static void btnLogin()
	{
		if(dLocal.findElement(By.name("login")).isDisplayed())
		{
			dLocal.findElement(By.name("login")).click();
			
		}
	}
	
	public static void lnkRegister()
	{
		if(dLocal.findElement(By.linkText("Register here")).isDisplayed())
		{
			dLocal.findElement(By.linkText("Register here")).click();
			
		}
	}
}
