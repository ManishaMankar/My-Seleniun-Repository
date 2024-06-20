package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleValidation {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		String Title=driver.getTitle();
		System.out.println("Title is "+Title);
		//validation
		String act="Facebook";
		String exp= driver.getTitle();
		if(Title.contains(exp))
		{
			System.out.println("Test case is match.....test pass");
		}else
		{
			System.out.println("Test case not match....test fail");
		}

	}

}
