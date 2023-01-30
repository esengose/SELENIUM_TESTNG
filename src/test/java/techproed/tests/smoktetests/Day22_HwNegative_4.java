package techproed.tests.smoktetests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_HwNegative_4 {

    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US101122_Negative_Login() {
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();

   /* Name:
    US101122_Negative_Login
    Description:
    Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
    Acceptance Criteria:
    Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
    Error Message: email must be a valid email
    Dogru email uzantisi girildiğinde hata mesajı alınmamalı


*/
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys("jack");
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));
        blueRentalLoginPage.loginButton.click();

        Assert.assertEquals(blueRentalLoginPage.error_message_3.getText(),"email must be a valid email");
    }
}