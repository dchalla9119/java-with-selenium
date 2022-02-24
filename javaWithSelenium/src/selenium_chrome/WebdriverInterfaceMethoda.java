package selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverInterfaceMethoda {

	public static void main(String[] args) {
		
		String userCurDir = System.getProperty("user.dir");
		System.out.println(userCurDir);//we will get project path dynamically
		//output:  C:\Users\Dileep.Challa\OneDrive\Desktop\eclipse december 2021\javaWithSelenium

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		//we are setting the path
		
		//to open chrome browser
		WebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
		
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies. if we open url sometimes it is not opening, we have to delete cookie
		driver.get("https://www.gmail.com");//to enter the url
		
		String title=driver.getTitle();//to get the title of the page in the form of string
		System.out.println(title);
		//output:  Gmail
		
		//driver.findElement(By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe QBQrY zKHdkd sdJrJc Tyc19J']/div/div/div/input"));
	}
}
