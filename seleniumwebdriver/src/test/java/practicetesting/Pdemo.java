package practicetesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Pdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		String baseurl = "https://ui.vision/demo/webtest/frames/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("hello frame1");
		
		
		driver.switchTo().defaultContent();
		
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("/html/body/form/div/input")).sendKeys("hello frame3");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class=\"AB7Lab Id5V1\"]")).click();
		
		// WebElement inner = driver.findElement((By.xpath(""))
		
		driver.switchTo().defaultContent();
		
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//div[@name='mytext5']")).sendKeys("hello");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
