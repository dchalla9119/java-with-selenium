package locatorMechanisms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Locator_Mechanisms {
public static void main(String[] args) throws InterruptedException {
	
	String userCurDir = System.getProperty("user.dir");
	System.out.println(userCurDir);//we will get project path dynamically
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
	//we are setting the path
	
	RemoteWebDriver driver = new ChromeDriver();//this is by using RemoteWebDriver. this is second approach. this method id is advisable
	
	driver.manage().window().maximize();//browser maximises
	driver.manage().deleteAllCookies();//to delete the cookies. if we open url sometimes it is not opening, we have to delete cookie
	driver.get("https://www.gmail.com");//to enter the url
	
	String title = driver.getTitle();//to get the title of the page in the form of string
	System.out.println("Title is:  "+title);
	
	String currentWindowName = driver.getWindowHandle();//to return current window name in the form of string
	System.out.println("window name is:  "+currentWindowName);
	
	String currentUrl = driver.getCurrentUrl();//to return url of the current page
	System.out.println("current url is:  "+currentUrl);
	
//	String pagesource=driver.getPageSource();//to get the source code of the page
//	System.out.println("the source page code is:"+pagesource);
	
	//1. identify the element
	//WebElement username = driver.findElement(By.id("identifierId"));
	//WebElement username=driver.findElementById("identifierId");
	
	//locator mechanisms
	
	//by using id
	//WebElement userId = driver.findElement(By.id("identifierId"));
	
	//by using name
	//WebElement userName=driver.findElementByName("identifier");
	
	//by using className
//	WebElement userClassName=driver.findElementByClassName("VfPpkd-vQzf8d");
//	userClassName.click();
//	//driver.findElement(By.className("whsOnd zHQkBf")).click();
	
	//by using tagname
	driver.findElement(By.tagName("input")).click();


	
	Thread.sleep(4000);//to stop execution after certainperiod of time
	driver.close();//current window will be closed
}
}
