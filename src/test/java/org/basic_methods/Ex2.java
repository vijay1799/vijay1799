package org.basic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex2 {
	public void startup(String browsername) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		if (browsername.equalsIgnoreCase("chrome")||browsername.equalsIgnoreCase("ch")) {
            	System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");			
            //	ChromeDriver driver = new ChromeDriver();
            }
        }
	public WebDriver  startupusingwebDM(String browsername) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		WebDriver driver =null;
		if (browsername.equalsIgnoreCase("chrome")||browsername.equalsIgnoreCase("ch")) {
            	//System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
            	 driver = new ChromeDriver();
            }
		else if(browsername.equalsIgnoreCase("firedox")||browsername.equalsIgnoreCase("ff") ) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			}
		return driver;
         }
}