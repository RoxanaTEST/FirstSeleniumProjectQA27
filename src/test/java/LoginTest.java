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

public class LoginTest {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
    }


    @Test
    public void validLoginTest() {

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("roxanatestare@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Testareplatforma!");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeText = driver.findElement(By.cssSelector(".hello > strong"));
        Assert.assertEquals("Hello, Roxana Mihaela Pop!", welcomeText.getText());
        WebElement myAccount = driver.findElement(By.cssSelector(".hello > strong"));
        Assert.assertTrue(((WebElement) myAccount).isDisplayed());

    }

    @Test
    public void invalidLoginTest() {
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("hdjhjj@h3d.com");
        driver.findElement(By.id("pass")).sendKeys("hdhhshjd");
        driver.findElement(By.id("send2")).click();

        WebElement invalidcredentialserror = driver.findElement(By.cssSelector(".messages span"));
        Assert.assertTrue(((WebElement) invalidcredentialserror).isDisplayed());

        WebElement errortext = driver.findElement(By.cssSelector(".messages span"));
        Assert.assertEquals("Invalid login or password.", errortext.getText());
        wait(5);
    }

    @Test
    public void emptyfieldsLoginTest() {

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys(" ");
        driver.findElement(By.id("pass")).sendKeys(" ");
        driver.findElement(By.id("send2")).click();
        wait(10);

        WebElement errorlogintext = driver.findElement(By.cssSelector(".validation-advice"));
        Assert.assertEquals("This is a required field.", errorlogintext.getText());


    }
        @Test
        public void changeLanguageTest () {
            //select language
            Select selectLanguageDropdown = new Select(driver.findElement(By.id("select-language")));
            selectLanguageDropdown.selectByVisibleText("German");

            WebElement germanLanguage = driver.findElement(By.cssSelector("#select-language > option:nth-child(3)"));
            Assert.assertTrue(((WebElement) germanLanguage).isDisplayed());
        }

        @Test
        public void hoverOverCategoryTest () {
            Actions action = new Actions(driver);
            WebElement womenCategory = driver.findElement(By.cssSelector("a.level0"));
            action.moveToElement(womenCategory).perform();

            WebElement viewAll = driver.findElement(By.cssSelector("a.level1"));
            Assert.assertTrue(((WebElement) viewAll).isDisplayed());
            wait(5);

//#nav > ol > li.level0.nav-1.first.parent > a
            //        Strig random = RandomStringUtils.randomAlphanumeric(12);
            //        String myEmail = random+"@testmail.com";
        }

        @After
        public void closeDriver () {
            driver.quit();
        }

        public static void wait ( int seconds){
            try {
                Thread.sleep(seconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


