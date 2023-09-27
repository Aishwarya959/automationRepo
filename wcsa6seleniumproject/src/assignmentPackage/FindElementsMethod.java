package assignmentPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

		public static void main(String[] args) throws InterruptedException  {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co");
			driver.switchTo().activeElement().sendKeys("poha");
			//identify all the suggestions of poha element
			List<WebElement> pohaSuggestions = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
					Thread.sleep(2000);
					
			//to print thr list use looping statement
			for(int i=0;i<pohaSuggestions.size();i++)
			{
				System.out.println(pohaSuggestions.get(i).getText());
				Thread.sleep(2000);
				
			}
			for(WebElement poha:pohaSuggestions) {
				System.out.println(poha.getText());
				Thread.sleep(2000);
			}

	}
}

