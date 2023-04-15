package testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.AfterLoginPage;
import pages.HomePage;
import pages.LekhokPage;
import pages.LogInPage;
import pages.OrderPage;
import pages.SharifulBookPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class TestCases extends DriverSetUp{
	HomePage homePage = new HomePage();
	LogInPage logInPage = new LogInPage();
	AfterLoginPage afterLoginPage = new AfterLoginPage();
	LekhokPage lekhokPage = new LekhokPage();
	SharifulBookPage sharifulBookPage = new SharifulBookPage();
	OrderPage orderPage = new OrderPage();
	
	@Test(dataProvider = "ValidCredensial", dataProviderClass = DataSet.class)
	public void testCases(String username, String password) throws InterruptedException {
		getDriver().get("https://www.wafilife.com/");
		assertEquals(homePage.HomeTitle,"Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife");
		Thread.sleep(2000);
		homePage.home();
		Thread.sleep(2000);
		
		// logInPage
	//	assertEquals(getDriver().getCurrentUrl(),"https://www.wafilife.com/my-account/");
		//logInPage.getElementText(logInPage.Login_BTN);
		logInPage.dologin(username,password);
		Thread.sleep(2000);
		afterLoginPage.lekhokBook_BTN();
		
		//lekhokPage
		assertEquals(lekhokPage.lekhokTitle,"English & Bangla Islamic Books by Authors | Wafilife");
		lekhokPage.ScrollByLekhokNextPage();
		
		// sharifulBookPage
		assertEquals(sharifulBookPage.SharifulBookPageTitle,"Dr. Md. Shariful Islam Books | List of books by author Dr. Md. Shariful Islam | Wafilife");
		sharifulBookPage.SelectBookShow();
		
		// orderPage
		getDriver().get("https://www.wafilife.com/shop/books/exam-oriented-anatomy-1st-to-3rd-part-for-1st-and-2nd-year-mbbs-students");
		orderPage.clickOnElement(orderPage.order);
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(7));
		wait.until(ExpectedConditions.elementToBeClickable(orderPage.orderConfrim));
		getDriver().findElement(orderPage.orderConfrim).click();
		assertEquals(getDriver().getCurrentUrl(),"https://www.wafilife.com/checkout/");
		System.out.println("Check out Button Show");
		
	    
	}
}
