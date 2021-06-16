package webDriverExamples;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
 
public class JavaScriptExe {
public static void main(String args[]) throws Exception{ 
	System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//test casse steps
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//using javascriptExecuter to click on login btn
WebElement element = driver.findElement(By.name("Submit")); 

JavascriptExecutor executor = (JavascriptExecutor)driver; executor.executeScript("arguments[0].click();", element);
Thread.sleep(3000);
System.out.println("Login completed");
// using javascriptExecuter to click on logout
WebElement logout = driver.findElement(By.linkText("Logout")); 
JavascriptExecutor executor1 = (JavascriptExecutor)driver; executor1.executeScript("arguments[0].click();", logout);
System.out.println("Logout completed");
driver.close();
}
}
