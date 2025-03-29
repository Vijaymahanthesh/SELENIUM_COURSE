import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollTable2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		int sum=0;
		 List<WebElement>values =driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		 for(int i=0;i<values.size();i++)
		 {
			 sum=sum+Integer.parseInt(values.get(i).getText());
		 }
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	     System.out.println("total"+total);
	     Assert.assertEquals(sum,total);
		
	     int table2_sum=0;
	  List<WebElement>values1=driver.findElements(By.cssSelector(".table-display tbody tr td:nth-child(3)"));
	  for(int j=0;j<values1.size();j++)
	  {
		 WebElement currentElement = values1.get(j);
		 String elementText = currentElement.getText();
		 System.out.println("great " + elementText);
		   table2_sum=table2_sum+Integer.parseInt(elementText);
	  }
	  System.out.println("table2_sum"+table2_sum);
	}

}
