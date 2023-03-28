package pages;

import org.openqa.selenium.By;

public class SharifulBookPage extends BasePage{
	
	public String SharifulBookPageTitle = "Dr. Md. Shariful Islam Books | List of books by author Dr. Md. Shariful Islam | Wafilife";
    public By SelectBook = By.xpath("//div[@class='product_thumbnail_wrapper']//a");
    
    public void SelectBookShow() {
    	clickOnElement(SelectBook);
		
	}
}
