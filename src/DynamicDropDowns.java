import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); //For the Second date that 
																									 //It is currently disabled
																									 // - Should show False
		driver.findElement((By.id("ctl00_mainContent_rbtnl_Trip_1"))).click();			// Click on Round Trip (Radio Button)
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {		// Correct way to validate if
			System.out.println("Its Enabled");											// The Radio button is Enabled or Disabled
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Its False");
			Assert.assertFalse(false);
		}

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
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	}

}
