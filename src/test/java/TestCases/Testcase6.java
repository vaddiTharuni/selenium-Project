package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import Main_Project.Selenium_Project.AddProducts;
import Main_Project.Selenium_Project.UserLogin;

public class Testcase6 {
	@Test
	
	public void homepage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vadde\\Downloads\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  
		  UserLogin ul = new  UserLogin(driver);
		  ul.clickOnLogin();
		  ul.enterEmailId("tharunivaddi20@gmail.com");
		  ul.enterPassword("ab@134");
		  ul.clickOnLoginButton();
		 
		  
		
		  
		 AddProducts ad= new AddProducts(driver);
		 ad.searchiteam();
		 ad.clickonsearchbutton();
		 
	}

}
