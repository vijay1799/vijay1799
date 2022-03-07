package org.Thirdpartytoolex;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class Genericupload {
public static  void main(String[]args) throws IOException {
	String url 	="https://demoqa.com/automation-practice-form";
	Basicutilities obj = new Basicutilities();
	WebDriver driver = obj.startup("ch", url);
	obj.closepopup(driver);
    WebElement uploadbutton = driver.findElement(By.id("uploadPicture"));
     obj.scrolltillelement(uploadbutton, driver);
    	 obj.clickbyjs(uploadbutton, driver);
    	// String path = System.getProperty("user.dir");
    	 Runtime.getRuntime().exec("D:\\serinimum\\autoitfile\\Genericupload.exe");
    	
    	
}
}
