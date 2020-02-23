package Run;

import org.testng.annotations.Test;

import com.pages.Home;

import coomon1.browser;

import org.testng.annotations.DataProvider;

public class DATAPTraining extends browser{
  @Test(dataProvider = "signin")
  public void f(String n, String s) {
	  Home h=new Home(driver);
	  h.Emalilfield(n);
	  h.Forgotpassid(s);
	  h.Loginbt();
	  driver.navigate().back();
	  h.Empty();
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "Kelvin@gmail.com", "a" },
      new Object[] { "aaron@gmail.com", "b" },
      new Object[] { "rivera@gmail.com", "c" },
    };
  }
}
