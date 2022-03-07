package dropdown;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.Basicutilities;

public class Dropex1 {
public static void main(String[]args) throws InterruptedException {
	String url = "http://localhost/login.do";
	Basicutilities obj = new Basicutilities ();
	WebDriver driver = obj.startup("ch", url);
	WebElement unfield = driver.findElement(By.cssSelector("input[id='username']"));
	unfield.sendKeys("admin");
	WebElement password =driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
	password.sendKeys("manager");
	WebElement login=driver.findElement(By.cssSelector("#loginButton"));
	login.click();
	WebElement reporttap = driver.findElement(By.cssSelector("a[class= 'content reports']"));
	reporttap.click();
	WebElement newreport = driver.findElement(By.id("ext-gen18"));
	newreport.click();
	//WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(30));
	//wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("ext-gen108")));
    Thread.sleep(20000);
	// driver.switchTo().alert();
	Alert alt = driver.switchTo().alert();
	WebElement cddd= driver.findElement(By.id("reportName_4"));
    cddd.getText();
   // alt.accept();
    
	
	
	
}

}
