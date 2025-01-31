package practicetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://instagram.com");
		
		WebElement user = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("password"));
		
		user.sendKeys("with_a_heart_of_stone");
		pass.sendKeys("suguna12345");
		
		
		
	

	}

}
