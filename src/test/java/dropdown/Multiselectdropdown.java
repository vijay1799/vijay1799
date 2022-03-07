package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.Basicutilities;

public class Multiselectdropdown {

	public static void main(String[] args) {
		String url ="https://demoqa.com/select-menu";
	Basicutilities  obj = new Basicutilities();
	WebDriver driver = obj.startup("ch", url);
    WebElement closeadt=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));closeadt.click();
    WebElement DDLCOLOUR = driver.findElement(By.id("cars"));
	Select sel = new Select(DDLCOLOUR);
	for (int i =0; i<sel.getOptions().size();i++) {
	sel.selectByIndex(i);
	

	}
	}

}
