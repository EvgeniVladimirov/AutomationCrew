import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DelaSportAssignment {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C://Selenium//AutomationCrew//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://babibet.com.delasport.com/");
		
		Login(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//One way to see if we have successfully logged -
		WebElement depositBtn = driver.findElement(By.xpath("//a[contains(@class,'header-deposit-button btn btn-sm header-menu-button')]"));
		Assert.assertTrue(depositBtn.isDisplayed());
		//Another way -
		WebElement userName = driver.findElement(By.xpath("//span[contains(text(),'tuEvgeny')]"));
		Assert.assertEquals(userName.getText(), "tuEvgeny");
		//If the name is not correct or the deposit button is not displayed - the test will fail
	}
	

	public static void Login(WebDriver driver) {
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-link header-login-button header-menu-button']")).click();
		
		WebElement login = driver.findElement(By.id("login_form[username]"));
		login.click();
		login.sendKeys("tuEvgeny");
		
		WebElement password = driver.findElement(By.id("login-modal-password-input"));
		password.click();
		password.sendKeys("Assessment@1");		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block modal-submit-button']")).click();
	}
}
