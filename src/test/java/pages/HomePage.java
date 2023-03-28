package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	public String Home_URL = "https://www.wafilife.com/";
	public String HomeTitle ="Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";
	public By Login = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
	
	public void home() {
		clickOnElement(Login);
		
	}

}
