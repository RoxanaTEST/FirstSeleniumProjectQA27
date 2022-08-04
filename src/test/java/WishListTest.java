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


public class WishListTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    @Test
    public void validWishlisttest() {

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent")).click();
        driver.findElement(By.cssSelector(".actions .button")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
       driver.findElement(By.id("email")).sendKeys("roxanatestare@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Testareplatforma!");
        driver.findElement(By.id("send2")).click();


        wait(10);
          WebElement myWishlistproduct = driver.findElement(By.cssSelector("#item_1124 .product-name a"));
          Assert.assertTrue(((WebElement) myWishlistproduct).isDisplayed());

    }

    @After
    public void closeDriver() {
        driver.quit();
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

