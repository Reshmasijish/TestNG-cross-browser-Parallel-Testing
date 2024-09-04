package TestNG_deompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser_testing {
	WebDriver Driver;
	
  @Test 
  public void testfacebooklogin() {
	 Driver.navigate().to("https://www.facebook.com/");
  }
  
  
  @BeforeMethod
  @Parameters("browser")
  public void setup(String browser) {
if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	Driver = new ChromeDriver();
	
//} else if (browser.equalsIgnoreCase("firefox")) {
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\geckodriver-v0.35.0-win32\\geckodriver.exe");
//	Driver = new FirefoxDriver();
	
} else if (browser.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\edgedriver_win64\\msedgedriver.exe");
	Driver = new EdgeDriver();
	
	Driver.manage().window().maximize();
	
	
}


  }

  @AfterMethod
  public void teardown() {
if (Driver != null) {
	Driver.quit();
}
  }

}
