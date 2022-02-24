package selenium_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BasicOperationsDemo_Old {
	public static void main(String[] args) {
		//String userCurDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		//we are setting the path			
		//to open chrome browser
			//ChromeDriver driver = new ChromeDriver();//this ChromeDriver is coming from package org.openqa.selenium.chrome.ChromeDriver
			//this is with chrome driver reference. this is first approach.
			//RemoteWebDriver driver = new ChromeDriver();//this is by using RemoteWebDriver. this is second approach
			WebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
			//we can access only WebDriver specific methods
			//SearchContext driver = new ChromeDriver();//this is not advised to use
			//driver.
			driver.manage().window().maximize();//browser maximises
			driver.manage().deleteAllCookies();//to delete the cookies.
			driver.get("https://www.rameshsoft.com");
			driver.findElement(By.xpath("//a[text()='Contact Now']")).click();
			WebElement yourName = driver.findElement(By.name("your-name"));
			yourName.clear();
			yourName.sendKeys("RAMESHSOFT");
			
			WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Offline']"));
			if (radioBtn.isDisplayed()&&radioBtn.isEnabled())//&& represents if both are true then only it is true
			{
				radioBtn.click();
			}
			else
			{
				System.out.println("Radio button is not displayed");
			}
			
			if (radioBtn.isSelected())
			{
				System.out.println("Radio button is selected");
			}
			else
			{
				System.out.println("Radio button is not selected");
				radioBtn.click();
			}
			
			WebElement agreeWithUs = driver.findElement(By.xpath("//input[@name='AgreeWithUs']"));
			if(agreeWithUs.isDisplayed()&&agreeWithUs.isEnabled())
			{
				agreeWithUs.click();
			}
			else {
				System.out.println("Check box is not displayed");
			}
			if (agreeWithUs.isSelected())
			{
				System.out.println("CheckBox button is selected");
			}
			else
			{
				System.out.println("CheckBox button is not selected");
				agreeWithUs.click();
			}
			
			
			WebElement ddElement = driver.findElement(By.name("use_label_element"));
			String actualTagName = ddElement.getTagName();//getting tagname of this web element
			if (actualTagName.equalsIgnoreCase("select"))
			{
				Select select = new Select(ddElement);
				select.selectByIndex(1);
				select.selectByValue("Selenium through Java");
				select.selectByVisibleText("Core Java");
				
				WebElement firstSelectedElement = select.getFirstSelectedOption();
				String txt = firstSelectedElement.getText();
				System.out.println(txt);
				
				boolean status = select.isMultiple();
				if (status) {
					System.out.println("it is  multi select dd");
				}
				else {
					System.out.println("it is not multi select dd");
				}
				select.deselectAll();
				select.deselectByIndex(1);
				
				List<WebElement> ddElements = select.getOptions();//to get total no of elements
				System.out.println("no of elements in the dd:   " +ddElements.size());
				
				List<WebElement> ddSelectedElements = select.getAllSelectedOptions();
				System.out.println("no of selected elements in dd: " +ddSelectedElements.size());
				//this code is going to work perfectly, whenever the dropdown is starting with select tag name then only this code work perfectly.

			}
					
			else
			{
				List<WebElement> ddElements = driver.findElements(By.xpath("//*[@name='use_label_element']/option"));//tagname keep on changing so we keep *, tagname change no problem
				System.out.println("no of elements in the dd:   " +ddElements.size());
				WebElement element = driver.findElement(By.xpath("//*[@name='use_label_element']/option[3]"));//this code is going to work irrespective of tagname
				element.click();
			}
	}

}
