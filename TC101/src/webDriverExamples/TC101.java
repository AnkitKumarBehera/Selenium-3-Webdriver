package webDriverExamples;
import  org.openqa.selenium.WebDriver;

import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;

public class TC101 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	      driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	      driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	      driver.findElement(By.name("Submit")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.linkText("Logout"));
	      driver.close();
	}

}
