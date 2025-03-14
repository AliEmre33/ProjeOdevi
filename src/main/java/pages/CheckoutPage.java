package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class CheckoutPage extends BasePage {

    By addressDetails = By.id("address_delivery");
    By placeOrderButton = By.xpath("//a[@href='/payment']");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void verifyAddressDetails() {
        Assert.assertTrue(driver.findElement(addressDetails).isDisplayed(),
                "Adres bilgileri görüntülenemedi!");
    }

    public void clickPlaceOrder() {
        driver.findElement(placeOrderButton).click();
    }

}
