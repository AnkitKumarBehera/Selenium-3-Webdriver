package webDriverExamples;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.interactions.Actions;


public class mainmenu_MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
Thread.sleep(3000l);
driver.findElement(By.name("txtUserName")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
WebElement element=driver.findElement(By.linkText("PIM"));
Actions action=new Actions(driver);
action.moveToElement(element).perform();
Thread.sleep(3000l);
driver.findElement(By.linkText("Add Employee")).click();
Thread.sleep(3000);
System.out.println("Clicked on submenu");
driver.quit();
	}

}
