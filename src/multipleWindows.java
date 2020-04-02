import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\AutomationCrew\\chromedriver.exe");
				  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath("//li[1]//a[1]")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
	}

}
