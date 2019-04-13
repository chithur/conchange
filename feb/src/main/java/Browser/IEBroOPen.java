package Browser;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IEBroOPen {
	
	public String url,a;
	
	public IEBroOPen()
	{
		this.url="http://www.google.com";
		a="hi";
	}
	
	@Test
	public void OpenIE() {
		// TODO Auto-generated method stub
		
		IEBroOPen link=new IEBroOPen();
		WebDriver driver=new FirefoxDriver();
		driver.manage()	.window().maximize();
		driver.get(link.url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
