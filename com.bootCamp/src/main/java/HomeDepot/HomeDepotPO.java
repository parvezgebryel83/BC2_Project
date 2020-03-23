package HomeDepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeDepotPO {
	

		@FindBy (xpath="//*[@id=\"email\"]")
		WebElement email;
				
		@FindBy (xpath="//*[@id=\"password-input-field\"]")
		WebElement password;
		
		@FindBy (xpath="//*[@id=\"zipCode\"]")
		WebElement zipecode;
				
		@FindBy (xpath="//*[@id=\"phone\"]")
		WebElement phone;
		
				
		@FindBy (xpath="//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span")
		WebElement createAccount;
		
				public  HomeDepotPO(WebDriver driver) {
			PageFactory.initElements(driver, this);
				
		}
		public void email(String em) {
			email.sendKeys(em);
		}
		public void password(String pass) {
			password.sendKeys(pass);
		}
		public void zipecode (String zip) {
			zipecode.sendKeys(zip);
		}
		public void phone(String phn) {
			phone.sendKeys(phn);
		}
		public void createAccount() {
			createAccount.click();
		}
		}