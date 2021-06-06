package MavenforJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	WebDriver driver;
	@Test
	public void GoogleSearch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
}
