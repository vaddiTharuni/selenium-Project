package Main_Project.Selenium_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UserRegistration {
	WebDriver driver;
	    By registerlink= By.xpath("//a[@class='ico-register']");
		By gender= By.id("gender-female");
		By Firstname = By.name("FirstName");
		By Lastname= By.name("LastName");
		By EmailId= By.name("Email");
		By Password= By.name("Password");
		By ConfirmPassword= By.name("ConfirmPassword");
		By register= By.name("register-button");
		   public UserRegistration(WebDriver driver){
			this.driver= driver;
		}
		public void clickOnRegister() {
			driver.findElement(registerlink).click();
		}
		public void entergender() {
			driver.findElement(gender).click();
		}
		public void enterFirsname(String fname) {
			driver.findElement(Firstname).sendKeys(fname);
		}
		public void enterLastname(String Lname) {
			driver.findElement(Lastname).sendKeys(Lname);
		}
		public void enterEmailId(String Email) {
			driver.findElement(EmailId).sendKeys(Email);
		}
		public void enterPassword(String pass) {
			driver.findElement(Password).sendKeys(pass);
		}
		public void enterconformPassword(String password) {
			driver.findElement(ConfirmPassword).sendKeys(password);
		}
		public void clickOnRegisterButton() {
			driver.findElement(register).click();
		}
		
		
		
			
			
		}


