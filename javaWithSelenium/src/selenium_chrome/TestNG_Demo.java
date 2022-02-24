package selenium_chrome;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNG_Demo {

WebDriver driver;
	
	//private WebDriver driver;
	public void openBrowser() {
		
		
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
				driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
				driver.manage().window().maximize();//browser maximises
				driver.manage().deleteAllCookies();//to delete the cookies.
	}
	public void loginTestCase()//when error is encountered create field driver 
	{
		driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("dileep.challa.3410@gmail.com");
		WebElement nxt = driver.findElement(By.id("identifierNext"));
		nxt.click();
	}
	public void closeBrowser() //when error is encountered create field driver 
	{
		driver.close();	
	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		TestNG_Demo demo = new TestNG_Demo();
		demo.openBrowser();
		demo.loginTestCase();
		demo.closeBrowser();
}
}//output: gmail open and closes

//i dont want to go with main method. i want to execute with testNG we go for another method.
//see TestNG_Demo2 program

