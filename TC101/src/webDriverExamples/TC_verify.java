package webDriverExamples;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
public class TC_verify {
       public static String un="Admin";
       public static String pw="admin123";
 public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
if(driver.getTitle().equals("hrms")) {
	System.out.println("title match");
	}
 else     {
		System.out.println("title not match and expected title is" +driver.getTitle());
	}
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
    driver.findElement(By.name("Submit")).click();
Thread.sleep(3000);
System.out.println("login completed");
driver.findElement(By.linkText("logout")).click();
System.out.println("log out completed");
driver.quit();
	}
}
