package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.vodafonepage;

public class Testvodafone extends Testbase {
	vodafonepage vodafoneobject;
	Homepage homeobject;
	@Test(priority = 1)
	public void runvodafonetest1() throws InterruptedException
	{
		vodafoneobject = new vodafonepage(driver);
		homeobject = new Homepage(driver);
		vodafoneobject.languagebutton();
		homeobject.forwardtobrandsection();
		vodafoneobject.selectbrand();
	}
	@Test(priority = 2)
	public void runvodafonetest2() throws InterruptedException
	{
		vodafoneobject.searchforelement("Air");
	}
	@Test(priority = 3)
	public void runchecktoproceed() throws InterruptedException
	{
		Thread.sleep(2000);
		homeobject.forwardtobrandsection();
		vodafoneobject.checktoproceed();
	}
	@Test(priority = 4)
	public void runselectoptions1()
	{
		homeobject.forwardtobrandsection();
		vodafoneobject.selectoptions();
	}
	@Test(priority = 5)
	public void runselectoptions2()
	{
		vodafoneobject.selectoptions2();
	}
	@Test(priority = 6)
	public void rundeliverbutton()
	{
		vodafoneobject.clickdeliverbutton();
	}
	@Test(priority = 7)
	public void runfillingaddress()
	{
		vodafoneobject.fillingaddressfields("ahmedmohamed", "3", "3", "6");;
	}
	@Test(priority = 8)
	public void runcontinuebtn()
	{
		homeobject.forwardtobrandsection();
		vodafoneobject.continuebtn();
	}
	@Test(priority = 9)
	public void runpersonalinfo() throws InterruptedException
	{
		vodafoneobject.personalinfocontinuebtn();
		Assert.assertTrue(vodafoneobject.msg.getText().contains("Please enter a valid name"));
	}

}
