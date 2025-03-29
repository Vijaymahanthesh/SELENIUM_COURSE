import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//header//div/button[1]/following-sibling::button[1]
		
	  System.out.println("Hi this is good"+driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());//this example for traversing from parent to child class
       
	//header/div/button[1]/parent::div/button[2]
	  System.out.println("hi hello"+ driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());//this is example for traversing from child to parent
	}

}
