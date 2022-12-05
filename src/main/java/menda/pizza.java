package menda;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pizza {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pizzahut.co.in/");
		driver.findElement(By.xpath("//a[@class='sc-fzoyAV eEbHCL']")).click();
		driver.findElement(By.id("phone-field")).sendKeys("9989945908");
//		driver.findElement(By.xpath("//*[@class='sc-AxheI uooXQ']")).click();
	}

}
