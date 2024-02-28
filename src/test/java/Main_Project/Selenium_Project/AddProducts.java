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
	By cellphone=By.xpath("//*[text()=' Cell phones ']");
	By NokiaLumia=By.xpath("//*[text()='Nokia Lumia 1020'][1]");
	By addcart=By.id("add-to-cart-button-20");
	By shoppingcart= By.xpath("//span[@class='cart-label']");
	By searchbox = By.id("small-searchterms");
	By searchbutton = By.xpath("//button[@class='button-1 search-box-button']");
	By Searchproduct= By.xpath("//input[@name='q']");
	By Logout = By.xpath("//a[@class='ico-logout']");
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
   public void clickOnCellphone() {
	   driver.findElement(cellphone).click();
   }
   public void clickOnNokiaLumiaphone() {
	   driver.findElement(NokiaLumia).click();
   }
   public void additemtocart() {
	   driver.findElement(addcart).click();
   }
    public void itemAddOrNot() {
	   driver.findElement(shoppingcart).click(); 
   }
   public void scrollthepage() {
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,600)");
   }
   public void searchiteam() {
	   driver.findElement(searchbox).sendKeys("HP Spectre XT Pro UltraBook");
   }   
   public void clickonsearchbutton() {
	   driver.findElement(searchbutton).click();
   }
  public void listtheproducts() {
	  String apple=driver.findElement(By.xpath("//*[text()='Apple MacBook Pro 13-inch']")).getText();
	  String appleproduct = driver.findElement(By.xpath("//*[text()='Apple iCam']")).getText();
	  System.out.println(apple);
	  System.out.println(appleproduct);
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
   public void searchTheAplleitems() {
	    
	   driver.findElement(Searchproduct).sendKeys("Apple");
	   driver.findElement(searchbutton).click();
   }
   public void clickOnLogout() {
	   driver.findElement(Logout).click();
 }
   }
   


