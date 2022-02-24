package screenshot_Demo;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshots2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		//RemoteWebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
		//above is first approach
		WebDriver driver = new ChromeDriver();
		//above is 2nd approach
		//we will get error because in webdriver interface there is no take screenshot method. we need to type cast take scrrenshot object
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies.
		driver.get("https://www.cleartrip.com");
		
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		//whenever we are using remotewebdriver we need to do nothing. when we use webdriver as reference we need to type cast takescreenshot.
		//File file = driver.getScreenshotAs(OutputType.FILE);//ist approach
		File file = (File) takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\screenshot\\cleartrip.jpeg"));

		
		
	}
}
