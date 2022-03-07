package alertex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.utilities.Basicutilities;

public class Ex1altert {

	public static void main(String[] args) {
		String url ="https://demoqa.com/alerts";
        Basicutilities obj = new Basicutilities();
       WebDriver driver = obj.startup("ch",url);
       driver.findElement(By.cssSelector("#promtButton")).click();
       Alert alt =driver.switchTo().alert();//compalarey line for alert case
       System.out.println(alt.getText()); 
       alt.sendKeys("vijay patil");
       alt.accept();
       
	}

}
