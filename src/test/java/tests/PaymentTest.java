package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class PaymentTest extends BaseTest {
    @Test
    public void testPaymentProcess() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // 1. Giriş yap
        homePage.clickSignUpLogin();
        loginPage.login("bulbul@gmail.com", "12345");

        // 2. Ürün ekle
        productPage.addFirstProductToCart();
        productPage.clickViewCart();
        cartPage.verifyProductAdded();

        // 3. Sepette "Proceed to Checkout"
        cartPage.clickProceedToCheckout();

        // 4. Adres detaylarını doğrula
        checkoutPage.verifyAddressDetails();

        // 5. "Place Order" butonuna tıkla
        checkoutPage.clickPlaceOrder();

        // 6. Ödeme bilgilerini gir (opsiyonel)
        // checkoutPage.enterPaymentDetails(...);
        // checkoutPage.confirmOrder();
    }

}
