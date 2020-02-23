package coomon1;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class browser {
	public static WebDriver driver;
   
  @BeforeClass
  @Parameters ({"url","browser"})
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
 
  public void screenshots(String source) throws IOException{
	
	  
	 // System.out.println("Current Time Stamp: "+ts);
	  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(shots, new File(source+timestamp()+"scr.png"));
  }
  public String timestamp() {
	  return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());
  }
  

}
