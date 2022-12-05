package menda;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BddFramework {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\smenda1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
	WebDriver  Bdd=new ChromeDriver();
	Bdd.get("https://www.telerik.com/services");
	
	Bdd.manage().window().maximize();
	
	WebElement demosite=Bdd.findElement(By.xpath("//a[@aria-label='Go to Homepage']//*[name()='svg']"));
	
	JavascriptExecutor jsExecutor = (JavascriptExecutor) Bdd;  
	
	jsExecutor.executeScript("arguments[0].style.border='10px solid red'",demosite);  	
	
	Bdd.findElement(By.xpath("//button[normalize-space()='All Products']")).click();
	
//	Bdd.close();
}
}
