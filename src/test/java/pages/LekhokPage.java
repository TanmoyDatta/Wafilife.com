package pages;

import static utilities.DriverSetUp.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LekhokPage extends BasePage{
	public String lekhokTitle = "English & Bangla Islamic Books by Authors | Wafilife";
	public By SharifulIslamBook = By.xpath("//h3[normalize-space()='Dr. Md. Shariful Islam']");
	
	public void ScrollByLekhokNextPage() throws InterruptedException {
		WebElement sharifulIslamBook = getElement(SharifulIslamBook);
//		Actions actions = new Actions(getDriver());
//		actions.moveToElement(next_page).build().perform();
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();",sharifulIslamBook);
		Thread.sleep(2000);
		sharifulIslamBook.click();
		Thread.sleep(2000);
		
		
	}
}
