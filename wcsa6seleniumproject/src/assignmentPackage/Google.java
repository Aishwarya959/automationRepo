package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=chandler+bing&sxsrf=AB5stBg1AEmB6Mmz9_7jkMWXPzcxQYGqlg%3A1689744363947&ei=63O3ZKuQOcbfseMP25qEsAg&oq=friends+joey&gs_lp=Egxnd3Mtd2l6LXNlcnAiDGZyaWVuZHMgam9leSoCCAgyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGEcY1gQYsAMyChAAGIoFGLADGEMyChAAGIoFGLADGENI6yxQAFgAcAF4AZABAJgBAKABAKoBALgBAcgBAOIDBBgAIEGIBgGQBgo&sclient=gws-wiz-serp");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("lNPNe")).sendKeys("Chandler Bing");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("lNPNe")).sendKeys("Joey Tribbiani");
	}

}
