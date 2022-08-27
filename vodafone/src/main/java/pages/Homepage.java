package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase 
{

	public Homepage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		
	}
	@FindBy(linkText = "Register")
	WebElement registerlink;
	public void openregisterpage()
	{
		clickbutton(registerlink);
	}
	public void forwardtobrandsection()
	{
		scrolltobuttom();
	}
	

}
