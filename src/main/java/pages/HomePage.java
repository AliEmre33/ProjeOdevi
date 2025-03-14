package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public  class HomePage extends BasePage {
    By signUpLoginButton = By.xpath("//a[@href='/login']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpLogin() {
        driver.findElement(signUpLoginButton).click();
    }
}
