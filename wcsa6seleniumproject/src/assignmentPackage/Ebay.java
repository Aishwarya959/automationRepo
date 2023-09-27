package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Apple watches");
		driver.findElement(By.id("gh-btn")).click();

	}

}
