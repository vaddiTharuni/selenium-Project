package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Main_Project.Selenium_Project.AddProducts;
import Main_Project.Selenium_Project.UserLogin;

public class Testcase5 {
	@Test
	public void orderDetails() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vadde\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  
		  UserLogin ul = new  UserLogin(driver);
		  ul.clickOnLogin();
		  ul.enterEmailId("tharunivaddi20@gmail.com");
		  ul.enterPassword("ab@134");
		  ul.clickOnLoginButton();
		  
		  AddProducts productDetails= new AddProducts(driver);
		  productDetails.clickOnElectronics();
		  productDetails.clickOnCameraAndPhoto();
		  productDetails.clickOnLeicacamera();
		  productDetails.addItemtocart();
		  Thread.sleep(5000);
		  productDetails.clickOnElectronics();
		  productDetails.clickOnCellphone();
		  productDetails.clickOnNokiaLumiaphone();
		  productDetails.additemtocart();
		  productDetails.itemAddOrNot();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		  productDetails.scrollthepage();
		  Thread.sleep(4000);
		  productDetails.clickOnLogout();
		  
		  
		 
		
	}

}
