package webelement;

import org.openqa.selenium.WebDriver;
import org.utilities.Basicutilities;

public class Browseropertion {
public static void main(String[]args) {
	String url = "https://www.google.com";
	Basicutilities obj1 = new Basicutilities();
	 WebDriver driver = obj1.startup("ch", url);
	 driver.navigate().to("https://www.facebook.com/");
	driver.navigate().to("https://drive.google.com/drive/u/0/starred");
	driver.navigate().back();
	driver.navigate().refresh();
}
}
