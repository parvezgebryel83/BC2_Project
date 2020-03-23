package HomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class HDexecuter extends HomeDepotRun {

	

	@Test (priority = 0)
	public void one() throws InterruptedException {

		HomeDepotMyAcc hdm = new HomeDepotMyAcc(driver);
		hdm.myAccount();
		hdm.register();
	}
	
		@Test(priority = 1)
    	@Parameters({ "ema", "pas", "zipe", "phon" })
		public void two (String em, String pass, String zip, String phn) {

		HomeDepotPO po = new HomeDepotPO(driver);
		po.email(em);
		po.password(pass);
		po.zipecode(zip);
		po.phone(phn);
		 po.createAccount();

	};

}
