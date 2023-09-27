package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the web application
		driver.get("https://www.instagram.com/");
		System.out.println("1");

		 driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		System.out.println("2");
//        loginButton.get
//	System.out.println(loc.getX());
//	System.out.println(loc.getY());

	}

}
