package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ActiTimeAssertion {
	static WebDriver driver;
  @Test
  public void loginMethod() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  SoftAssert sa = new SoftAssert();
	  
	  sa.assertEquals(driver.getTitle(),"title");
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	  
	  String titleOfhp="OrangeHRM";
	  Assert.assertEquals(driver.getTitle(),titleOfhp);
	  
	  WebElement logout = driver.findElement(By.partialLinkText("Logout"));
	  
	  Assert.assertEquals(logout.isDisplayed(), true);
	  
	  logout.click();
	  
	  sa.assertAll();
	  
	  
  }
}
