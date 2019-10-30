import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TillLection45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FROM DEMO FILE

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/"); // Url on the browser
		//System.out.println(driver.getTitle()); //Validate if page title is correct
		//System.out.println(driver.getCurrentUrl()); //Validate if landed on correct url
		
		//System.out.println(driver.getPageSource()); //Show page source
		
		driver.get("http://yahoo.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		driver.findElement(By.id("username")).sendKeys("hahar@daaw.br");
		driver.findElement(By.id("password")).sendKeys("haahae");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		driver.close();
		*/
		
		
		
		
		/* From FIREFOX file
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		
		driver.get("http://facebook.com");
		
		*/
		
		
		
		/* From RegularExpressionXPathNCss file

 		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://google.com/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//driver.findElement(By.xpath(("//input[@id='login1']"))).sendKeys("dsad");
		//driver.findElement(By.cssSelector("#password")).sendKeys("pfp");
		//driver.findElement(By.xpath("//*[contains(@name,'procee')]")).click();
		
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND ,Keys.RETURN);
		
		//driver.switchTo().window(tabs.get(0));
		driver.get("https://facebook.com");
		 */
		
		
		/* From XPatha File
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("pfpf");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("arewe");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//driver.findElement(By.cssSelector("[type='email']")).sendKeys("pfpf");
		driver.findElement(By.cssSelector("input#email")).sendKeys("pfpf");
		//driver.findElement(By.cssSelector(cssSelector))
		 */
		
	}

}
