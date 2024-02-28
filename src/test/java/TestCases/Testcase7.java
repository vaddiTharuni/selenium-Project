package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Main_Project.Selenium_Project.UserLogin;

public class Testcase7 {
	@Test
	public void addnewaddress() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vadde\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();  
		  UserLogin ul = new  UserLogin(driver);
		  ul.clickOnLogin();
		  ul.enterEmailId("tharunivaddi20@gmail.com");
		  ul.enterPassword("ab@134");
		  ul.clickOnLoginButton();
		  Thread.sleep(4000);
		  ul.clickOnAccount();
		  ul.clickOnAddress();
		  ul.clickOnNewAddress();
		  ul.enterFirstName();
		  ul.enterLastName();
		  ul.enterEmailID();
		  ul.enterCompanyName();
		  ul.scrollthepages();
		  ul.selectCountry();
		  ul.enterCityName();
		  ul.enterAddressDetails();
		  ul.enterpincode();
		  ul.enterphonenumber();
		  ul.clicksavebutton();
          
	
}
}