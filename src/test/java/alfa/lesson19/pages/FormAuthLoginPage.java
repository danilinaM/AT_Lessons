package alfa.lesson19.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public class FormAuthLoginPage {

    SelenideElement titleBeforeLogin = Selenide.$("h2");
    SelenideElement userName = Selenide.$("form#login input#username");
    SelenideElement password = Selenide.$("form#login input#password");
    SelenideElement buttonLogin = Selenide.$("form#login button[class='radius']");
    SelenideElement linkElementalSelenium = Selenide.$x("//a[text()='Elemental Selenium']");
    SelenideElement loginResultMessage = Selenide.$("#flash");

    public void checkTextOfTitle(String value) {
        titleBeforeLogin.shouldHave(text(value));
    }

    public void enterValueInNameField(String value) {
        userName.shouldBe(visible);
        userName.setValue(value);
    }

    public void enterValueInPasswordField(String value) {
        password.shouldBe(visible);
        password.setValue(value);
    }

    public SecureAreaPage clickLoginButtonWithCorrectCreds() {
        buttonLogin.shouldBe(clickable);
        buttonLogin.click();
        return new SecureAreaPage();
    }

    public FormAuthLoginPage clickLoginButtonWithWrongCreds() {
        buttonLogin.shouldBe(clickable);
        buttonLogin.click();
        return new FormAuthLoginPage();
    }

    public void checkMessageText(String text) {
        loginResultMessage.shouldBe(visible);
        loginResultMessage.shouldHave(text(text));
    }

    public void checkElementalSeleniumLinkText(String text) {
        linkElementalSelenium.shouldBe(visible);
        linkElementalSelenium.shouldHave(text(text));
    }
}
