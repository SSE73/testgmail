package simbirsoft.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LetterPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public LetterPage(WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(driver,10);

    }

    @FindBy(xpath = ".//*[@id='aso_search_form_anchor']/div/input")
    private WebElement name;

    @FindBy(xpath = ".//*[@id='aso_search_form_anchor']/button[4]")
    private WebElement nameButton;


    @FindBy(xpath = ".//*[@id=':8c']/span/span[2]")
    private WebElement countLetters;

    private By countLetters1 = By.xpath(".//*[@id=':8c']/span/span[2]");

    private By asoSearchFormAnchor = By.id("aso_search_form_anchor");

//    @FindBy(xpath = "//div[@class = \"ae4 UI\"]//div[@class=\"yW\"]//span[text()=\"Филинин Илья\"]")
//    private WebElement countFio;

    public void setFindFio(String nameText) {

        name.sendKeys(nameText);
        nameButton.click();

    }

    public String getCountLetters() {

//        wait.until(ExpectedConditions.visibilityOfElementLocated(countLetters1));
        String counterText = countLetters.getText();
        return counterText;

    }

    public List<WebElement> getCountFio() {

        List<WebElement> countFio = driver.findElements(By.xpath("//div[@class = \"ae4 UI\"]//div[@class=\"yW\"]//span[text()=\"Филинин Илья\"]") );
        return countFio;

    }
}
