package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage{
	public By Email_input = By.xpath("//input[@id='username']");
	public By Pass_input = By.xpath("//input[@id='password']");
	public By Login_BTN = By.xpath("//input[@value='লগইন']");

	public void dologin(String username, String password) {	
		writeTextOnElement(Email_input,username);
		writeTextOnElement(Pass_input,password);
		
		clickOnElement(Login_BTN);
		
		
	}


}
