package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.utilities.Basicutilities;

public class Actionclass {
	public static void main(String[] args) throws Exception {
		String url= "https://demoqa.com/droppable";
        Basicutilities obj = new Basicutilities();
        WebDriver driver =obj.startup("ch", url);
        Thread.sleep(2000);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        //act.dragAndDrop(drag, drop).perform();
        //DRAGANDDROP USEING CLICK AND HOLD
        act.clickAndHold(drag).moveToElement(drop).release().perform();
	}

}

