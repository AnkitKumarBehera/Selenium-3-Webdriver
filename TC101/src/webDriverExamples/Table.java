package webDriverExamples;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.By;
public class Table {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   
		driver.navigate().to("file:///D:/selenium%20software/WebTable.html");
		int row = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
  System.out.println(row);
  System.out.println(col);
  System.out.println(row_col);
String data1 = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
System.out.println(data1);
for(int i=1; i<=row;i++) {
	{
String data = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();
System.out.println(data);
}
	}
driver.close();
	}
}
