package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.Basicutilities;

public class Findelementfilp {
public static void main ( String[]args) {
	String url = "https://www.flipkart.com/";
	Basicutilities obj = new Basicutilities ();
    WebDriver driver = obj.startup("ch", url);
    WebElement cancel = driver.findElement(By.cssSelector("button[class=\"_2KpZ6l _2doB4z\"]"));
	//WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
  //  wt.until(ExpectedConditions.elementToBeClickable(cancel));
    cancel.click();
    WebElement intext = driver.findElement(By.cssSelector("input[class='_3704LK']"));
    intext.sendKeys("samsung m32");
    WebElement search = driver.findElement(By.cssSelector("svg[viewBox=\"0 0 17 18\"]")) ;
    search.click();
    driver.findElement(By.className("_1LKTO3"));
   // List <WebElement> mname =driver.findElements(By.cssSelector("div[class='_4rR01T']"));
    //for(int i=0;i<mname.size(); i++) {
   
      //   System.out.println(mname.get(i).getText());
    	// }
    
    
    
}
}
