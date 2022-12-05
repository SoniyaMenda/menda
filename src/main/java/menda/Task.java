package menda;

import java.util.concurrent.TimeUnit;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\smenda1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
ChromeDriver drive=new ChromeDriver();	
	
drive.get("https://demo.actitime.com/login.do");

drive.findElement(By.id("username")).sendKeys("admin");

drive.findElement(By.name("pwd")).sendKeys("manager");

drive.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();



drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


WebElement actiTIME=drive.findElement(By.xpath("//*[@id='logo_aT']"));

if(actiTIME.isDisplayed())
{

JavascriptExecutor jsExecutor = (JavascriptExecutor) drive;  
jsExecutor.executeScript("arguments[0].style.border='2px solid red'",actiTIME);    

	System.out.println("actiTIME image is displayed");
}
else {
	System.out.println("actiTIME image is not displayed");
}
Thread.sleep(1000);

 
drive.findElement(By.xpath("//*[@class=\"content tasks\"]/div")).click();

drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

drive.findElement(By.xpath("//*[@class=\"content reports\"]/div")).click();

Thread.sleep(1000);

drive.findElement(By.xpath("//*[@class=\"content users\"]/div")).click();

Thread.sleep(1000);

drive.findElement(By.xpath("//div[@id='container_tt']")).click();

 
Thread.sleep(1000);

drive.findElement(By.xpath("//span[normalize-space()='New']")).click();

Thread.sleep(1000);

WebElement create=drive.findElement(By.xpath(" //div[normalize-space()='Create New Tasks']"));

JavascriptExecutor jsExecutor = (JavascriptExecutor) drive;  

jsExecutor.executeScript("arguments[0].style.border='2px solid red'",create);    
 
Thread.sleep(1000);

drive.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")).click();

 Thread.sleep(1000);
 
 drive.findElement(By.xpath("//div[@class='itemRow cpItemRow selected'][normalize-space()='Big Bang Company']")).click();
 Thread.sleep(1000);
 drive.findElement(By.xpath("(//div[@class='dropdownButton'])[6]")).click();
 Thread.sleep(1000);
 drive.findElement(By.xpath("//div[@class='itemRow cpItemRow selected'][normalize-space()='Flight operations']")).click();
 Thread.sleep(1000);
 
 drive.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("sony2");
 Thread.sleep(1000);
 
 drive.findElement(By.xpath("(//input[@placeholder='not needed'])[1]")).sendKeys("15");
 Thread.sleep(1000);
    
 drive.findElement(By.xpath("//*[@id=\"ext-gen34\"]")).click();
 Thread.sleep(1000);
 
 drive.findElement(By.xpath("(//a[@href='#'])[19]")).click();
 Thread.sleep(1000);
 drive.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
 Thread.sleep(5000);
 drive.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_tips']")).click();
 drive.close();
 }
}

