package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class fileupload {
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("submit")).click();
	System.out.println("login success");
	Thread.sleep(3000);

//enter to frame 
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//input[@value='Add']")).click();
Thread.sleep(3000);

driver.findElement(By.name("txtFirstname")).sendKeys("Ankit");
driver.findElement(By.name("txtLastname")).sendKeys("kumar");
Thread.sleep(3000);
WebElement fileInput =driver.findElement(By.name("photofile")); 
fileInput.sendKeys("D:\\ankit.jpg");
Thread.sleep(5000);
System.out.println("File uploaded successfully");
	
driver.findElement(By.id("btnEdit")).click();
System.out.println("save btn click");
driver.switchTo().defaultContent();
Thread.sleep(3000);

driver.findElement(By.linkText("logout")).click();
System.out.println("logout");
driver.quit();
	}
	}

