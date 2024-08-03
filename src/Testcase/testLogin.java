package Testcase;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class testLogin  extends driverconstructor {
	String baseUrl ="https://demo.openmrs.org/";
	String Expextedtitle = "Home";
	LoginPage Loginpage;

	@BeforeClass
	public void openLoginPage() {

		driver.get(baseUrl);

		Loginpage	= new LoginPage(driver);

	}

	@Test
	public void testInpatientUserLogin() {

		Loginpage.Login("Admin", "Admin123","inpatient");

		String Actualtitle	= driver.getTitle();

		assertEquals(Actualtitle, Expextedtitle);
	}


	@Test
	public void testIsolationUserLogin() {


		Loginpage.Login("Admin", "Admin123","isolation");

		String Actualtitle	= driver.getTitle();
		
		assertEquals(Actualtitle, Expextedtitle);


	}
	
	@AfterMethod
	public void backToLoginPage() {

		HomePage homepage = new HomePage(driver);
		
		homepage.logout();


	}





}
