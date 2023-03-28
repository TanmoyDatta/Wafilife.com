package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.DriverSetUp.getDriver;

public class BasePage {
	
	// find locator
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	// Click method
	public void clickOnElement(By locator) {
		 getElement(locator).click();	
	}
	// Send keys method
	public void writeTextOnElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	// get text method
	public String getElementText(By locator){
		return getElement(locator).getText();
		
	}

}
