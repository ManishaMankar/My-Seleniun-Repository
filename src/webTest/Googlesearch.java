package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) {
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String Title=driver.getTitle();
		String Curl=driver.getCurrentUrl();
	
		System.out.println("The title is "+Title+"\n"+"The current url is"+Curl);
		if(Title.equals("Google"))
		{
			System.out.println("Test case is match.....test pass");
		}else
			
		{
			System.out.println("Test case is not match....test fail");
		}
		

	}

}
