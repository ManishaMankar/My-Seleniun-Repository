package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuAutomationWithX_path {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("// button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		List<WebElement>menu=driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']/li//a"));
		System.out.println("Total webElement are avaliable in menu "+menu.size());
		for(WebElement i: menu)
		{
			System.out.println(i.getText());
			if(i.getText().equals("Logout"))
			{
				i.click();
			}
		}
		/*
		//xpath with index
			driver.findElement(By.xpath("(//ul[@class='oxd-dropdown-menu']/li//a)[4]")).click();
			//xpath with position
			driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li//a)[position ()=4]")).click();*/
			
			

		//driver.close();

	}

}
