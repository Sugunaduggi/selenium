package practicetesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.time.Duration;


public class Getwindowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowid=driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<>(windowid);
		
		String parentid=windowlist.get(0);
		String childid= windowlist.get(1);
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		
		

	}

}
