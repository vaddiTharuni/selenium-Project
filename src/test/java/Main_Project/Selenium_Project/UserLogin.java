package Main_Project.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLogin {
	
	WebDriver driver;
	By LoginButton= By.xpath("//a[@class='ico-login']");
	By emailid=By.name("Email");
	By Password=By.name("Password");
	By Login= By.xpath("//button[@class='button-1 login-button']");
			
	public UserLogin(WebDriver driver){
		this.driver= driver;
	}
	
	public void clickOnLogin() {
		driver.findElement(LoginButton).click();
	}
	public void enterEmailId(String email) {
		driver.findElement(emailid).sendKeys(email);
	}
	public void enterPassword(String passelelements) {
		driver.findElement(Password).sendKeys(passelelements);
	}
	public void clickOnLoginButton() {
		driver.findElement(Login).click();
	}

}
