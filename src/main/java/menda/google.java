package menda;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
	driver.findElement(By.xpath("//span[normalize-space()='Create account']")).click();
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mendasoniya2000@gmail.com");
	driver.findElement(By.xpath("  (//div[@class='VfPpkd-RLmnJb'])[2]")).click();
	 
driver.close();
	}

}
