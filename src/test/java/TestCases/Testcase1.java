package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Main_Project.Selenium_Project.UserRegistration;

public class Testcase1 {
	@Test
	public void register() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vadde\\Downloads\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  UserRegistration ur = new UserRegistration(driver);
		  
		  ur.clickOnRegister();
		  ur.entergender();
		  ur.enterFirsname("harini");
		  ur.enterLastname("v");
		  ur.enterEmailId("tharunivaddi20@gmail.com");
		  ur.enterPassword("ab@134");
		  ur.enterconformPassword("ab@134");
		  ur.clickOnRegister();
		  
		  driver.quit();
		  

}
}
