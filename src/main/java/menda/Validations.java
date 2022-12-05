package menda;

import org.apache.http.impl.execchain.MainClientExec;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C://Users//smenda1//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver dead=new ChromeDriver();
	dead.get("https://it.wikipedia.org/wiki/Pagina_principale");
	
//	//verify the text
	
	
//	if(dead.getPageSource().contains("Il teatro scandinavo della seconda guerra mondiale"))
//	{
//		System.out.println("text present");
//	}
////	else
////	{
////		System.out.println("text is not present");
////	}
	
//	boolean data=dead.getPageSource().contains("Il teatro scandinavo della seconda guerra mondiale");
//	System.out.print(data);
	
	
	// verify the title
	String title=dead.getTitle();
	System.out.println(title);
	String Titlepage="Wikipedia, l'enciclopedia libera";
	 if(title.equals(Titlepage) )
	 {
		 System.out.println("true");
	 }
	 else
	 {
		 System.out.println("false");
	 }
	dead.close();
}
}
