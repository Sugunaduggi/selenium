package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		/*
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[7]/h2"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
	
        
        System.out.println("scrolled successfully");
        
        WebElement doubleclcik = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        
        Actions act = new Actions(driver);
        act.doubleClick(doubleclcik).build().perform();
        
        
        System.out.println("double click operation is done");
        
        */
		
		
		//performing the drag and drop operation
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		act.dragAndDrop(source,target).build().perform();
	

	}

}
