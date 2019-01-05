package simbirsoft.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(css = "a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in")
    WebElement signIn;

    private By identifierNext = By.id("identifierNext");

    public void open() {

        driver.get("https://www.google.com/intl/ru/gmail/about/#");

    }

    public void getStarted() {

        signIn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(identifierNext));

    }

}
