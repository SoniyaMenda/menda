package menda;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hubble {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	ChromeDriver drive=new ChromeDriver();
	drive.get("https://hubble.miraclesoft.com/lock");
	drive.findElement(By.id("userName")).sendKeys("tsesetti");
	drive.findElement(By.id("password")).sendKeys("Tejasri@1");
	drive.findElement(By.xpath("//*[@class='btn btn-primary m-light-blue-bg m-t-10']")).click();	
	drive.manage().window().maximize();
	drive.findElement(By.xpath("//span[normalize-space()='Employee Search']")).click();
			drive.findElement(By.xpath("//a[@href='/employee/timesheets']")).click();
	}

}
  