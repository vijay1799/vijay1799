package propertyfile;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class ConfigReader {
public static void main(String []args) throws IOException {
	ConfigReader obj = new ConfigReader();
	String bname= obj.gettestdataforconfig("browsername");
	String url = obj.gettestdataforconfig("url");
	String uname = obj.gettestdataforconfig("username");
	String pwd= obj.gettestdataforconfig("password");
	Basicutilities obj1 = new Basicutilities();
	 WebDriver driver = obj1.startup(bname,url);
	 driver.findElement(By.cssSelector("input[id='username']")).sendKeys( uname);
	driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys(pwd);
	
	driver.findElement(By.cssSelector("#loginButton")).click();
	}
public String gettestdataforconfig(String key) throws IOException {
	String path = System.getProperty("user.dir");
	//. means u on project path and no need write of system.getproperty("system.dir");
	FileInputStream filein = new FileInputStream(path+"\\propertyFile\\config.properties");
	Properties prop = new Properties();
	prop.load(filein);
	prop.getProperty("key");
	return key;
	
}
}
