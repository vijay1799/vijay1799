package windowhandleing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class Ex1 {
public static void main(String[]args) {
	String url ="https://demoqa.com/browser-windows";
	Basicutilities obj = new Basicutilities();
	WebDriver driver = obj.startup("ch", url);
	String parentId = driver.getWindowHandle();
	System.out.println(parentId);
	String  urlcurr = driver.getCurrentUrl();
	System.out.println(urlcurr);
	driver.findElement(By.id("windowButton")).click();
	Set <String>allids=driver.getWindowHandles();
	Iterator <String>itr =allids.iterator();
	String id1 = itr.next();
	System.out.println(id1);
	String  urlcurr1 = driver.getCurrentUrl();
	System.out.println(urlcurr1);
	String id2 = itr.next();
	System.out.println(id2);
	driver.switchTo().window(id2);
	String  urlcurr2 = driver.getCurrentUrl();
	System.out.println(urlcurr2);
	WebElement  ele =driver.findElement(By.id("sampleHeading"));
	System.out.println(ele);
	driver.close();
	driver.switchTo().window(id1);
	String urlparent =driver.getCurrentUrl();
	System.out.println(urlparent );
	
	
	
	
}
}
