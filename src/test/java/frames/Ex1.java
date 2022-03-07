package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class Ex1 {
	public static void main(String[]args) {
		String url ="https://demoqa.com/frames";
		Basicutilities obj = new Basicutilities();
		WebDriver driver = obj.startup("ch",url);
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		System.out.println(ele.getText());
		
		
		
	}
	
	
	
	
}
