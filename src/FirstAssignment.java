import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		checkbox.click();
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
