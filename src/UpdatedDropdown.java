import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println("after selecting"+driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//clicks 4 times
			i++;
		}
		
		//using for loop
		//	for(int i=1;i<5;i++)
			//{
				driver.findElement(By.id("hrefIncAdt")).click();//clicks 4 times
			//}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("after selecting"+driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
