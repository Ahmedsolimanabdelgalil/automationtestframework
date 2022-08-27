package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {
	public JavascriptExecutor jse;
	protected WebDriver driver;
	public Pagebase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	protected static void clickbutton(WebElement button)
	{
		button.click();
	}
	protected static void settextelementtext(WebElement textelement, String value)
	{
		textelement.sendKeys(value);
	}
	public void scrolltobuttom() 
	{
		jse.executeScript("scrollBy(0,400)");
	}
	

}
