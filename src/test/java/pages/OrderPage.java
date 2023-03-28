package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class OrderPage extends BasePage{
	public By order = By.xpath("//div[@class='body-wrapper']//button[2]");
	public String BookTitle = "Exam Oriented Anatomy - 1st to 3rd Part (For 1st and 2nd Year MBBS Students) - Dr. Estiak Ullah Sahid (DMC), Dr. Md. Alauddin Saddam, Dr. Md. Mashuq Rahman (DMC), Dr. Md. Shainur Islam (DMC), Dr. Md. Shariful Islam | এক্সাম অরিয়েন্টেড অ্যানাটমি | Wafilife";
	public By orderConfrim = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
	
	public void OrderBook() {
		assertEquals(BookTitle,"Exam Oriented Anatomy - 1st to 3rd Part (For 1st and 2nd Year MBBS Students) - Dr. Estiak Ullah Sahid (DMC), Dr. Md. Alauddin Saddam, Dr. Md. Mashuq Rahman (DMC), Dr. Md. Shainur Islam (DMC), Dr. Md. Shariful Islam | এক্সাম অরিয়েন্টেড অ্যানাটমি | Wafilife");
		clickOnElement(order);
		//clickOnElement(orderConfrim);
		
	}

}
