import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//This is the same //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA'] but without an index [2];
		
		// XPath for Chennai   "//a[@value='MAA']"
		// XPath for Bengaluru "//a[@value='BLR']"
		
		////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']
		////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		
	}

}
