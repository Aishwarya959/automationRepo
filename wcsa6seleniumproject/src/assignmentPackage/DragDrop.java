package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		//driver.findElement(By.xpath("//a[text()='Demos']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	//.until(ExpectedConditions.visibilityOf(20));
		//driver.switchTo().frame(driver.findElement(By.xpath()))
		WebElement src = driver.findElement(By.id("draggable"));
		      WebElement target = driver.findElement(By.id("droppable"));
		      
		      
		      
		

	}

}
