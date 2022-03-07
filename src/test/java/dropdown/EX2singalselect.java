package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.Basicutilities;

public class EX2singalselect {
public static void main(String[]args) {
	String url ="https://demoqa.com/select-menu";
	Basicutilities obj1 = new Basicutilities();
	 WebDriver driver = obj1.startup("ch", url);
	 WebElement colour = driver.findElement(By.id("oldSelectMenu"));
	 Select sel = new Select(colour );
	 WebElement selectedoption = sel.getFirstSelectedOption();
	String Selectoptiontext= selectedoption.getText();
	System.out.println(Selectoptiontext);
	List<WebElement>alloption =sel.getOptions();
      for (int i =0;i<alloption.size();i++) {
    	  
    	  System.out.println(alloption.get(i).getText());
      }
	
	
	
	
	
	
}
}
