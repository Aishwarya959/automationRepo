package qsp;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
       static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the BrowserValue");
	  String browserValue= sc.next();
	  
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {
		  //create the object
		  driver=new ChromeDriver();
		  //maximize browser
		  driver.manage().window().maximize();
		  //stop the execution of script for 2 sec
		  Thread.sleep(5000);
		  //close the browser by calling method of webdriver
		  driver.close();
	  }
	  
	  else if(browserValue.equalsIgnoreCase("Firefox"))
	  {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	  }
	  else if(browserValue.equalsIgnoreCase("Edge"))
	  {
		 driver =new EdgeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
	  }
	  else
	  {
		  System.out.println("browser value is incorrect");
	  }
	  }
}
	  
		

