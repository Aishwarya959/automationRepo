package mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Reliance {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Yes, Notify me']")).click();
		driver.findElement(By.xpath("//div[text()='Home Appliances']")).click();
		//driver.findElement(By.xpath("//button[text()='Yes, Notify me']")).click();
		//Thread.sleep(20);
		driver.findElement(By.xpath("//a[text()='Single Door']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("./Screenshots/reliance.png");
		Files.copy(src, file);
		

	}
 
}
