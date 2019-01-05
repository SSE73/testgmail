package simbirsoft;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public WebDriver driver;
    public WebDriverWait wait;

    String nodeUrl ;

    @Before
    public void setUp() throws MalformedURLException {

        nodeUrl = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(nodeUrl),capability);

        //System.setProperty("webdriver.crome.driver","src/main/resources/drivers/chromdriver237");
        //driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void close() {

    }

}
