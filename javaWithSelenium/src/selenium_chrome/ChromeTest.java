package selenium_chrome;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeTest {
public static void main(String[] args) {
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse 2021-06 modified\\javaWithSelenium\\drivers\\msedgedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
	EdgeDriver driver = new EdgeDriver();
	//ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//browser maximises
	driver.manage().deleteAllCookies();//to delete the cookies.
	driver.get("https://www.gmail.com");
}
}
