package screenshot_Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot_Demo {
public static void main(String[] args) throws IOException {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
	RemoteWebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
	driver.manage().window().maximize();//browser maximises
	driver.manage().deleteAllCookies();//to delete the cookies.
	//driver.get("https://www.cleartrip.com");
	driver.get("https://www.gmail.com");
	
	File file = (File) driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\screenshot\\gmail.jpeg"));

}
	
}
