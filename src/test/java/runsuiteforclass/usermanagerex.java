package runsuiteforclass;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;


public class usermanagerex {
  @Test(priority=0)
  public void createcustomer() {
	  System.out.println("createcustomer");
  }
  @Test(priority=1)
  public  void Deletecustomer() {
	  System.out.println("Deletecustomer");
  }
  @Test(priority=2)
  public void updatecustomer() {
	  System.out.println("updatecustomer");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("get date for um");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("flash the data");
  }

}
