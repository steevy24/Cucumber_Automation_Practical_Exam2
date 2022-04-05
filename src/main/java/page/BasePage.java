package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;

	public static void init() {

		System.setProperty("webdriver.chrome.driver", "newchromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		
}
