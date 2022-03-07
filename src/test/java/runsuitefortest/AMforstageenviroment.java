package runsuitefortest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AMforstageenviroment {
	 @Test(priority=0)
	  public void createaccount() {
		  System.out.println("createaccount");
	  }
	  @Test(priority=1)
	  public void Deleteaccount() {
		  System.out.println("Deleteaccount");
	  }
	@Test(priority=2)
	public void updateaccount() {
		  System.out.println("updateaccount");
	}

	  @BeforeTest
	  public void beforeClass() {
		  System.out.println("get data from am for Stage enviroment");
	  }

	  @AfterTest
	  public void afterClass() {
		  System.out.println("flash data in am for Stage enviroment");
	  }


}
