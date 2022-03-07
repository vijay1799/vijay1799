package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.Basicutilities;

public class Dragdropby {
public static void  main(String[]args) throws InterruptedException {
	String url= "https://demoqa.com/droppable";
    Basicutilities obj = new Basicutilities();
    WebDriver driver =obj.startup("ch", url);
    
    WebElement drag = driver.findElement(By.id("draggable"));
	Actions act = new Actions (driver);
	act.dragAndDropBy(drag, 250, 120).perform();
	
	
}
}
