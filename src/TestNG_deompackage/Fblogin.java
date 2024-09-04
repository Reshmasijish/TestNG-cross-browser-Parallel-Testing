package TestNG_deompackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogin {
	
	WebDriver driver;
  @Test (invocationCount = 3)
  public void f() throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIJISH\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();  
	  
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().minimize();
	Thread.sleep(3000);
	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("reshma");
	
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("123456");
	
	WebElement loginclick = driver.findElement(By.name("login"));
	loginclick.click();
  }

}
