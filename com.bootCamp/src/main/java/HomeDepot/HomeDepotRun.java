package HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomeDepotRun {
	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\transportssa\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.homedepot.com");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
