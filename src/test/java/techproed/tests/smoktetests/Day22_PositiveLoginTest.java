package techproed.tests.smoktetests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.io.ObjectInputFilter;

public class Day22_PositiveLoginTest {
    //    Name: US100201_Admin_Login
    //    Description:
    //    Admin bilgileriyle giriş
    //    Acceptance Criteria:
    //    Admin olarak, uygulamaya giriş yapabilmeliyim
    //    https://www.bluerentalcars.com/
    //    Admin email: jack@gmail.com
    //    Admin password: 12345
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US100201_Admin_Login(){
        Reporter.log("sayfaya git");

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage= new BlueRentalLoginPage();

        Reporter.log("Login butonuna tıkla");
        blueRentalHomePage.loginLink.click();

        Reporter.log("Giriş bilgilerini gir");
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));
        blueRentalLoginPage.loginButton.click();

        Reporter.log("Giriş yapıldığını doğrula");
        Assert.assertTrue(blueRentalHomePage.userID.isDisplayed());
        Reporter.log("Driver ı kapat");
        Driver.closeDriver();
    }
}
