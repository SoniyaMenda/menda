package menda;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;



public class Browsers<ExtentReports, ExtentTest> {

	public WebDriver driver;
	String url="";
	public ExtentReports reports;
	public ExtentTest test;

	@Parameters({"browsers"})
	@BeforeTest
	public void openBrowser(String browser) {
//		reports= new ExtentReports("");
		
		if(browser.equalsIgnoreCase("iexplore"))
		{
			System.out.println("internet explorer");
			File f=new File("C:/Users/smenda1/Downloads/IEDriverServer_x64_4.6.0/iexplore.exe");
			System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		driver=new InternetExplorerDriver();
		System.out.println("browser open");
		}
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("firefox");
			driver=new FirefoxDriver();
			System.out.println("browser is open");
		}
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("google chrome");
			File f=new File("");
			System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("Google chrome");
		}
		driver.manage().window().maximize();
		System.out.println(browser+"browser is maximized ");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	}

