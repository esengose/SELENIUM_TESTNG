package techproed.tests.smoktetests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day22_HwNegative_5 {

     BlueRentalHomePage blueRentalHomePage;
     BlueRentalLoginPage blueRentalLoginPage;


    @Test
    public void US101201_Negative_Login() throws InterruptedException {

        //US101201_Negative_Login
        //Description:
        //Geçerli giriş yapmadan rezervasyon yapamamalı
        //Acceptance Criteria:
        //Kullanici arac bilgilerini girip CONTINUE RESERVATION butonuna tikladiginda
        //Ve giris yapilmadiginda
        //Hata mesaji almali : Please first login
        //Giris yapildiginda hata mesaji alınmamalı

        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        Select select = new Select(blueRentalHomePage.dropMenu);
        select.selectByVisibleText("Maserati");

        blueRentalHomePage.pickUp.sendKeys("İzmir");
        blueRentalHomePage.dropOff.sendKeys("İstanbul");
        blueRentalHomePage.pickDate.sendKeys("10.02.2023");
        blueRentalHomePage.pickTime.sendKeys("09:00");
        blueRentalHomePage.dropDate.sendKeys("15.02.2023");
        blueRentalHomePage.dropTime.sendKeys("16:00");
        blueRentalHomePage.sbmtButtn.click();
        Thread.sleep(3000);
        ReusableMethods.verifyElementDisplayed(blueRentalHomePage.error_message_4);



    }









}