package Main_Project.Selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UserLogin {
	
	WebDriver driver;
	By LoginButton= By.xpath("//a[@class='ico-login']");
	By emailid=By.name("Email");
	By Password=By.name("Password");
	By Login= By.xpath("//button[@class='button-1 login-button']");
	 By Account = By.xpath("//a[@class='ico-account']");
	 By Address= By.xpath("//*[text()='Addresses'][1]");
	 By newAddress= By.xpath("//button[@class='button-1 add-address-button']");
	 By FirstName=By.name("Address.FirstName");
	 By LastName=By.id("Address_LastName");
	 By EmailID= By.id("Address_Email");
	 By CompanyName= By.name("Address.Company");
	 By cityName= By.id("Address_City");
	 By AddressDetails= By.id("Address_Address1");
	 By pincode= By.id("Address_ZipPostalCode");
	 By phomenumber= By.id("Address_PhoneNumber");
	 By save = By.xpath("//button[@class='button-1 save-address-button']");
	 By Logout = By.xpath("//a[@class='ico-logout']");
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
  public void clickOnAccount() {
		driver.findElement(Account).click();
		}
  public void clickOnAddress() {
		driver.findElement(Address).click();
		}
	public void clickOnNewAddress() {
		driver.findElement(newAddress).click();
		}
	public void enterFirstName() {
		driver.findElement(FirstName).sendKeys("harini");
		}
 public void enterLastName() {
	 driver.findElement(LastName).sendKeys("v");
 }
 public void enterEmailID() {
	 driver.findElement(EmailID).sendKeys("tharunivaddi20@gmail.com");
 }
 public void enterCompanyName() {
	 driver.findElement(CompanyName).sendKeys("Fita");
 }
 public void selectCountry() {
	 Select selection= new Select(driver.findElement(By.id("Address_CountryId")));
	 selection.selectByIndex(100);
	  }
 public void enterCityName() {
	 driver.findElement(cityName).sendKeys("chennai");
 }
 public void enterAddressDetails() {
	 driver.findElement(AddressDetails).sendKeys("chennai, TamilNadu");
 }
 public void enterpincode() {
	 driver.findElement(pincode).sendKeys("12345");
 }
 public void enterphonenumber() {
	 driver.findElement(phomenumber).sendKeys("1234567890");
 }
 public void clicksavebutton() {
	 driver.findElement(save).click();
 }
 public void scrollthepages() {
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,600)");
 }
 public void clickOnLogout() {
	   driver.findElement(Logout).click();
 }
}
