package selenium_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicOperationsDemo {
public static void main(String[] args) {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
	//we are setting the path
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https:/www.rameshsoft.com");
	driver.findElement(By.xpath("//a[text()='Contact Now']")).click();
	//driver.findElement(By.partialLinkText("Contact")).click();
	
	WebElement yourName = driver.findElement(By.name("your-name"));
	yourName.clear();
	yourName.sendKeys("RAMESHSOFT");
	
	//WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Offline']"));//this and below line both are correct
	WebElement radioBtn = driver.findElement(By.xpath("//input[@type='radio'][@value='Offline']"));
	if (radioBtn.isDisplayed()&&radioBtn.isEnabled())//&& represents if both are true then only it is true
	{
		radioBtn.click();
	}
	else
	{
		System.out.println("Radio button is not displayed");
	}
	
	if (radioBtn.isSelected())//to check radio button is selected or not
	{
		System.out.println("Radio button is selected");
	}
	else
	{
		System.out.println("Radio button is not selected");
		radioBtn.click();
	}
	
	//WebElement agreeWithUs = driver.findElement(By.xpath("//input[@name='AgreeWithUs']"));//this and below line both are correct. any one we can use
	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][@value='1']"));
	if(checkbox.isDisplayed()&&checkbox.isEnabled())
	{
		checkbox.click();
	}
	else {
		System.out.println("Check box is not displayed");
	}
	if (checkbox.isSelected())
	{
		System.out.println("CheckBox button is selected");
	}
	else
	{
		System.out.println("CheckBox button is not selected");
		checkbox.click();
	}
	
	
	
	
	WebElement ddElement = driver.findElement(By.name("use_label_element"));
	//check the dropdown is starting with which tagname
	String actualTagName = ddElement.getTagName();//getting tagname of this web element.
	if (actualTagName.equalsIgnoreCase("select"))//if this dropdown is starting with select tagname this if condition is going to be executed
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
		
		List<WebElement> ddElements = select.getOptions();//to get total no of elements in dropdown
		System.out.println("no of elements in the dd:   " +ddElements.size());
		
		List<WebElement> ddSelectedElements = select.getAllSelectedOptions();//to get all selected elements
		System.out.println("no of selected elements in dd: " +ddSelectedElements.size());
		//this code is going to work perfectly, whenever the dropdown is starting with select tag name then only this code work perfectly.

	}
			
	else//if this dropdown is not starting with select tagname this if condition is not going to be executed, then this else condition is going to be executed
	{
		//List<WebElement> ddElements = driver.findElements(By.xpath("//select[@name='use_label_element']/option"));
		//if tagname is select than it is if case than if case will execute, this else case doesnt execute. so if case should not be select than this else case executes
		List<WebElement> ddElements = driver.findElements(By.xpath("//*[@name='use_label_element']/option"));//tagname keep on changing so we keep *, tagname change no problem
		System.out.println("no of elements in the dd:   " +ddElements.size());
		WebElement element = driver.findElement(By.xpath("//*[@name='use_label_element']/option[3]"));//this code is going to work irrespective of tagname
		element.click();
	}

	
	
}
}
