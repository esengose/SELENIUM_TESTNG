package techproed.tests.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day24_DataProviderTest1 {

    //DATA PROVIDER
    @DataProvider (name="smoke_test_data")
    public Object[][] urunler() {
        Object urunListesi[][] = {
                {"tesla"},
                {"bmw"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };
        return urunListesi;
    }

    //TEST METHODU

    @Test(dataProvider = "urunler")
    public void aramaTesti(Object data) {
        System.out.println(data);
    }
    //    GOOELE ARAMASI
    @Test(dataProvider = "smoke_test_data")
    public void googleAramasi(String araclar){
//        google a git
        Driver.getDriver().get("https://www.google.com");
//        COOKIES CIKANLAR ICIN
        try {
            Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        }catch (Exception e){

        }
//        araclari arama kutusuna gir ve Enter a bas
        Driver.getDriver().findElement(By.name("q")).sendKeys(araclar+ Keys.ENTER);
//        sayfa title inin aradigim kelimeyi icerdigini assert et
        Assert.assertTrue(Driver.getDriver().getTitle().contains(araclar));
//        driver i kapat
        Driver.closeDriver();
    }

}