package practicetesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Navigationalcommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//navigational commands 
		
		//driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		

	}

}
