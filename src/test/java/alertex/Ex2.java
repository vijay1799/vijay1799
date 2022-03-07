package alertex;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.Basicutilities;

public class Ex2 {
public static void main(String []args) {
	String url ="https://demoqa.com/alerts";
	Basicutilities obj = new Basicutilities();
	WebDriver driver=obj.startup("ch", url);
	driver.findElement(By.id("timerAlertButton")).click();
	WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
	wt.until(ExpectedConditions.alertIsPresent());
	Alert alt = driver.switchTo().alert();//imp line for alert
	alt.accept();
}
}
