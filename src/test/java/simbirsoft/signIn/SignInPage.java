package simbirsoft.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SignInPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,10);

    }

//==============================================================================================
    @FindBy(id = "identifierId")
    private WebElement login;

    @FindBy(id = "identifierNext")
    private WebElement loginNext;

    private By profileIdentifier = By.id("profileIdentifier");

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(id = "passwordNext")
    private WebElement passwordNext;

    private By asoSearchFormAnchor = By.id("aso_search_form_anchor");

    public void setLogin(String loginName) {

        login.sendKeys(loginName);
        loginNext.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileIdentifier));

    }

    public void setPassword(String passwordText) {

        password.sendKeys(passwordText);
        passwordNext.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(asoSearchFormAnchor));

    }

    public String profileIdentifier() {

        String profileIdentifierText = driver.findElement(profileIdentifier).getText();
        return  profileIdentifierText;

    }

}
