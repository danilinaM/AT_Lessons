package alfa.lesson19;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byLinkText;

public class SelenideTest extends BaseTest{

    SelenideElement formAuthefication = Selenide.$(byLinkText("Form Authentication"));
    SelenideElement titleBeforeLogin = Selenide.$("h2");
    SelenideElement titleAfterLogin = Selenide.$("#flash");
    SelenideElement userName = Selenide.$("form#login input#username");
    SelenideElement password = Selenide.$("form#login input#password");
    SelenideElement buttonLogin = Selenide.$("form#login button[class='radius']");
    SelenideElement buttonLogout = Selenide.$("div a[class='button secondary radius']");
    SelenideElement linkBeforeLogin = Selenide.$x("//a[text()='Elemental Selenium']");
    SelenideElement errorMessageWrongUsername = Selenide.$("#flash");

    @Test
    public void successfulLoginAndLogout () {

        Selenide.open(baseUrl);
        formAuthefication.shouldBe(visible);
        formAuthefication.click();
        titleBeforeLogin.shouldHave(text("Login Page"));
        userName.shouldBe(visible);
        userName.setValue("tomsmith");
        password.shouldBe(visible);
        password.setValue("SuperSecretPassword!");
        buttonLogin.shouldBe(clickable);
        buttonLogin.click();
        titleAfterLogin.shouldHave(text("You logged into a secure area!"));
        buttonLogout.shouldBe(visible);
        buttonLogout.click();
        titleBeforeLogin.shouldHave(text("Login Page"));
    }

    @Test
    public void loginWithInvalidUsername() {

        Selenide.open(baseUrl);
        formAuthefication.shouldBe(visible);
        formAuthefication.click();
        linkBeforeLogin.shouldBe(visible);
        userName.shouldBe(visible);
        userName.setValue("admin");
        password.shouldBe(visible);
        password.setValue("1234");
        buttonLogin.shouldBe(clickable);
        buttonLogin.click();
        errorMessageWrongUsername.shouldBe(visible);
        errorMessageWrongUsername.shouldHave(text("Your username is invalid!"));
    }
}
