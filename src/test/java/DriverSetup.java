import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	public WebDriver driver;
	
	public WebDriver getWebDriver() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver =new ChromeDriver();
	
		
		return driver;
		
		
	}
}
