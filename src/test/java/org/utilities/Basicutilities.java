package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicutilities {
public WebDriver startup(String browsername,String url ) {
	String path = System.getProperty("user.dir");//Compulsory line
	WebDriver driver =null;
	if (browsername.equalsIgnoreCase("chrome")||browsername.equalsIgnoreCase("ch")) {
		//System.setProperty("Webdriver.chorme.driver", path+"\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		 }
	else if( browsername.equalsIgnoreCase("firedox")||browsername.equalsIgnoreCase("ff")) {
		System.setProperty("webdriver.gecko.driver", path+"\\Drivers\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 }
	driver.get(url);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	return driver;}
   public void  closepopup(WebDriver driver) {
	   driver.findElement(By.cssSelector("img[alt ='adplus-dvertising']")).click();;
	   }
   public void scrolltillelement(WebElement ele ,WebDriver driver) {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoview(true)", ele);
   }
   public void clickbyjs(WebElement ele,WebDriver driver) {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeAsyncScript("arguments[0].click();", ele);
   }
   
   
   
}
   
   

