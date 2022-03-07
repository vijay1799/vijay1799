package webelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Basicutilities;

public class Findwebelement {
public static void main(String[]args) throws InterruptedException {
	String url ="http://localhost/login.do";
	Basicutilities obj1 = new Basicutilities();
	 WebDriver driver = obj1.startup("ch", url);
	 //whem we use findelement and change altribute value they give exception no such element find
	WebElement unfield = driver.findElement(By.cssSelector("input[id='username']"));
	unfield.sendKeys("admin");
	//when we use findElements they give list of webelement
	//List <WebElement> unfield = driver.findElements(By.cssSelector("input[id='username']"));
	//unfield.get(0).sendKeys("admin");
	WebElement password =driver.findElement(By.cssSelector("input[class='textField pwdfield']"));
	password.sendKeys("manager");
	WebElement login=driver.findElement(By.cssSelector("#loginButton"));
	login.click();
	String exptitle ="actiTIME -  Enter Time-Track";
	String acttitle=driver.getTitle();
	if(acttitle.equals(exptitle))
			 {System.out.println("title is match"); }
	else{System.out.println("title not match");}
	Thread.sleep(1000);
	WebElement taskbu= driver.findElement(By.cssSelector("a[class='content tasks']"));
	 taskbu.click();
	 WebElement logout= driver.findElement(By.cssSelector("#logoutLink"));
	 logout.click();
}
}
