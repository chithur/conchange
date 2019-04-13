package Browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;

public class ChromeBroOPen {
	
	@Test
	public void OpenChrome() throws InterruptedException
	{
		
		for(int i=0;i<=100;i++)
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hotstar.com/sports/cricket/india-in-new-zealand-2019/new-zealand-vs-india-m189625/live-streaming/2001709520");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(10000);
			Robot robot;
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_SPACE); 
				robot.keyRelease(KeyEvent.VK_SPACE);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,150)");
		
			
			//new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]"))).perform();
			//driver.findElement(By.xpath("//*[@id=\"my_video_1\"]/div[4]/button[2]/span[1]")).click();
			Thread.sleep(600000);
			//driver.manage().deleteAllCookies();
			//Thread.sleep(3000);
			driver.quit();
		
		}
		
		
	
/*		driver.findElement(By.id("identifierId")).sendKeys("raj.chithur@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a")).click();
		driver.findElement(By.linkText("Sign out")).click();	*/
		
	}
	
	//@Test
	public void takescreenshot() throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://instamynd.com/");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("\\C:\\Users\\CHITHURAJ\\Desktop\\screenShot.jpg"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
