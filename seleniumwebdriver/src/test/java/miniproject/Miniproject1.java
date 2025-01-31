package miniproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.List;


public class Miniproject1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open the URL
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get("https://www.pepperfry.com/");
            driver.manage().window().maximize();
            
            // Validate the text “Online Furniture Shopping Store” in the title.
            String title = driver.getTitle();
            if (title.contains("Online Furniture Shopping in India | Furniture, Home Decor & More at Pepperfry Black Friday Sale")) {
                System.out.println("Title is matching");
            } else {
                System.out.println("Title is not matching");
            }
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            // Select “Furniture” and click on “Settees & Benches”.
            WebElement furnitureMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Furniture")));
            furnitureMenu.click();
            
            WebElement setteesBenches = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settees & Benches")));
            setteesBenches.click();
            
            // Display the Count of benches.
            driver.findElement(By.xpath("//*[@id=\"clip-heder-desktop\"]/div/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/pf-clip-category-list/div/a/div/pf-image/div/img")).click();
            WebElement count_of_bench = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Benches']/following-sibling::div")));
            System.out.println("Count of benches is: " + count_of_bench.getText());
            
            // Display the count of settees
            WebElement count_of_settees = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Settees']/following-sibling::div")));
            System.out.println("Count of settees is: " + count_of_settees.getText());
            
            // Display the count of recamiers.
            WebElement count_of_recamiers = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Recamiers']/following-sibling::div")));
            System.out.println("Count of recamiers is: " + count_of_recamiers.getText());
            
            // Scroll to and click on "Filter By" -> Materials -> Metal Benches
            WebElement element = driver.findElement(By.xpath("/html/body/app-root/main/app-category/pf-clip/div/div[1]/div[3]/pf-clip-filter/div[1]/div/div/div/div[1]/span[2]/pf-button/button/div/span"));
    		JavascriptExecutor js= (JavascriptExecutor) driver;
    		js.executeScript("arguments[0].scrollIntoView(true);",element);
            
            //driver.findElement(By.xpath("/html/body/app-root/main/app-category/pf-clip/div/div[1]/div[3]/pf-clip-filter/div[1]/div/div/div/div[1]/span[2]/pf-button/button/div/span")).click();
    		WebElement Material= driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
    		js.executeScript("arguments[0].click();",Material);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/main[1]/app-category[1]/pf-clip[1]/div[1]/div[1]/div[3]/pf-clip-filter[1]/div[2]/pf-clip-filter-drawer[1]/div[1]/pf-drawer[1]/div[1]/div[2]/div[1]/div[1]/div[2]/pf-accordion[1]/div[1]/div[1]/accordion[1]/div[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/pf-checkbox[1]/div[1]/div[1]/label[1]"))).click();
    		
    		
    		//WebElement metalBenches = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Metal']")));
           // js.executeScript("arguments[0].click();", metalBenches);
    		
    		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/main[1]/app-category[1]/pf-clip[1]/div[1]/div[1]/div[3]/pf-clip-filter[1]/div[2]/pf-clip-filter-drawer[1]/div[1]/pf-drawer[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/pf-button[1]/button[1]/div[1]/span[1]")).click();
    		
    		
    		
            
            WebElement options=driver.findElement(By.xpath("/html/body/app-root/main/app-category/pf-clip/div/div[2]/pf-clip-product-listing/div[1]/pf-scroller/div/div/div[1]/div/pf-clip-product-card/div/div[1]/div[1]"));
    		js.executeScript("arguments[0].scrollIntoView(true);",options);
    		
    		
    		
    		WebElement count =driver.findElement(By.xpath("//span[normalize-space()='3 options in']"));
    		System.out.println(count.getText()+" metal benches");
    		
    		TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("./screenshots/suguna.png");
            destination.getParentFile().mkdirs(); // Create directories if they don't exist
            FileHandler.copy(source, destination);
            System.out.println("Screenshot taken");
    		
    		
            
  
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
