package org.basic_methods;

import org.openqa.selenium.WebDriver;
import org.utilities.Basicutilities;


public class Callforbasicutilities {

	public static void main(String[] args) {
	 String url ="https://www.facebook.com";
	 Basicutilities obj = new  Basicutilities();
	 WebDriver driver =obj.startup("ch",url);
	String currurl = driver.getCurrentUrl();
	 System.out.println("enter URL is "+currurl );
	  String pagetitle =driver.getTitle();
	  System.out.println(pagetitle );
	  driver.close();
	 // driver.quit();
	}

}
