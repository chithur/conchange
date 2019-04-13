package seleniumExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllExceptions {
	
	@Test	
	public void exception_ElementNotvisibleException() {
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://platform.drawbrid.ge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='_loginButton']")).click();
		driver.quit();
	}
	
	@Test
	public void exception_ElementnotSelectable()
	
	{
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://platform.drawbrid.ge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='_loginButton']")).click();
		driver.quit();	
	}
	
	//When the element is not in curremt iframe\Window\alert displayed some the areas throw StaleElementReferenceException
	public void exception_StaleelementReferenceException()
	{
	
	}
	
	//When no allert is displayed
	public void exception_NoSuchAlertException() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://platform.drawbrid.ge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='_loginButton']")).click();
		driver.quit();	
	
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
	}
	
	//This Problem aries while interacting with unavialble iframe
	public void exception_NoSuchFrameException()
	{
		
	}

	//This Promblem aries while interating with unavailable
	public void NosuchWindowException()
	{
		
	}
	
	//When certain alement is not interacbltin specied time
	public void exception_TimeoutException()
	{
		
	}

	
}
