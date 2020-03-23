package ExceptionsJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThtownException {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\transportssa\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(20000);// Thread.sleep is also one of the exceptions used to pause selenium for hinting
							// or executing its test or codes
							// when ever we write this code it shows error,by hovering mouse it asks us to
							// throw exception or surround try/cath
		driver.findElement(By.id("g000")).click();// here i give fake locator id so that java throws the No Such Element
													// Exception

	}

}
