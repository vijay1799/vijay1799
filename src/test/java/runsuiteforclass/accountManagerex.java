package runsuiteforclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class accountManagerex {
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

  @BeforeClass
  public void beforeClass() {
	  System.out.println("get data from am");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("flash data in am");
  }

}
