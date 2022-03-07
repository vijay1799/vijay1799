package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class Enabled {
public static void main(String []args) {
	String url= "https://demoqa.com/radio-button";
	Basicutilities obj = new Basicutilities ();
	WebDriver driver =obj.startup("ch", url);
	WebElement closeadt=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));closeadt.click();
	//if user label is give true,ture for enabled,is displayed
	WebElement yesbutton = driver.findElement(By.cssSelector("label[for='noRadio']"));
	//if user label is give flase,ture for enabled,is displayed
	//WebElement yesbutton1 = driver.findElement(By.id("noRadio"));
	System.out.println(yesbutton .isDisplayed());
	System.out.println(yesbutton .isEnabled());
	if (yesbutton.isEnabled()&& yesbutton.isDisplayed()) {}
	yesbutton.click();
	yesbutton.isSelected();
}
}
