package stepdefinition;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
    WebDriver driver;
    @Given("the user is on app")
    public void user_is_on_app(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless");
    driver = new ChromeDriver(options);
        // opens the file like real page
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button(){
        WebElement login=driver.findElement(By.id("submit"));
        login.click();

    }

    @And("enters the credentials")
    public void entersTheCredentials() {
        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        username.sendKeys("student");
        password.sendKeys("Password123");

    }

    @Then("the user should be able to navigate to home page")
    public void theUserShouldBeAbleToNavigateToHomePage() {

        WebElement text = driver.findElement(By.xpath("//h1[normalize-space()='Logged In Successfully']"));
        String actualElementText = text.getText();
        Assert.assertEquals("Logged In Successfully", actualElementText);
        driver.quit();
    }

}
