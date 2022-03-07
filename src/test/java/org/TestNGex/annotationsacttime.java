package org.TestNGex;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.Basicutilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;

public class annotationsacttime {
	WebDriver driver;

	@BeforeMethod
	public void login() {

		String url ="http://localhost/login.do";
		Basicutilities obj1 = new Basicutilities();
		driver = obj1.startup("ff", url);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");;
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");;
		driver.findElement(By.cssSelector("#loginButton")).click();

	}
	@Test
	public void verifydeshbord() {
		String acturl =driver.getCurrentUrl();
		if(acturl.equals("http://localhost/user/submit_tt.do")) {
			System.out.println("login match url");
		}
		else {
			System.out.println("not match url ");
		}
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
  }

}
