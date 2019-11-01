import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.bg");
		
		driver.findElement(By.xpath("//a[@class='gb_B gb_pc']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='EHzcec eejsDc']//a[@class='tX9u1b']")).click();
		
		
	}

}
