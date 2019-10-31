import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://spicejet.com");
		
		driver.findElement(By.cssSelector("[id='divpaxinfo']")).click();;
		
		Select s = new Select(driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_Adult']")));
		
		s.selectByIndex(5);
		s.selectByValue("2");
		s.selectByVisibleText("3");
	
	}
}
