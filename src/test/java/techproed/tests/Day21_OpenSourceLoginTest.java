package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLoginTest {

    @Test
    public void openSourceLogintest() throws InterruptedException {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

        //Page objesi olustur
        OpenSourcePage openSourcePage = new OpenSourcePage();

        //Bu objeyi kullanarak o classtaki objelere ulaş
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.loginBtn.click();

        //Login Testini basarili oldugunu test et
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Thread.sleep(5000);
        Assert.assertTrue(openSourceDashboardPage.dashboardheader.isDisplayed());

        Driver.closeDriver();
    }
}