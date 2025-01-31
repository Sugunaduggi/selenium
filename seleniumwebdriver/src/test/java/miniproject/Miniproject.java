package miniproject;

import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Miniproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		// to open the url 
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
		
		//Validate the text “Online Furniture Shopping Store” in the title.
		
		String title = driver.getTitle();
		if(title.equals("Online Furniture Shopping in India | Furniture, Home Decor & More at Pepperfry Black Friday Sale")) 
		{
			System.out.println("Title is matching");
		}
		else 
		{
			System.out.println("Title is not matching");
		}
		
		//Select “Furniture” and click on “Settees & Benches”.
		driver.findElement(By.name("Furniture")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/pf-header/header/div[2]/pf-header-main/div/div[2]/pf-header-category-showcase/div/div[2]/div/div/div/div/div/div[2]/ul[3]/li[1]/a")).click();
		
		//Display the Count of benches.
		driver.findElement(By.xpath("//*[@id=\"clip-heder-desktop\"]/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/pf-clip-category-list/div/a/div/pf-image/div/img")).click();
		
		WebElement  count_of_bench=driver.findElement(By.xpath("//div[text()='Benches']/following-sibling::div"));
		System.out.println("count of benches is :"+count_of_bench.getText());
		
		//Display the count of settees
		WebElement count_of_settees= driver.findElement(By.xpath("//div[text()='Settees']/following-sibling::div"));
		System.out.println("count of settees is :"+count_of_settees.getText());	
		
		//Display the count of recamiers.
		WebElement count_of_recamiers = driver.findElement(By.xpath("//div[text()='Recamiers']/following-sibling::div"));
		System.out.println("count of recamiers is :"+count_of_recamiers.getText());
		
		
		WebElement element = driver.findElement(By.xpath("/html/body/app-root/main/app-category/pf-clip/div/div[1]/div[3]/pf-clip-filter/div[1]/div/div/div/div[1]/span[2]/pf-button/button/div/span"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		driver.findElement(By.id("/html/body/app-root/main/app-category/pf-clip/div/div[1]/div[3]/pf-clip-filter/div[1]/div/div/div/div[1]/span[2]/pf-button/button/div/span")).click();
		
	    
	}

}
