import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumPractise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\AutomationCrew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicitly Wait - Timeout for the whole test
		//after each iteration (each row)
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Add wanted products
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		addItems(driver, itemsNeeded);
		cartCheckout(driver, itemsNeeded);
		
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		//Collects information for all products in site
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//Used integer for when to break the loop
		int index = 0;
		
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			//Format the name to get actual vegetable name with Trim and Split
			String formattedName = name[0].trim();
			// - Convert array into array list for easy search
			List namesList = Arrays.asList(itemsNeeded);
			// - Check whether name you extracted is present in the array or not
			if (namesList.contains(formattedName)) {
				index++;
				//Click on Add to Cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				/*
				OR YOU CAN USE ->
				
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(5000);
				
				This text is dynamic - on a click it changes its string text
				That's why selenium needs to wait before
				clicking on the next ADD TO CART button
				*/
				if (index == itemsNeeded.length) {
					break;
				}
			}
		}
	}
	
	
	public static void cartCheckout(WebDriver driver, String[] itemsNeeded) {
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver, 2);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("img.product-image")));
		//Note that if the method wants an argument - (By Locator)
		//Then DO NOT TYPE - driver.findElement(s)
		
		//Again add those products in an ArrayList
		List<WebElement> products = driver.findElements(By.cssSelector("img.product-image"));
		
		//Compare the products in the CART from the Wanted List
		//If equal - apply a coupon
		if (products.size() == itemsNeeded.length) {
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		}
		else {
			System.out.println("Missing product");
		}
	}
}
