package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(2000);
		 //this chatbox is ``design under the frame
		   //handle frame first by identifiying it
		  
		  // driver.switchTo().frame(3);...we handled frame by using index
		   
		 //  driver.switchTo().frame("fc_widget");.args.clone().we handled by using nameor id attribute
		
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement) ;
		 WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		//switch control to main page
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("aishu");
	
		driver.findElement(By.id("chat-fc-email")).sendKeys("aishu@123");
	
		driver.findElement(By.id("chat-fc-phone")).sendKeys("12345");
          
          
	}

}
