package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	By LogoutBtn=By.linkText("Logout");
	FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void logout() {
		
		driver.findElement(LogoutBtn).click();		
		
	}

}
