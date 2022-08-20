package Test;
import org.apache.commons.lang3.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePageTest extends BaseTest {
    @Test
    public void changeLanguageTest() {
        //select language
        homePage.clicklanguageButton();
        homePage.clickgermanLanguageButton();

        Assert.assertTrue(homePage.displaygermanLanguageButton());
        wait(7);
    }

    @Test
    public void hoverOverCategoryTest() {
        Actions actions = new Actions(driver);
        WebElement womencategory= driver.findElement(By.cssSelector("a.level0"));
        actions.moveToElement(womencategory).perform();


        WebElement viewAll = driver.findElement(By.cssSelector("a.level1"));
        Assert.assertTrue(((WebElement) viewAll).isDisplayed());
        wait(5);
    }
}
