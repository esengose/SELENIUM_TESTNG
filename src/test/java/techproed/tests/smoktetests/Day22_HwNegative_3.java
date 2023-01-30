package techproed.tests.smoktetests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_HwNegative_3 {
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US100402_Negative_Login() throws InterruptedException {
        //Name:
        //US100402_Negative_Login
        //Description:
        //Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı
        //Acceptance Criteria:
        //Kullanici dogru email ve yanlis sifre girildiginde, hata mesajini alınmalı
        //Hata Mesaji:
        //Bad credentials
        //Test Data:
        //Customer email: jack@gmail.com
        //Customer password: fakepass

        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();

        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_password"));
        blueRentalLoginPage.loginButton.click();

        Thread.sleep(2000);

        Assert.assertEquals(blueRentalLoginPage.error_message_2.getText(),"Bad credentials");



    }
}