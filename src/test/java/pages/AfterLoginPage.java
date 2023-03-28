package pages;

import org.openqa.selenium.By;

public class AfterLoginPage extends BasePage{
	public By lekhok = By.xpath("//span[contains(text(),'লেখক')]");
	public By Home_BTN = By.xpath("//span[@xpath=1]");
	
	public void lekhokBook_BTN() {
		clickOnElement(lekhok);
		
	}

}
