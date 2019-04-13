package Browser;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {
	
	@Test
	public void FlashSale()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8220059691");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("mechtest");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("5a");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[2]/button/svg")).click();
		
		
	}
	
	
	
	

}
