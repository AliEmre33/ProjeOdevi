package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class CartPage extends BasePage {

    By cartProducts = By.xpath("//table[@id='cart_info_table']//tbody//tr");
    By proceedToCheckout = By.xpath("//a[@class='btn btn-default check_out']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void verifyProductAdded() {
        int productCount = driver.findElements(cartProducts).size();
        Assert.assertTrue(productCount > 0, "Sepette ürün bulunamadı!");
    }

    public void clickProceedToCheckout() {
        driver.findElement(proceedToCheckout).click();
    }
}
