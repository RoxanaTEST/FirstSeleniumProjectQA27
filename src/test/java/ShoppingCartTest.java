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


public class ShoppingCartTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }


      @Test
    public void AddtocartItem() {

          driver.findElement(By.cssSelector(".skip-account .label")).click();
          driver.findElement(By.cssSelector("[title='Log In']")).click();
          driver.findElement(By.id("email")).sendKeys("roxanatestare@gmail.com");
          driver.findElement(By.id("pass")).sendKeys("Testareplatforma!");
          driver.findElement(By.id("send2")).click();
          driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent >a ")).click();
          driver.findElement(By.cssSelector(".actions .button")).click();
          driver.findElement(By.id("option27")).click();
          driver.findElement(By.id("option81")).click();
          driver.findElement(By.cssSelector(".add-to-cart-buttons .button ")).click();

          WebElement addedproductmessage = driver.findElement(By.cssSelector(".success-msg span"));
          Assert.assertTrue(((WebElement) addedproductmessage).isDisplayed());
          wait(10);







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
