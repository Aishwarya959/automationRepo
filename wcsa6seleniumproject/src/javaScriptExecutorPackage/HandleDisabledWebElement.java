package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebElement {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("file:///C:/Users/aishw/OneDrive/Desktop/simpleLogin/disablewebelement.html");
           //identify username
		 WebElement usn = driver.findElement(By.id("id1"));
		 usn.sendKeys("admin");
		 
		 Thread.sleep(3000);
		 //password is a disabled
		 //explicit typecast into javascriptexecutor
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("document.getElementById('id2').value='manager';");
	}

}
