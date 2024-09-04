package TestNG_deompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Testing {
	WebDriver driver;
	
  @Test(priority = 2)
  public void facebook() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();  
		  
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
  }
    
  @Test(priority = 1)
  public void flipkart() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();  
		  
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
  }
  
  
  @Test(priority = 3)
  public void amazon() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();  
		  
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
  }
}
