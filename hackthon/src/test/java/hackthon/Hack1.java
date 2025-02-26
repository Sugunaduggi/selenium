package hackthon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hack1 {
    WebDriver driver;
    Hack1Methods methods;
    

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        methods = new Hack1Methods(driver);
        methods.getData();
        methods.initializeDriver();
        
    }

    @Test(priority = 1)
    public void testScrollAndClickBookshelves() throws InterruptedException {
        methods.scrollAndClickBookshelves();
    }

    @Test(priority = 2)
    public void testHandlePriceSlider() throws InterruptedException {
        methods.handlePriceSlider();
    }

    @Test(priority = 3)
    public void testExtractBookshelves() throws InterruptedException {
        methods.extractBookshelves();
    }

    @Test(priority = 4)
    public void testRetrieveSubMenuItems() throws InterruptedException {
        methods.retrieveSubMenuItems();
    }

    @Test(priority = 5)
    public void testCaptureErrorMessage() throws InterruptedException {
        methods.captureErrorMessage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[] { Hack1.class });
        testng.run();
    }
}