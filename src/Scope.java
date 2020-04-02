import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 
		 driver.get("http://qaclickacademy.com/practice.php");
		 
		 //#1
		 //Give the count of links on the page
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 
		 //#2
		 //Limit the driver scope to a part of the site by creating a "mini"driver
		 WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		 System.out.println(footerdriver.findElements(By.tagName("a")).size());
		 
		 //#3
		 //Links count only on first coloumn
		 WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		 System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		 
		 //#4
		 //Click on each link in the coloumn and check if the pages are opening in new tab
		 for(int i = 1; i < coloumndriver.findElements(By.tagName("a")).size() ; i++) {
			 
			 //Tells Selenium to click on the element with CTRL+ENTER;
			 String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			 coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			 Thread.sleep(5000L);
		 }		 
		 //#5
		 //Navigate to each tab and print its title page
		 Set<String> IDs = driver.getWindowHandles();
		 Iterator<String> It = IDs.iterator();
		 while(It.hasNext()) {
			 driver.switchTo().window(It.next());
			 System.out.println(driver.getTitle());
		 }	
	}

}
