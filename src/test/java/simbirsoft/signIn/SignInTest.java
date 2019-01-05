package simbirsoft.signIn;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import simbirsoft.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SignInTest extends WebDriverSettings {

    @Test
    public void singIn() {

        HomePage homePage = PageFactory.initElements(driver,HomePage.class);

        homePage.open();

        homePage.getStarted();

        SignInPage signInPage = PageFactory.initElements(driver,SignInPage.class);

        signInPage.setLogin("testsse73@gmail.com");

        String profileIdentifierText = signInPage.profileIdentifier();

        Assert.assertEquals(profileIdentifierText, "testsse73@gmail.com");

        signInPage.setPassword("test_12345");

        LetterPage letterPage = PageFactory.initElements(driver,LetterPage.class);

        letterPage.setFindFio("Филинин Илья");

        List<WebElement> intCountFio = letterPage.getCountFio();
        int bbb = ((ArrayList) intCountFio).size();

        int countLettersText = Integer.parseInt(letterPage.getCountLetters());
        Assert.assertEquals(countLettersText, bbb);

        SendPage sendPage = PageFactory.initElements(driver,SendPage.class);

        sendPage.openSendForm();

        //sendPage.whomLetter("ssesev65@mail.ru");
        sendPage.whomLetter("ilya.filinin@simbirsoft.com");

        sendPage.setSubjectbox("Тестовое задание от Сысылятина");

        sendPage.bodyLetterser("Было прислано " + countLettersText + " письма");

        sendPage.buttonSend();

    }

}

