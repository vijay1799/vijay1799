package org.TestNGex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.Basicutilities;
//parallel method
public class Parallelex1 {
	@Test
public void loginbychrome() {
	String url ="http://localhost/login.do";
	Basicutilities obj = new Basicutilities();
	 WebDriver driver=obj.startup("ch", url);
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
	driver.findElement(By.cssSelector("#loginButton")).click();

}
	@Test
public void loginbyfirebox() {
	String url ="http://localhost/login.do";
	Basicutilities obj = new Basicutilities();
	 WebDriver driver=obj.startup("ff", url);
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
	driver.findElement(By.cssSelector("#loginButton")).click();

}

}
