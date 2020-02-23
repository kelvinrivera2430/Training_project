package Commons;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class browser {
	public static WebDriver driver;
   
  @BeforeClass
	  public void beforeClass(String website, String br) {
		  if(br.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kelvin PC\\eclipse-workspace\\k\\Drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
			  driver.get(website);
		  } else if(br.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kelvin PC\\eclipse-workspace\\k\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.navigate().to(website);
	  } else{
		  System.out.println("please check name");
	  }
  }

  @AfterClass
  public void afterClass() {
  }

}
