import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntroduction {

	public static void main(String[] args) {

		// if you are running on chromedriver:
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// if you are running on firefox driver then download gecko driver:
		// System.setProperty("webdriver.gecko.driver", "path to geckodriver.exe file");
		WebDriver driver1 = new FirefoxDriver();

		// if you are running on microsoft edge driver:
		// System.setProperty("webdriver.edge.driver", "path to edgedriver.exe");
		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		System.out.println("title" + driver.getTitle());
		System.out.println("current url" + driver.getCurrentUrl());
		// driver.close();
		driver.quit();
	}

}
