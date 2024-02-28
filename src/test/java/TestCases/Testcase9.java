package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Main_Project.Selenium_Project.AddProducts;
import Main_Project.Selenium_Project.UserLogin;

public class Testcase9 {
	@Test
	
	public void productscreenshot() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vadde\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  
		  
		  UserLogin ul = new  UserLogin(driver);
		  ul.clickOnLogin();
		  ul.enterEmailId("tharunivaddi20@gmail.com");
		  ul.enterPassword("ab@134");
		  ul.clickOnLoginButton();
		  AddProducts sc = new AddProducts(driver);
		  sc.searchtheproduct();
		 sc.searchtheproduct();
		 sc.scrollthepage();
		 Thread.sleep(4000);
		 sc.screenshot();
		 Thread.sleep(5000);
		 sc.clickOnLogout();
		 
		 
		
	}

}
