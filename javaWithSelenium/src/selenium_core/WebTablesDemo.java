package selenium_core;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies.
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div/div[3]/div[4]/div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--today']")).click();
		String currentDate = "19";
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div/div[3]/div[4]/div[@aria-disabled='false']"));
		
		
		for(WebElement element : elements)
		{
			String txt = element.getText();
			if (currentDate.equalsIgnoreCase(txt))
			{
				element.click();
				break;
			}
		}
	}

}
