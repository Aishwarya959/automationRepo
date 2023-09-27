package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChromeBrowser {
  public static void main(String[] args) throws InterruptedException {
	//to launch chrome browser crete the object
     WebDriver driver =new EdgeDriver();
     
     //maximize the browser
  //  Options manage = driver.manage();
   // Window win=manage.window();
    		//win.maximize();
    		//or
    driver.manage().window().maximize();
	   
     //stop the execution of script for 2 sec
      Thread.sleep(2000);
    
	  //close the browser by calling method of webdriver
     driver.close();
}
}
