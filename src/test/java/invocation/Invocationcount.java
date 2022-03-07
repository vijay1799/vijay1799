package invocation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import org.utilities.Basicutilities;


public class Invocationcount {
	@Test(invocationCount=2,threadPoolSize=2)
public void Invocationex1() {
	String url ="http://localhost/login.do";
	Basicutilities obj = new Basicutilities();
	 WebDriver driver=obj.startup("ch", url);
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
	driver.findElement(By.cssSelector("#loginButton")).click();

}
}
