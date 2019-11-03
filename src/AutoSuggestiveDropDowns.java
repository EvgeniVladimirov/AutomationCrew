import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//AutomationCrew//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='fsw_inputField font30 lineHeight36 latoBlack']")).click();
		WebElement sourceFrom = driver.findElement(By.cssSelector("input[placeholder='From']"));
		Thread.sleep(3000);
		sourceFrom.sendKeys("mum");
		Thread.sleep(2000);
		sourceFrom.sendKeys(Keys.ARROW_DOWN);
		sourceFrom.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement sourceTo = driver.findElement(By.cssSelector("input[placeholder='To']"));
		sourceTo.sendKeys("bul");
		Thread.sleep(2000);
		for(int i = 0; i < 3; i++) {
			sourceTo.sendKeys(Keys.ARROW_DOWN);
		}
		sourceTo.sendKeys(Keys.ENTER);
		
	}

}
