import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionsDemos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\AutomationCrew\\chromedriver.exe");
				  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		
		//Moves the mouse the a specific element and types the text with capital letters
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
		.keyDown(Keys.SHIFT).sendKeys("hello")
		//.doubleClick() - it will select the whole text
		.build().perform();
		
		
		//Moves the mouse to a specific element
		a.moveToElement(move)
		//.contextClick() - right clicks on the specific element
		.build().perform();

	}
}
