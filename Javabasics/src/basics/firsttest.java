package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class firsttest {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver.exe file for selenium\\chromedriver_win32\\chromedriver.exe");	
		
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.tsrtconline.in/oprs-web/");
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	
	Driver.findElement(By.xpath("//*[@href='/oprs-web/guest/home/miniBus.do?h=1']")).click();
	Thread.sleep(2000);
	Driver.findElement(By.id("fromPlaceName")).sendKeys("HYDERABAD");
	Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Driver.findElement(By.xpath("//*[@name='toPlaceName']")).sendKeys("WARANGAL - HANMAKONDA");
	//Driver.findElement(By.xpath("")).sendKeys("");
	
	
	
	//Driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]")).sendKeys("rajiv");
	
	}

}
