package simbirsoft.signIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public SendPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    @FindBy(css = ".T-I.J-J5-Ji.T-I-KE.L3")
    private WebElement buttonWriteLetter;

    @FindBy(css = "textarea[aria-label=\"Кому\"]")
    private WebElement email;

    @FindBy(name = "subjectbox")
    private WebElement subjectbox;

    @FindBy(css = "div[aria-label=\"Тело письма\"]")
    private WebElement bodyLetterser;

    @FindBy(css = ".J-J5-Ji.btA")
    private WebElement buttonSend;


    public void openSendForm() {

        buttonWriteLetter.click();

    }

    public void whomLetter(String address) {

        email.sendKeys(address);

    }

    public void setSubjectbox(String subjectboxText) {

        subjectbox.sendKeys(subjectboxText);

    }

    public void bodyLetterser(String letterText) {

        bodyLetterser.sendKeys(letterText);

    }

    public void buttonSend() {

        buttonSend.click();

    }

}
