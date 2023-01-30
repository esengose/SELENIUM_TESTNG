package techproed.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TechproHomePage;
import techproed.pages.TechproLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {
    @Test
    public void techproLoginTest() {
        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("techProUrl"));

        //Page object Model kullanarak sayfaya giriş yapildigini test edin
        TechproLoginPage techproLoginPage = new TechproLoginPage();
        techproLoginPage.username.sendKeys(ConfigReader.getProperty("username_"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("password_"));
        techproLoginPage.loginBtn_.click();

        TechproHomePage techproHomePage = new TechproHomePage();
        Assert.assertTrue(techproHomePage.headertext.isDisplayed());

        techproHomePage.logoutbtn.click();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty("techProUrl"));

        Driver.closeDriver();


    }
}