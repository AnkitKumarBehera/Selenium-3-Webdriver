package webDriverExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Robot {
public static void main(String args[]) throws Exception{
//Test case steps 
	System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

System.out.println("Application Opened"); 
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
//Perform TAB & Enter using KeyBoard actions
Robot r = new Robot(); 
r.keyPress(KeyEvent.VK_TAB); 
r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_ENTER); 
r.keyRelease(KeyEvent.VK_ENTER); Thread.sleep(3000L); 
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
System.out.println("Logout completed"); 
driver.quit();
}
}

