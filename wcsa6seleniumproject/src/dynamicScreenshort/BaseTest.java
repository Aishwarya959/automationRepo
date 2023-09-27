package dynamicScreenshort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import com.google.common.io.Files;

public class BaseTest {
  static WebDriver driver;
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
  }
  //generic reusable method for take the screenshort of failed method
  public void Failedmethod(String FailedMethodname) 
  {
	 TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshorts/"+FailedMethodname+".png");
	
	try 
	{
		Files.copy(src, dest);
	}
	catch (IOException e)
	{
		
	}
	
}


@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
