package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/reserve.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> eles = driver.findElements(By.xpath("//table[@class='table']/child::tbody"));
		for(WebElement e:eles)
		{
			System.out.println(e.getText());
		}
		

	}

}
