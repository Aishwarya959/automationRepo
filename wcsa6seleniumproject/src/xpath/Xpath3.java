package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?cmpid=sem_3856208402_Mobiles_dsa_goog&gclid=Cj0KCQjw5f2lBhCkARIsAHeTvlj3EsrGAGM0zaAF-lvh5lyVPaIwTl5LfOL-uWNgxAcNNySdHpro--gaAsM0EALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(), 'Inf')])[1]")).click();
		

	}

}
