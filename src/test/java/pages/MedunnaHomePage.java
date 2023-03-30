package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {
    public MedunnaHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dropdown nav-item']")
    public WebElement loginOlma;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement SingIn;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SingInButton;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement ItemsTitles;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement Room;

    @FindBy(xpath = "//span[text()='Create a new Room']")
    public WebElement CreateANewRoom;

   @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumber;

    @FindBy(xpath = "//select[@id='room-roomType']")
    public WebElement dropdownRoomType;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement save;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement status;

    @FindBy(xpath = "//input[@id='room-price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='room-description']")
    public WebElement description;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement dogrulamaMesaji;

//yasin hoca
    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(id = "entity-menu")
    public WebElement itemsdAndTitles;

    @FindBy(linkText = "Room")
    public WebElement roomOption;
}


