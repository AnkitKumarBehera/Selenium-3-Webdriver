package webDriverExamples;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Explicitwait {
	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	//Explicit Wait for element to be clickable 
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
	driver.findElement(By.xpath("Submit")).click();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 
	System.out.println("Login completed");
	driver.findElement(By.linkText("logout")); 
	driver.quit();
	}
	}


