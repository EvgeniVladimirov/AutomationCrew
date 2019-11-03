import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDownButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://spicejet.com");
		
		/*     For Static Dropdown - aka Selector
		
		driver.findElement(By.cssSelector("[id='divpaxinfo']")).click();;
		Select s = new Select(driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_Adult']")));
		s.selectByIndex(5);
		s.selectByValue("2");
		s.selectByVisibleText("3");
		*/
		
		// For Checkboxes and Assertation
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected()));
		
		//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getText());
		
		// Count Number of Checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//Assert.assertEquals((driver.findElements(By.cssSelector("input[type='checkbox']")).size()), "6");  WTF??
		
	}
}
