package techproed.tests.dataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day24_DataProviderTest3 {

    //EXCEL DATALARI -> DATA PROVIDER -> TEST METOTLARI
    //    DATA PRIVIDER METOTU
    @DataProvider
    public Object[][] customerData() {
//        DataProviderTest2 ile bu metot arasindaki tek fark bu metotda datalar Excelden gelir.
//        Bu kullanim daha guzeldir
        String path = "src\\test\\java\\resources\\mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        Object[][] musteriBilgileri= excelUtils.getDataArrayWithoutFirstRow();
        return musteriBilgileri;
    }
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;

    @Test (dataProvider = "customerData")
    public void dataProviderLoginTest(String email, String password) throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();

        blueRentalHomePage.loginLink.click();
        blueRentalLoginPage.emailBox.sendKeys(email);
        blueRentalLoginPage.passwordBox.sendKeys(password);// kEYS.ENTER KOYARSAM loginButtonu engelliyor, exception alıyorum
        blueRentalLoginPage.loginButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Ekran goruntusu");
        ReusableMethods.waitFor(1);
        blueRentalHomePage.userID.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.logOutLink.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.OK.click();
        ReusableMethods.waitFor(1);
    }
}
