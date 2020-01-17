package basics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class automation2 {
	
	WebDriver Driver;

	//public static void main(String[] args) {
		
		@BeforeTest
		public void LaunchBrowser() throws InterruptedException{
		
		
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
	    Driver=new FirefoxDriver();
		Driver.get("https://www.easemytrip.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//li[contains(text(),'Round Trip')]")).click();
		Thread.sleep(2000);
		System.out.println("Rajiv");
		}
		
		
		
	    @Test
	    public void enterdetails() throws InterruptedException {
	    	
	    Driver.findElement(By.xpath("//input[@id='FromSector_show']")).clear();
	    Thread.sleep(2000);
	    
	    Driver.findElement(By.xpath("//input[@id='FromSector_show']")).sendKeys("Bangalore");
	    Thread.sleep(2000);
	    
	    Driver.findElement(By.xpath("//input[@id='Editbox13_show']")).clear();
	    Thread.sleep(2000);
	    
	    Driver.findElement(By.xpath("//input[@id='Editbox13_show']")).sendKeys("Delhi");
	    	 
	    	
	    }
		

	}


