package Main_Project.Selenium_Project;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;



public class AddProducts {
WebDriver driver;
	
	By Electronics = By.xpath("//*[text()='Electronics ']");
	By CameraPhoto= By.xpath("//*[text()=' Camera & photo ']");
	By Leciacamera=By.xpath("//*[text()='Leica T Mirrorless Digital Camera'][1]");
	By Addcart = By.xpath("//button[@id='add-to-cart-button-16']");
	By shoppingcart=By.xpath("//span[@class='cart-label']");
	By cellphone=By.xpath("//*[text()=' Cell phones ']");
	By NokiaLumia=By.xpath("//*[text()='Nokia Lumia 1020'][1]");
	By addcart=By.id("add-to-cart-button-20");
	By searchbox = By.id("small-searchterms");
	By searchbutton = By.xpath("//button[@class='button-1 search-box-button']");
	By Productlist = By.xpath("//*[text()='Apple']");
	By Searchproduct= By.xpath("//input[@name='q']");

	
	
	
	 
	 public AddProducts(WebDriver driver){
		this.driver=driver; 
	}
	
	
   public void clickOnElectronics() {
	   driver.findElement(Electronics).click();
   }
   public void clickOnCameraAndPhoto() {
	   driver.findElement(CameraPhoto).click();
   }
   public void clickOnLeicacamera() {
	   driver.findElement(Leciacamera).click();
   }
   public void addItemtocart() {
	   driver.findElement(Addcart).click();
   }
   public void verifyOrderaddedOrNot() {
	   driver.findElement(shoppingcart).getText();
	    assertEquals("1", shoppingcart);
   }
  
   public void clickOnCellphone() {
	   driver.findElement(cellphone).click();
   }
   public void clickOnNokiaLumiaphone() {
	   driver.findElement(NokiaLumia).click();
   }
   public void additemtocart() {
	   driver.findElement(addcart).click();
   }
   public void searchiteam() {
	   driver.findElement(searchbox).sendKeys("HP Spectre XT Pro UltraBook");
   }   
   public void clickonsearchbutton() {
	   driver.findElement(searchbutton).click();
   }
   
   public void verifyOrderDetails() {
	   driver.findElement(shoppingcart).click();
   }
   public void productlists() {
	   driver.findElement(Productlist).getText();
	   
   }
   public void searchtheproduct() {
	   driver.findElement(Searchproduct).sendKeys("Elegant Gemstone Necklace (rental)");
	   driver.findElement(searchbutton).click();
   }
   
   
   public void screenshot() throws IOException {
	   TakesScreenshot screenshots=(TakesScreenshot)driver;
	    File file= screenshots.getScreenshotAs(OutputType.FILE);
	    File destination= new File("E:\\screenshots\\screenshot.jpeg");
	    FileHandler.copy(file, destination);
   }

}
