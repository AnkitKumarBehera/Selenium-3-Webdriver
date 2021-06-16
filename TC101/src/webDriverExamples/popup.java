package webDriverExamples;

import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
public class popup {
public static void main(String args[])throws Exception{ 
	System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
 
System.out.println (driver.getTitle ());
driver.findElement (By.name ("txtUsername")).sendKeys ("Admin"); 
driver.findElement (By.name ("Submit")).click ();
Thread.sleep (2000L);
Alert alert= driver.switchTo ().alert ();
//To Retrieve data from Alert System.out.println (alert.getText ());
//To click on OK button on Alert alert.accept ();
driver.findElement (By.name ("txtPassword")).sendKeys ("admin123"); 
driver.findElement (By.name ("Submit")).click ();
Thread.sleep (2000);
System.out.println ("Login completed"); 
driver.findElement (By.linkText ("Logout")).click (); 
driver.quit ();
}
}
