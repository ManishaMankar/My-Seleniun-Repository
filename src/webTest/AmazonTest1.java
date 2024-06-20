package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTest1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		String title=driver.getTitle();
		String Url=driver.getCurrentUrl();
		System.out.println("Title is : "+title+"\n"+"Current url is :"+Url);
		if (title.equals(title))
		{
			System.out.println("Title is match...test pass");
		}else
		{
			System.out.println("Title is not match...test fail");
		}
		if(Url.equals(Url))
		{
			System.out.println("Current url is match...test pass");
		}else
		{
			System.out.println("Current url is not match...test fail");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Element=driver.findElement(By.id("twotabsearchtextbox"));
		Element.sendKeys("bags");
		driver.findElement(By.id("nav-cart-text-container")).click();
		
	
		

	}

}
