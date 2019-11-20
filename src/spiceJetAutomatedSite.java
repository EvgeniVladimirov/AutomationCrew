import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class spiceJetAutomatedSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Its Disabled");
			Assert.assertFalse(false);
		}
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		
		Select ppl = new Select(driver.findElement(By.cssSelector("[name='ctl00$mainContent$ddl_Adult']")));
		ppl.selectByValue("5");
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("select[name='ctl00$mainContent$ddl_Child']")).isEnabled());
		
		
		
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
