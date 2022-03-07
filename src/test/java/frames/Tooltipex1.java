package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.Basicutilities;

public class Tooltipex1 {
public static void main(String[]args) throws InterruptedException {
	String url ="https://demoqa.com/tool-tips";
	Basicutilities obj = new Basicutilities();
	WebDriver driver = obj.startup("ch", url);
    WebElement button = driver.findElement(By.id("toolTipButton"));
	Actions act = new Actions(driver);
	act.moveToElement(button).perform();
	Thread.sleep(2000);
	WebElement tooltipButton =driver.findElement(By.cssSelector(".tooltip-inner "));
	 String text =tooltipButton.getText();
	 System.out.println(text);
}



}
