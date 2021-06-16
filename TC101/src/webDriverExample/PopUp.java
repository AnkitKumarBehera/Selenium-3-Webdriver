package webDriverExample;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
import  org.openqa.selenium.Alert;

public class PopUp {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://adactinhotelapp.com/");
	      System.out.println(driver.getTitle());
	      driver.findElement(By.name("txtUserName")).sendKeys("sureshbabu1");
	      driver.findElement(By.name("submit")).click();
	      Thread.sleep(2000l);
	      Alert a=driver.switchTo().alert();
	      System.out.println(a.getText());
	      a.accept();
	      driver.findElement(By.name("txtPassword")).sendKeys("suresh");
	      driver.findElement(By.name("submit")).click();
	      Thread.sleep(2000);
	      System.out.println("login completed");
	      driver.findElement(By.linkText("logout")).click();
	      driver.quit();

	      
	      

	}

}
