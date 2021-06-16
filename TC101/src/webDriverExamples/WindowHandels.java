package webDriverExamples;

import java.util.ArrayList; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandels {
public static void main(String args[]) throws Exception{ 
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///D:/selenium%20software/multiplewindows.html");

	driver.findElement(By.id("btn1")).click();
Thread.sleep(3000);
System.out.println("window 1 open");

driver.findElement(By.id("btn2")).click(); 
Thread.sleep(3000);
System.out.println("window 2 open");

driver.findElement(By.id("btn3")).click(); 
Thread.sleep(3000);
System.out.println("window 3 open");

ArrayList<String> wind=new ArrayList<String>(driver.getWindowHandles()); 

driver.switchTo().window(wind.get(0));
 Thread.sleep(3000); driver.quit();	}
}	
