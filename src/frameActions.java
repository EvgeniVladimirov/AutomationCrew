import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 
		 Actions act = new Actions(driver);
		 act.dragAndDrop(driver.findElement(By.id("draggable")), 
				 driver.findElement(By.id("droppable")))
		 		 .build().perform();
		 
		 //To return to normal window (site body)
		 driver.switchTo().defaultContent();
		 
	}
}
