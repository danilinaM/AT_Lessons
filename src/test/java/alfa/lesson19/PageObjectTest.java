package alfa.lesson19;

import alfa.lesson19.pages.FormAuthLoginPage;
import alfa.lesson19.pages.MainPage;
import alfa.lesson19.pages.SecureAreaPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;

public class PageObjectTest extends BaseTest {

    MainPage mainPage = new MainPage();
    FormAuthLoginPage formAuthLoginPage;
    SecureAreaPage secureAreaPage;
    String correctName = "tomsmith";
    String correctPassword = "SuperSecretPassword!";
    String wrongName = "admin";
    String wrongPassword = "1234";
    String textAfterLogin = "You logged into a secure area!";
    String elementalSeleniumLinkText = "Elemental Selenium";
    String messageWhenInvalidName = "Your username is invalid!";

    @Test
    public void successfulLoginAndLogout() {
        Selenide.open(baseUrl);
        formAuthLoginPage = mainPage.clickFormAuthPage();
        formAuthLoginPage.checkTextOfTitle();
        formAuthLoginPage.enterValueInNameField(correctName);
        formAuthLoginPage.enterValueInPasswordField(correctPassword);
        secureAreaPage = formAuthLoginPage.clickLoginButtonWithCorrectCreds();
        secureAreaPage.checkTitleAfterLoginText(textAfterLogin);
        formAuthLoginPage = secureAreaPage.logout();
        formAuthLoginPage.checkTextOfTitle();
    }

    @Test
    public void loginWithInvalidUsername() {
        Selenide.open(baseUrl);
        formAuthLoginPage = mainPage.clickFormAuthPage();
        formAuthLoginPage.checkElementalSeleniumLinkText(elementalSeleniumLinkText);
        formAuthLoginPage.enterValueInNameField(wrongName);
        formAuthLoginPage.enterValueInPasswordField(wrongPassword);
        formAuthLoginPage.clickLoginButtonWithWrongCreds();
        formAuthLoginPage.errorMessageWhenWrongNameCheckText(messageWhenInvalidName);
    }

}
