package page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    // driver
    private WebDriver driver;
    // create driver in constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // web elements
    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "[title='Register']" )
    private WebElement registerLink;

    @FindBy(css = "[title='Log In']")
    private WebElement loginLink;


    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = ".search-button")
    private WebElement searchButton;

    @FindBy(id = "select-language")
    private WebElement languageButton;

    @FindBy(css ="#select-language > option:nth-child(3)")
    private WebElement germanlanguageButton;




    // methods

    public void clickAccountLink(){
        accountLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }

    public void clickRegisterlink(){registerLink.click();}

    public void setSearchField(String value){
        searchField.sendKeys(value);
    }

    public void clickSearchButton(){
        searchButton.click();
    }


    public void clicklanguageButton(){languageButton.click();}

    public void clickgermanLanguageButton(){germanlanguageButton.click();}


    public boolean displaygermanLanguageButton(){germanlanguageButton.isDisplayed();

        return true;
    }

}