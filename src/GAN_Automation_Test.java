import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GAN_Automation_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Go to site
		driver.manage().window().maximize();
		driver.get("https://moneygaming.qa.gameaccount.com/");
		
		//Go to Registration
		driver.findElement(By.cssSelector(".newUser")).click();
			
		//Select a title
		Select title = new Select(driver.findElement(By.cssSelector(".title")));
		title.selectByValue("Mr");
		
		//Type First Name and Surname
		driver.findElement(By.cssSelector("#forename")).sendKeys("Test");
		driver.findElement(By.cssSelector("[name='map(lastName)']")).sendKeys("Test");
		
		//Press the 18+checkbox button
		driver.findElement(By.cssSelector(".checkbox.terms")).click();
		
		//Click JOIN NOW button
		driver.findElement(By.cssSelector("[value='Join Now!']")).click();
		
		//Validate missing required filed
		if(driver.findElement(By.cssSelector("[for='dob']")).isDisplayed()) {
			System.out.println("This field is required message text is visible");
		}
		
		driver.quit();
	}
}
