import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class NameLocator  {
	
	public void setupDriver()
	{
		DriverSetup driver = new DriverSetup();
		driver.getWebDriver();
		
		}
	
	public void getData()
	{
		System.out.println("Just for test");
	}
	public void getdetails()
	{
		System.out.println("Just for details");
	}
	}
