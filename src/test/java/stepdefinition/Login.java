package stepdefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    @Given("the user is on app")
    public void user_is_on_app(){
    WebDriver driver = new ChromeDriver();
        // opens the file like real page
        driver.get("https://www.google.com");
    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button(){
        System.out.println("step-2");
    }

}
