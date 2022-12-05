package menda;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class zimbra {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smenda1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mapi.miraclesoft.com");
		driver.findElement(By.id("username")).sendKeys("tsesetti@miraclesoft.com");
		driver.findElement(By.id("password")).sendKeys("Tejasri@4");
		driver.findElement(By.xpath("//*[@id='loginButton']")).click();
//		driver.close();
	}
	

}
