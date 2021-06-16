package webDriverExamples;
import  org.openqa.selenium.WebDriver;

import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import static  org.testng.Assert.assertTrue;
public class AddEmp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@type='Submit']")).click();
Thread.sleep(5000l);
assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("welcome ankit"));
driver.switchTo().frame("rightMenu");
driver.findElement(By.xpath("//*[@id'standardView']/div[3]/div[1]/input[1]")).click();
Thread.sleep(2000l);
String empid=driver.findElement(By.xpath("//form[@id='frmEmp']/div/div/div[2]/input")).getAttribute("value");
System.out.println(empid);
driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("suresh");
Thread.sleep(2000l);
driver.findElement(By.xpath("//*[@id='txtEmpFirstName']")).sendKeys("selenium");
driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
Thread.sleep(2000l);
System.out.println("New Employee Added");
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//*[@id='option-menu']/lil[3]/a")).click();
driver.quit();
	}
}