package alfa.lesson19.cucumber.steps;

import alfa.lesson19.pages.FormAuthLoginPage;
import alfa.lesson19.pages.MainPage;
import alfa.lesson19.pages.SecureAreaPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Configuration.baseUrl;

public class FormAuthenticationSteps {

    private final MainPage mainPage = new MainPage();
    private FormAuthLoginPage formAuthLoginPage;
    private SecureAreaPage secureAreaPage;

    @Дано("открыта главная страница")
    public void openMainPage() {
        Selenide.open(baseUrl);
    }

    @Когда("кликнуть по ссылке Form Authentication")
    public void clickFormAuthentication() {
        formAuthLoginPage = mainPage.clickFormAuthPage();
    }

    @Тогда("заголовок страницы содержит текст {string}")
    public void checkTitle(String text) {
        formAuthLoginPage.checkTextOfTitle(text);
    }

    @Когда("пользователь вводит в Username значение {string}")
    public void enterUsername(String value) {
        formAuthLoginPage.enterValueInNameField(value);
    }

    @И("пользователь вводит в Password значение {string}")
    public void enterPassword(String value) {
        formAuthLoginPage.enterValueInPasswordField(value);
    }

    @И("пользователь нажимает кнопку Login")
    public void clickLogin() {
        secureAreaPage = formAuthLoginPage.clickLoginButtonWithCorrectCreds();
    }

    @Тогда("сообщение содержит текст {string}")
    public void checkMessageText(String text) {
        formAuthLoginPage.checkMessageText(text);
    }

    @И("на экране присутствует кнопка Logout")
    public void checkLogoutVisible() {
        secureAreaPage.checkLogoutButtonVisible();
    }

    @Когда("пользователь нажимает кнопку Logout")
    public void clickLogout() {
        formAuthLoginPage = secureAreaPage.logout();
    }

    @Тогда("на странице есть ссылка с текстом {string}")
    public void checkElementalSeleniumLink(String text) {
        formAuthLoginPage.checkElementalSeleniumLinkText(text);
    }
}
