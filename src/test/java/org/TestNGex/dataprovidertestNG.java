package org.TestNGex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import org.utilities.Basicutilities;

public class dataprovidertestNG {
@Test(dataProvider ="testdata")

public  void  loginActTime( String bname,String uname,String pwd) throws InterruptedException {
		 System.out.println(bname);
		 System.out.println( uname);
		 System.out.println(pwd);
	String url ="http://localhost/login.do";
	Basicutilities obj = new Basicutilities();
     WebDriver driver =obj.startup(bname,url);
    driver.findElement(By.cssSelector("input[id='username']")).sendKeys(uname);
    driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys(pwd);
	driver.findElement(By.cssSelector("#loginButton")).click();
	Thread.sleep(2000);
	WebElement  textmsg =driver.findElement(By.className(".errormsg"));
	String msg =textmsg.getText();
	System.out.println(msg);
}
@DataProvider(name ="testdata")
public Object[][] logincredials(){
	Object[][] data = new Object[3][3];
	data[0][0]="ch";
	data[0][1]="admin";
	data[0][2]="manager";
	data[1][0]="ff";
	data[1][1]="admin1";
	data[1][2]="manager1";
	data[2][0]="ch";
	data[2][1]="admin2";
	data[2][2]="manager2";
	
	return data;
	
	
	
	
	
}




}
