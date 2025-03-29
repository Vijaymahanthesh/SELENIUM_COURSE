import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/chromedriver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //here first identifying select dropdown through id
		
		Select dropdown= new Select(staticdropdown);//here creating object for select dropdown
		dropdown.selectByIndex(2);
		System.out.println("throuh index"+dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println("visible"+dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println("by optional value"+dropdown.getFirstSelectedOption().getText());
	}

}
