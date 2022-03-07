package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.Basicutilities;

public class Rightclick {
public static void main(String[]args) {
	String url ="http://localhost/login.do";
	Basicutilities obj1 = new Basicutilities();
	 WebDriver driver = obj1.startup("ch", url);
	 WebElement unfield = driver.findElement(By.cssSelector("input[id='username']"));
	unfield.sendKeys("admin");
	WebElement password =driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
	password.sendKeys("manager");
	WebElement login=driver.findElement(By.cssSelector("#loginButton"));
	login.click();
	WebElement taskbu= driver.findElement(By.cssSelector("a[class='content tasks']"));
	Actions act = new Actions(driver);
	act.contextClick(taskbu).perform();
	//NOTEPOINT- Do not miss to right .perform
}
}
