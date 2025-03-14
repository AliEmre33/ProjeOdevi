package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

import java.time.Duration;

public class SignUpTest extends BaseTest {
    @Test
    public void testSignUp() {
        HomePage homePage = new HomePage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);


        homePage.clickSignUpLogin();


        signUpPage.enterName("ali");

        signUpPage.enterEmail("bulbul"+"@gmail.com");


        signUpPage.clickSignUp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        signUpPage.fillDetailsAndSubmit("12345");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
}
