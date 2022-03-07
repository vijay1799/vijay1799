package windowhandleing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class Genericwindowhandling {
public static void main(String[] args) {
	String url ="https://demoqa.com/browser-windows";
	Basicutilities obj = new Basicutilities();
    WebDriver driver = obj.startup("ch", url);
    driver.findElement(By.id("windowButton")).click();
    String parentid1 = driver.getWindowHandle();
   Set<String> allwindowid =driver.getWindowHandles();
   Iterator <String>itr =allwindowid.iterator();
    while(itr.hasNext()) {
    	String id1 = itr.next();
    	if(!parentid1 .equals(id1)) {
    		driver.switchTo().window(id1);
    		List<WebElement>ele= driver.findElements(By.id("sampleHeading"));
    		if(!ele.isEmpty()) {
    			String text = ele.get(0).getText();
    			System.out.println(text);
    			break;
    		}
    	}
    }
    
	}

}
