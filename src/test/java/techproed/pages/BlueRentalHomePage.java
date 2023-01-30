package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalHomePage {

    public BlueRentalHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement loginLink;

    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement OK;

    @FindBy (xpath = "//select[@name='car']")
    public WebElement dropMenu;

    @FindBy(name="pickUpLocation")
    public WebElement pickUp;

    @FindBy(name="dropOfLocation")
    public WebElement dropOff;

    @FindBy(name="pickUpDate")
    public WebElement pickDate;

    @FindBy(name="pickUpTime")
    public WebElement pickTime;

    @FindBy(name="dropOffDate")
    public WebElement dropDate;

    @FindBy(name="dropOffTime")
    public WebElement dropTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sbmtButtn;

    @FindBy(xpath = "//div[text()='Please first login']")
    public WebElement error_message_4;


}