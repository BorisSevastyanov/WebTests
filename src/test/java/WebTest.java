import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTest {
    WebDriver driver;

    @BeforeMethod
    public void setU() {
        String chromeDriver = "webdriver.chrome.driver";

        String driverPath = "D:\\QA_Automation\\Drivers\\chromedriver.exe";

        System.setProperty(chromeDriver, driverPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown() {
        driver.quit();
    }


    @Test
            public void firstTest () {
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        driver.get(url);

        String actualResult = driver.getCurrentUrl();



        Assert.assertEquals(actualResult, expectedResult);




    }
}
