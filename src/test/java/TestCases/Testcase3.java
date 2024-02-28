package TestCases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import Main_Project.Selenium_Project.AddProducts;
import Main_Project.Selenium_Project.UserLogin;

public class Testcase3 {
	@Test
	
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vadde\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  
		  
		  UserLogin ul = new  UserLogin(driver);
		  ul.clickOnLogin();
		  ul.enterEmailId("tharunivaddi20@gmail.com");
		  ul.enterPassword("ab@134");
		  ul.clickOnLoginButton();
		  
		  
		  AddProducts ad= new AddProducts(driver);
		  ad.clickOnElectronics();
		  ad.clickOnCameraAndPhoto();
		  ad.clickOnLeicacamera();
		  ad.addItemtocart();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  ad.itemAddOrNot();
		  Thread.sleep(5000);
		  ad.clickOnLogout();
		  
		  
		  
		  
		  
		  
	}
		  }


	

