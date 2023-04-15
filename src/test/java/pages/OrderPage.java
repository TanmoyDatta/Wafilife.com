package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import static utilities.DriverSetUp.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage extends BasePage{
	public By order = By.xpath("//div[@class='body-wrapper']//button[2]");
	public String BookTitle = "Exam Oriented Anatomy - 1st to 3rd Part (For 1st and 2nd Year MBBS Students) - Dr. Estiak Ullah Sahid (DMC), Dr. Md. Alauddin Saddam, Dr. Md. Mashuq Rahman (DMC), Dr. Md. Shainur Islam (DMC), Dr. Md. Shariful Islam | এক্সাম অরিয়েন্টেড অ্যানাটমি | Wafilife";
	public By orderConfrim = By.cssSelector("a[title='checkout'] span");
	
//	public void OrderBook() {
//		assertEquals(BookTitle,"Exam Oriented Anatomy - 1st to 3rd Part (For 1st and 2nd Year MBBS Students) - Dr. Estiak Ullah Sahid (DMC), Dr. Md. Alauddin Saddam, Dr. Md. Mashuq Rahman (DMC), Dr. Md. Shainur Islam (DMC), Dr. Md. Shariful Islam | এক্সাম অরিয়েন্টেড অ্যানাটমি | Wafilife");
//		clickOnElement(order);
//		
//		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(orderConfrim));
//		clickOnElement(orderConfrim);
//	}
}