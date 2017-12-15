package pageObjects;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	static WebDriver dLocal;
	public BaseClass(WebDriver dExternal)
	{
		dLocal=dExternal;
	}
}
