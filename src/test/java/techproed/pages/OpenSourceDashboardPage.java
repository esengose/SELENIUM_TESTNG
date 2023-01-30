package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourceDashboardPage {

    public OpenSourceDashboardPage() {
        // PageFactory seleniumdan gelen ve bu sayfa elementlerini intantiate etmek icin kullanilir
        // Bu sekilde Sayfa objeleri cagrildiginda null pointer exception alinmaz
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//h6[.='Dashboard']")
    public WebElement dashboardheader;

}
