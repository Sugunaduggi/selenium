package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
     //   driver.findElement(By.xpath("/ht)).sendKeys("abd@gmail.com");
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
        
       // driver.close();
        
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
        
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='oxd-select-text-input']"));
        
        System.out.println(options.size());
        
        for(int i=0;i<options.size();i++) {
        	System.out.println(options.get(i).getText());
        }

	}

}
