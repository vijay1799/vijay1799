package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.utilities.Basicutilities;

public class Gettext {
public static void main(String []args) {
	String url ="http://localhost/login.do";
	Basicutilities obj = new Basicutilities ();
	    WebDriver driver= obj.startup("ch", url);
		WebElement unfield = driver.findElement(By.cssSelector("input[id='username']"));
		unfield.sendKeys("admin");
		WebElement password =driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
		password.sendKeys("manager");
		WebElement login=driver.findElement(By.cssSelector("#loginButton"));
		login.click();
		
		WebElement taskbu= driver.findElement(By.cssSelector(".content.tasks>div[class='label'"));
		 taskbu.click();
		String tasktext= taskbu.getText();
	    System.out.println(tasktext);
	    
	
	
	
}
}
