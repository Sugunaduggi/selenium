package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Justsyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		

        WebElement  dropdown =driver.findElement(By.xpath(""));
        
        Select s = new Select(dropdown);
        s.selectByVisibleText(" dfgdf");
        
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        
        Alert myalert= driver.switchTo().alert();
        myalert.accept();
        
       

	}

}
