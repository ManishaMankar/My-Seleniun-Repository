package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTest {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.findElement(By.cssSelector("[id='APjFqb']")).sendKeys("testng");
		ChromeOptions options=new ChromeOptions();
		options.setBrowserVersion("124");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		

	}

}
