package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.Basicutilities;

public class Explicitwait {
public static void main(String[]args) {
	String url ="http://localhost/login.do";
	Basicutilities obj1 = new Basicutilities();
	 WebDriver driver = obj1.startup("ff", url);
	 //whem we use findelement and change altribute value they give exception no such element find
	WebElement unfield = driver.findElement(By.cssSelector("input[id='username']"));
	unfield.sendKeys("admin");
	WebElement password =driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
	password.sendKeys("manager");
	WebElement login=driver.findElement(By.cssSelector("#loginButton"));
	login.click();
	WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
	wt.until(ExpectedConditions.elementToBeSelected(By.id("logoutLink")));
	
	
	
}



}
