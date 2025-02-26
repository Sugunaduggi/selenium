package hackthon1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookshelvesSteps {
    private WebDriver driver;
    private Hack1Methods methods;
    private String[] testData;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        methods = new Hack1Methods(driver);
        
    }

    @Given("I have launched the website")
    public void i_have_launched_the_website() {
        methods.initializeDriver();
    }

    @When("I scroll and click on bookshelves")
    public void i_scroll_and_click_on_bookshelves() throws InterruptedException {
        methods.scrollAndClickBookshelves();
    }

    @Then("I set the price range using the slider")
    public void i_set_the_price_range_using_slider() throws InterruptedException {
        methods.handlePriceSlider();
    }

  
    @And("I extract the bookshelf information")
    public void i_extract_bookshelf_information() throws InterruptedException {
        // Use the data from Excel here
        System.out.println("Using test data: " + Arrays.toString(testData));
        methods.extractBookshelves();
    }

    @And("I retrieve submenu items")
    public void i_retrieve_submenu_items() throws InterruptedException {
        methods.retrieveSubMenuItems();
    }

    @And("I capture any error messages")
    public void i_capture_error_messages() throws InterruptedException {
        methods.captureErrorMessage();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}