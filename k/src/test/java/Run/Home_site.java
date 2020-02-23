package Run;

import org.testng.annotations.Test;

import com.pages.Home;

//import Commons.browser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Home_site extends coomon1.browser {
	
  @Test
  public void f() {
	  Home h=new Home(driver);
	  //h.Emalilfield();
	 // h.Forgotpassid();
	  h.Loginbt();
	  
	  
  }


}
