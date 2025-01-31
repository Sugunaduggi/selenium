package practicetesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import java.time.Duration;

public class Handlecheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select the checkbox 
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//counting how many check box are there 
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		System.out.println("total number of checkboxes :"+checkboxes.size()); 
		
		//selecting all the check boxes
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		

	}

}
