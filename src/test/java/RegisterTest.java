import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    public void validRegistertest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roxana");
        driver.findElement(By.id("middlename")).sendKeys("Mihaela");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("email_address")).sendKeys("roxanatestare@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Testareplatforma!");
        driver.findElement(By.id("confirmation")).sendKeys("Testareplatforma!");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        driver.quit();



    }
}
