package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ProductPage extends BasePage {

    By firstProductAddToCartButton = By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]");
    By viewCartButton = By.xpath("//u[contains(text(),'View Cart')]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCart() {
        driver.findElement(firstProductAddToCartButton).click();
    }

    public void clickViewCart() {
        driver.findElement(viewCartButton).click();
    }
}
