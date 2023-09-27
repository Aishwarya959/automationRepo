package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 {

	public static void main(String[] args) throws InterruptedException {
		
		//handle notification popup
		ChromeOptions Co = new ChromeOptions();
		Co.addArguments("--disable-notifications");
		//--------------------------------------------------------------------------------
		WebDriver driver=new ChromeDriver(Co);
		driver.manage().window().maximize();
       driver.get("https://www.airvistara.com/in/en/plantravel/flight-booking");		
        //identify depart loc
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City' and (@name='flightSearchFrom')]")).sendKeys(" (PNQ) ");
		 Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("Kochi (");
     	 Thread.sleep(2000);
     	driver.findElement(By.xpath("(//p[@class='label']) [1]")).click();
     	Thread.sleep(2000);
        driver.findElement(By.xpath("//p[text()='1 Adult']")).click();
     Thread.sleep(2000);
     driver.findElement(By.name("depart")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@class='ui-state-default' and (text()='28')]")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@monthname='Aug']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@class='ui-state-default' and (text()='4')]")).click();
     Thread.sleep(2000);
     driver.findElement(By.id("pb-searchflight")).click();
     Thread.sleep(2000);
    driver.quit();
    
     
	}

}
