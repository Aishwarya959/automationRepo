package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPage {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.netflix.com/in/Login");
	   
	   //identify email or phone text box
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("id_userLoginId")).sendKeys("aishwarya@123");
	   
	   //identify password text box
	   driver.findElement(By.id("id_password")).sendKeys("12345");
	   
	   //identify signin button
	   Thread.sleep(2000);
	   driver.findElement(By.className("btn login-button btn-submit btn-small"));
	   

	}

}
