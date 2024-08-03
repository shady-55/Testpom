package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	FirefoxDriver driver;

	By username = By.id("username");
	By Password = By.id("password");
	By Inpatienlocation = By.id("Inpatient Ward");
	By loginBtn = By.id("loginButton");
	By Isolationlocation = By.id("Isolation Ward");


	public LoginPage(FirefoxDriver driver) {


		this.driver= driver;
	}



	public void setUserName(String UserName) {

		driver.findElement(username).sendKeys(UserName);


	}



	public void setPassword(String userPassword) {

		driver.findElement(Password).sendKeys(userPassword);


	}


	public void selectInpatientLocation() {


		driver.findElement(Inpatienlocation).click();


	}

	public void clickLogin() {


		driver.findElement(loginBtn).click();


	} 

	public void Login(String username, String password,String location) {
		setUserName(username);
		setPassword(password);
		selectLocation(location);
		clickLogin();



	}



	private void selectLocation(String location) {

		switch(location) {


		case "inpatient" :

			driver.findElement(Inpatienlocation).click();
			break;
		case "isolation":
			driver.findElement(Isolationlocation).click();
			break;



		}



	}



}
