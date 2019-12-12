import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulShettyAcademySite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String name = "Evgeni";
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		
		
		/*
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		//System.out.println(text);
		if (text.contains("Evgeni")) {
			System.out.println("Correct");
		} 
		else
		{
			System.out.println("Nope");
		}
		driver.switchTo().alert().accept();
		*/
		
		
		driver.findElement(By.id("confirmbtn")).click();
		String text = driver.switchTo().alert().getText();
		if(text.contains("Evgeni")) {
			driver.switchTo().alert().accept();
		}
		else {
			driver.switchTo().alert().dismiss();
		}
		
		
		
	}
}
