package HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotMyAcc {
	
	@FindBy(xpath = "//*[@id=\"headerMyAccountTitle\"]/div")
	WebElement myAccount;

	@FindBy(xpath = "//*[@id=\"SPSORegister\"]/a/span")
	WebElement register;

	public HomeDepotMyAcc(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void myAccount() throws InterruptedException {
		myAccount.click();
    Thread.sleep(2000);
	}

	
 
	public void register() {
		register.click();
	}
}