package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  //launch the webapplication
	  driver.get("http://omayo.blogspot.com/");
	  //launch the child browser
	  driver.findElement(By.xpath( "//a[text()='Open a popup window']")).click();
	  //use the close method
	  //driver.close();
	  //use the quit method to close all browser
	  Thread.sleep(3000);
	  driver.quit();

	}

}
