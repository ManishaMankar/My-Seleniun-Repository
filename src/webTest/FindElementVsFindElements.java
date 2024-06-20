package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*
		 * 
		 NoSuchElementException
		WebElement username=driver.findElement(By.name("username###"));
		username.sendKeys("Manisha");*/
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.tagName("a#"));
		System.out.println("Total links are: "+list.size());
		System.out.println(list);
		
		for(WebElement i : list)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
		}
		
	
		

	}

}
