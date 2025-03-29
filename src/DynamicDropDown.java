import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//a[@value="MAA"]
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//here in the firstdropdown we selected banglore dropdown.
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();// here when we selected bangalore in the dropdown, we need to select chennai as
		                                                                //destination in the second dropdown.but here chennai is there in first dropdown
		                                                                //as well as in second dropdown. so we have used this xpath (//a[@value='MAA'])[2] 
                                                                        //to select the  value chennai in the second dropdown
		
		//here indexes are not recommended because index may be changed. so we will use the parent-child relationship concept
		//div[@id="ctl00_mainContent_ddl_originStation1_CTNR"]  //a[@value="BLR"]
		//div[@id="ctl00_mainContent_ddl_destinationStation1_CTNR"]  //a[@value="MAA"]
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		}

}
