import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownsAndCheckboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.bg");

	}

}
