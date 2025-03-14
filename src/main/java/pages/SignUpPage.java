package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SignUpPage extends BasePage  {


    By nameField = By.xpath("//input[@data-qa='signup-name']");
    By emailField = By.xpath("//input[@data-qa='signup-email']");
    By signUpButton = By.xpath("//button[@data-qa='signup-button']");


    By passwordField = By.id("password");
    By signupSubmitButton = By.xpath("//button[@data-qa='create-account']");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSignUp() {
        driver.findElement(signUpButton).click();
    }

    public void fillDetailsAndSubmit(String password) {
        driver.findElement(passwordField).sendKeys(password);

        driver.findElement(signupSubmitButton).click();
    }
}
