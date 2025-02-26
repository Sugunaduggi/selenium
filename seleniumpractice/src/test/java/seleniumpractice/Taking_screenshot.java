package seleniumpractice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking full page screenshot
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//taking screenshot of full page
		
		/*
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
	
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File targetlocation = new File("C:\\Users\\2372547\\eclipse-workspace\\seleniumpractice\\screenshots\\fullpage.png");
		
		sc.renameTo(targetlocation);
		System.out.println("full page screenshot taken successfully");
		
		*/
		
		WebElement ele =driver.findElement(By.xpath("//div[@class='item-grid']"));
		
	//	TakesScreenshot ts = (TakesScreenshot)driver;
		File sc = ele.getScreenshotAs(OutputType.FILE);
		File targetlocation = new File("C:\\Users\\2372547\\eclipse-workspace\\seleniumpractice\\screenshots\\specificlocation1.png");
		sc.renameTo(targetlocation);
		
		System.out.println("screenshot taken successfully");

		

		
	
		
		
		
		

	}

}
