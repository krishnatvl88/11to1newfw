package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BaseClass {
	RegisterPage()
	{
		super(dLocal);
	}

	public static void setUserName(String userName)
	{
		if(dLocal.findElement(By.id("email")).isDisplayed())
		{
			dLocal.findElement(By.id("email")).clear();
			dLocal.findElement(By.id("email")).sendKeys(userName);
		}
	}
	
	public static void setPassword(String passwword)
	{
		if(dLocal.findElement(By.name("password")).isDisplayed())
		{
			dLocal.findElement(By.name("password")).clear();
			dLocal.findElement(By.name("password")).sendKeys(passwword);
		}
	}public static void setConfirmPassword(String cPasswword)
	{
		if(dLocal.findElement(By.name("confirmPassword")).isDisplayed())
		{
			dLocal.findElement(By.name("confirmPassword")).clear();
			dLocal.findElement(By.name("confirmPassword")).sendKeys(cPasswword);
		}
	}
	
	public static void btnRegister()
	{
		if(dLocal.findElement(By.name("register")).isDisplayed())
		{
			dLocal.findElement(By.name("register")).click();
			
		}
	}
	
	public static void selectCountry(String countryName)
	{
		if(dLocal.findElement(By.name("country")).isDisplayed())
		{
			WebElement we = dLocal.findElement(By.name("country"));
			Select slt = new Select(we);
			slt.selectByVisibleText(countryName);
		}
	}
}
