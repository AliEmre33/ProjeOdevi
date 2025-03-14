package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

import java.time.Duration;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddToCart() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);


        homePage.clickSignUpLogin();
        loginPage.login("bulbul@gmail.com", "12345");  // Gerçek hesabınız varsa kullanın
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        productPage.addFirstProductToCart();


        productPage.clickViewCart();


        cartPage.verifyProductAdded();
    }
}
