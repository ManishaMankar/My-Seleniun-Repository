package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Title is : "+title);
		String Url=driver.getCurrentUrl();
		System.out.println("Current url is : "+Url);
		String source=driver.getPageSource();
		System.out.println(source);
		driver.close();
		driver.quit();
		

	}

}
