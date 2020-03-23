package ExpediaBcamp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class ExpediaBooking {
	WebDriver driver;

	@Test(priority = 0) // flight booking page
	public void one() throws InterruptedException {

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// click on flight tab
		driver.findElement(By.id("tab-flight-tab-hp")).click();

		// click on depart location
		driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("iad");

		// click on arrival location
		driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("nyc");

		Thread.sleep(2000);

		// click on roundtrip option
		driver.findElement(By.id("flight-type-roundtrip-label-hp-flight")).click();

		// click on depart date
		driver.findElement(By.xpath("//*[@id=\"flight-departing-hp-flight\"]")).click();

		// select depart date
		driver.findElement(By.xpath("(//button[@type='button'])[81]")).click();

		// click on return date
		driver.findElement(By.xpath("//*[@id=\"flight-returning-hp-flight\"]")).click();

		// select return date
		driver.findElement(By.xpath("(//button[@type='button'])[88]")).click();

		// click on advisory
		driver.findElement(By.id("travel-advisory-close-button")).click();

		Thread.sleep(2000);

		// click on search button
		driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button")).click();
		Thread.sleep(6000);
	}

	@Test(priority = 1) // flight package and fare selection
	public void two() throws InterruptedException {

		// select flight and click
		driver.findElement(By.xpath(
				"//*[@id=\"flight-module-2020-04-20t08:15:00-04:00-coach-iad-ewr-ua-323_2020-04-27t07:59:00-04:00-coach-ewr-iad-ua-4899_\"]/div[1]/div[1]/div[2]/div/div[2]/button"))
				.click();
		Thread.sleep(2000);

		// select this fair
		driver.findElement(By.xpath("//*[@id=\"basic-economy-tray-content-1\"]/div/div/div[1]/button")).click();

		Thread.sleep(2000);
		// select flexible date
		driver.findElement(By.xpath(
				"//*[@id=\"flight-module-2020-04-20t08:15:00-04:00-coach-iad-ewr-ua-323_2020-04-27t15:00:00-04:00-coach-ewr-iad-ua-1648_\"]/div[1]/div[1]/div[2]/div/div[2]/button"))
				.click();

		Thread.sleep(2500);
		// click flexible date
		driver.findElement(By.xpath("//*[@id=\"basic-economy-tray-content-1\"]/div/div/div[1]/button")).click();

		Thread.sleep(2500);
		// click on no thanks
		driver.findElement(By.xpath("//*[@id=\"forcedChoiceNoThanks\"]")).click();

		Thread.sleep(2000);

	}

	@Test(priority = 2) // passenger information and final booking
	public void three() throws InterruptedException {

		// ArrayList<String> page = new ArrayList<String>(driver.getWindowHandles());

		// by clicking on select trip final payment, new page opened, to swtich to new
		// window now:
		// driver.switchTo().window(page.get(1));

		String parentwindow = driver.getWindowHandle();
		for (String subwindow : driver.getWindowHandles()) {
			driver.switchTo().window(subwindow);
		}

		Thread.sleep(5000);
		// click on continue booking
		driver.findElement(By.xpath("//*[@id=\"bookButton\"]")).click();

		Thread.sleep(5000);

		// first name
		driver.findElement(By.xpath("//*[@id=\"firstname[0]\"]")).sendKeys("bootcamp");
		// middle name
		driver.findElement(By.xpath("//*[@id=\"middlename[0]\"]")).sendKeys("winter");
		// last name
		driver.findElement(By.xpath("//*[@id=\"lastname[0]\"]")).sendKeys("automation");
		// phone number
		driver.findElement(By.xpath("//*[@id=\"phone-number[0]\"]")).sendKeys("703307703330");
		driver.findElement(By.xpath("//*[@id=\"gender_male[0]\"]")).click();

		Select pick = new Select(driver.findElement(By.id("date_of_birth_month0")));
		pick.selectByIndex(6);
		Select day = new Select(driver.findElement(By.id("date_of_birth_day[0]")));
		day.selectByVisibleText("06");
		Select year = new Select(driver.findElement(By.id("date_of_birth_year[0]")));
		year.selectByVisibleText("2001");

	}

	@BeforeClass
	public void beforeClass() {// browse expedia.com via chrome browser and trigering pageload and implicitly
								// wait
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\transportssa\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://expedia.com");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}