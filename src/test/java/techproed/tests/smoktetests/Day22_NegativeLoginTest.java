package techproed.tests.smoktetests;

import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.util.function.Function;

public class Day22_NegativeLoginTest {
    //    Name:
    //    US100208_Negative_Login
    //    Description:
    //    User should not be able login with incorrect credentials
    //    Acceptance Criteria:
    //    As customer, I should not be able to log in the application
    //    Customer email: fake@bluerentalcars.com
    //    Customer password: fakepass
    //    Error: User with email fake@bluerentalcars.com not found
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test
    public void US100208_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalLoginPage= new BlueRentalLoginPage();
        blueRentalHomePage =new BlueRentalHomePage();

        blueRentalHomePage.loginLink.click();
        Thread.sleep(5000);
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("fake_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_password"));
        blueRentalLoginPage.loginButton.click();

        Thread.sleep(3000);

        Assert.assertEquals(blueRentalLoginPage.error_message_1.getText(),"User with email fake@bluerentalcars.com not found");

    }



}
