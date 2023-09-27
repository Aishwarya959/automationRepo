package qsp;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//set size of browser
		Dimension targetsize=new Dimension(450,250);
		driver.manage().window().setSize(targetsize);
		//set the position
		Thread.sleep(2000);
		Point targetposition =new Point(650,350);
		driver.manage().window().setPosition(targetposition);
		//fullscreen
		driver.manage().window().fullscreen();
		
		
		
		

	}

}
