import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //landing to rahulshettyacademy.com/locatorspractice website
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //using id locators
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //using name locator
		driver.findElement(By.className("signInBtn")).click(); //using classname locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //using css selectors with classname
		driver.findElement(By.linkText("Forgot your password?")).click(); //using linktext locators
		Thread.sleep(1000); //wait time
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john"); //using xpath with place attribute
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com"); //using css selectors with place attribute
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //using xpath with indexes
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com"); //using css selectors with indexes
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9872731234"); //using xpath with parent-child and indexes
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //using css selectors with classname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //using css selectors with parent child locators
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //using xpath with parent child locators
		Thread.sleep(1000); //wait time
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); //using css selector with id
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy"); //using css locator and regular expression
		driver.findElement(By.id("chkboxOne")).click();  //using id locator
		driver.findElement(By.xpath("//button[contains (@class,'submit')]")).click();  //using xpath and regular expression
		
	}

}
