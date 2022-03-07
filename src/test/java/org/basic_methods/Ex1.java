package org.basic_methods;

//import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
	public static void main(String[]args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		String browsername = "chrome";
      Ex2 obj = new Ex2();
      //obj.startup(browsername);
         obj.startupusingwebDM(browsername);
	}
	


	}


