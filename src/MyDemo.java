import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyDemo {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 
		 /*
		 driver.get("https://google.com");
		 driver.findElement(By.xpath("//a[@class='gb_D gb_oc']")).click();
	
		 driver.switchTo().frame(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/iframe[1]")));
		 // OR if there aren't any more iframes -> driver.switchTo().frame(0);
		 // This - System.out.println(driver.findElements(By.tagName("iframe")).size());
		 // Will help you determined how many iframe are currently visible
		 
		 driver.findElement(By.className("MrEfLc")).click();
		 
		 //To return to normal window (site body)
		 driver.switchTo().defaultContent();
		 */
		 	 
		 
		 /* Assignment #3
		 driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		 driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		 WebDriverWait exWait = new WebDriverWait(driver, 5);
		 exWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		 
		 System.out.println(driver.findElement(By.id("results")).getText());
		  */

		 
		 /* Assignment #4
		 driver.get("https://the-internet.herokuapp.com");
		 driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		 Set<String> ids = driver.getWindowHandles();
		 Iterator<String> it = ids.iterator();
		 String parentid = it.next();
		 String childId = it.next();
		 
		 driver.switchTo().window(childId);
		 System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		 
		 driver.switchTo().window(parentid);
		 System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		 */
		 
		 
		 /* Assignment #5
		 driver.get("https://the-internet.herokuapp.com/nested_frames");
		 driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		 //driver.switchTo().frame(driver.findElement(By.name("frameset-middle")));
		 driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		 System.out.println(driver.findElement(By.id("content")).getText());
		 */
		 
		 
		 /* #Assignment #6
		 //pick a random integer from 1 to 3
		 Random rn = new Random();
		 int selectedCheckbox = rn.nextInt(3)+1;
		 
		 //go to site
		 driver.get("http://qaclickacademy.com/practice.php");
		 
		 //select the checkbox with the random integer
		 driver.findElement(By.id("checkBoxOption"+selectedCheckbox)).click();
		 String selectionOption = driver.findElement(By.xpath("//div[4]/fieldset/label["+selectedCheckbox+"]")).getText();
		 System.out.println(selectionOption);
		 
		 //Select the correct dropdown option
		 Select dropDownExample = new Select(driver.findElement(By.id("dropdown-class-example")));
		 dropDownExample.selectByVisibleText(selectionOption);
		 
		 //Add checkbox-name in EditBox
		 driver.findElement(By.name("enter-name")).sendKeys(selectionOption);
		 driver.findElement(By.id("alertbtn")).click();
		 
		 //Get text from alert
		 String alertName = driver.switchTo().alert().getText();
		 if(alertName.contains(selectionOption)) {
			 System.out.println("Pass");
		 }
		 */
	}
}
