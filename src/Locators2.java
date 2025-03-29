import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password=getpassword(driver);
		String name="rahul";
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //landing to rahulshettyacademy.com/locatorspractice website
		driver.findElement(By.id("inputUsername")).sendKeys(name); //using id locators
		driver.findElement(By.name("inputPassword")).sendKeys(password); //using name locator
		driver.findElement(By.className("signInBtn")).click(); //using classname locator
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        
    
	}

	 public static String getpassword(WebDriver driver) throws InterruptedException {
		 
		 driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
		 driver.findElement(By.linkText("Forgot your password?")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		 String passowrdText=driver.findElement(By.cssSelector("form p")).getText();
		 //Please use temporary password 'rahulshettyacademy' to Login.
		 String passwordArray[]=passowrdText.split("'");
		 String password=passwordArray[1].split("'")[0];
		 System.out.println("Hi"+password);
		return password;
	 }
	 
}
