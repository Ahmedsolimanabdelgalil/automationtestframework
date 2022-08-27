package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class vodafonepage extends Pagebase {

	public vodafonepage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = "span.lang")
	WebElement selectlanguagebutton;
	@FindBy(css = "img.brandImg")
	WebElement selectbrandbutton;
	@FindBy(css = "img.productList.cardImage")
	WebElement selectphonebutton;
	@FindBy(id = "search-q")
	WebElement searchtxt;
	@FindBy(css = "div.searchSection-searchResult-listItem-title")
	List<WebElement> searchsuggestion;
	@FindBy(css = "button.btn.btn-red.btn-block.fontLightEnAr")
	WebElement addtocartbtn;
	@FindBy(xpath = "/html/body/app-root/app-shoping-cart/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/button")
	WebElement checktoproceedbutton;
	@FindBy(css = "select.btn.dropdown-toggle.checkout-dropdown.border-radius_Style.checkoutDeliveryFamilyFont")
	WebElement options1;
	@FindBy(xpath = "//*[@id=\"headingOne\"]/div[2]/select")
	WebElement options2;
	@FindBy(css = "div.checkout-DelivaryOptionsRes")
	WebElement deliverbutton;
	@FindBy(xpath = "//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[1]/div/input")
	WebElement streettxt;
	@FindBy(xpath = "//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[2]/div/input")
	WebElement buildnotxt;
	@FindBy(xpath = "//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[3]/div/input")
	WebElement floornotxt;
	@FindBy(xpath = "//*[@id=\"checkout-deliveryAdd\"]/div[1]/div[1]/div/div[4]/div/input")
	WebElement appartmentnotxt;
	@FindBy(xpath = "//*[@id=\"checkout-deliveryAdd\"]/div[3]/button")
	WebElement continuebutton;
	@FindBy(id = "shippingAddressContinue")
	WebElement personalinfocontinuebutton;
	@FindBy(xpath = "//*[@id=\"collapseTwo\"]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div")
	public WebElement msg;

	public void languagebutton()
	{
		clickbutton(selectlanguagebutton);
	}
	public void selectbrand() throws InterruptedException
	{
		Thread.sleep(1000);
		clickbutton(selectbrandbutton);
	}
	public void selectphone() throws InterruptedException
	{
		clickbutton(selectphonebutton);
	}
	public void searchforelement(String searchbtn) throws InterruptedException
	{
		settextelementtext(searchtxt, searchbtn);
		searchsuggestion.get(0).click();
		clickbutton(addtocartbtn);
		Thread.sleep(500);
	}
	public void checktoproceed()
	{
		clickbutton(checktoproceedbutton);
	}
	public void selectoptions()
	{
		Select option1 = new Select(options1);
		option1.selectByVisibleText("Cairo");
	}
	public void selectoptions2()
	{
		Select option2 = new Select(options2);
		option2.selectByVisibleText("Ain Shams");
	}
	public void clickdeliverbutton()
	{
		clickbutton(deliverbutton);
	}
	public void fillingaddressfields(String streetname,String buildnumber, String floornumber, String appartmentnumber)
	{
		settextelementtext(streettxt, streetname  );
		settextelementtext(buildnotxt, buildnumber);
		settextelementtext(floornotxt, floornumber);
		settextelementtext(appartmentnotxt, appartmentnumber);
	}
	public void continuebtn()
	{
		clickbutton(continuebutton);
	}
	public void personalinfocontinuebtn() throws InterruptedException
	{
		Thread.sleep(1000);
		clickbutton(personalinfocontinuebutton);
	}
}
