package Testcase;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class driverconstructor {
	
static FirefoxDriver driver;
	
	@BeforeTest
	public void  setUp() {
		
		System.setProperty("webdriver.gecko.driver","D:\\Tessting\\geckodriver.exe");
		driver = new FirefoxDriver();
		


	}
	
	
	@AfterTest
	public void teardown() {

		driver.quit();



	}


}
