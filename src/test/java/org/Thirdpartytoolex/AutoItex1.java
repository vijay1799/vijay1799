package org.Thirdpartytoolex;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.utilities.Basicutilities;

public class AutoItex1 {
public static void main(String[]args) throws Exception {
	String url 	="https://demoqa.com/automation-practice-form";
	Basicutilities obj = new Basicutilities();
	WebDriver driver = obj.startup("ch", url);
	obj.closepopup(driver);
    WebElement uploadbutton = driver.findElement(By.id("uploadPicture"));
     //obj.scrolltillelement(uploadbutton, driver);
    	 obj.clickbyjs(uploadbutton, driver);
    	// try {
    Runtime.getRuntime().exec("D:\\serinimum\\autoitfile\\autoitfileforchrome.exe");
    	// }
    	// catch( Exception e) {
    		 
    	 //}
    	 
}
}
