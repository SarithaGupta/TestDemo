package utils;

import org.openqa.selenium.WebElement;

public class WebDriverReusables {
	public static void enterText(WebElement element, String StrTxt)
	{
		element.sendKeys(StrTxt);
	}

}
