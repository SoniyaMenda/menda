package menda;

import java.util.concurrent.TimeUnit;

import org.apache.http.impl.execchain.MainClientExec;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoframework {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smenda1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver demo=new ChromeDriver();
		
		demo.get("https://demo.competethemes.com/");
		
		demo.manage().window().maximize();
		
		WebElement demosite=demo.findElement(By.xpath("//div[@class='logo']"));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) demo;  
		
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",demosite);    
		
		demo.findElement(By.xpath("//a[@title='View Desktop Version']")).click();
		Thread.sleep(2000);
		
		demo.findElement(By.xpath("//a[@title='View Tablet Landscape (1024x768)']")).click();
		Thread.sleep(2000);
		
		demo.findElement(By.xpath("//a[@title='View Tablet Portrait (768x1024)']")).click(); 
        Thread.sleep(2000);
		 
        demo.findElement(By.xpath("//a[@title='View Mobile Landscape (480x320)']")).click(); 
        Thread.sleep(2000);
        
        demo.findElement(By.xpath("//a[@title='View Mobile Portrait (320x480)']")).click(); 
        Thread.sleep(2000);
        
		
        demo.findElement(By.xpath("//a[@id='theme_select']")).click();
//              Thread.sleep(2000);
              demo.findElement(By.xpath("//a[normalize-space()='Modern store']")).click();
              
        demo.findElement(By.xpath("//a[normalize-space()='Purchase']")).click();
        Thread.sleep(2000);
//        
WebElement twitter=demo.findElement(By.xpath("//a[@rel='noreferrer']//i[@class='icon-twitter-squared']"));
		
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) demo;  
		
		jsExecutor1.executeScript("arguments[0].style.border='2px solid red'",twitter); 
		
		
 		Thread.sleep(2000);

		
		
WebElement utube=demo.findElement(By.xpath("//a[@rel='noreferrer']//i[@class='icon-youtube-squared']"));
		
		JavascriptExecutor jsExecutor2 = (JavascriptExecutor) demo;  
		
		jsExecutor1.executeScript("arguments[0].style.border='2px solid green'",utube);
		
		Thread.sleep(2000);
		
		demo.navigate().back();
        
		Thread.sleep(2000);
		
		
		
		
//		demo.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
//		demo.findElement(By.id("edd_user_login")).sendKeys("mendasoniya2000@gmail.com");
//		
//		demo.findElement(By.id("edd_user_pass")).sendKeys("soniya003");
        
//		demo.findElement(By.xpath("//a[@title='View Desktop Version']")).click();

		
//      demo.findElement(By.id("menu-item-347")).click();
		
//		demo.findElement(By.id("menu-item-350")).click();
		
//		demo.findElement(By.className("twitter")).click();
//		
//		demo.findElement(By.className("image-link")).click();
      
//demo.findElement(By.className("menu-item menu-item-type-post_type menu-item-object-page menu-item-348")).click();      
      
        demo.close();
	}
}
