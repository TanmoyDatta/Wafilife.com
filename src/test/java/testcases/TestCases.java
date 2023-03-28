package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LogInPage;
import utilities.DriverSetUp;

public class TestCases extends DriverSetUp{
	HomePage homePage = new HomePage();
	LogInPage logInPage = new LogInPage();
	
	@Test
	public void testCases() {
		getDriver().get("https://www.wafilife.com/");
		assertEquals(homePage.HomeTitle,"Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife");
		//homePage.home();
		
	}

}
