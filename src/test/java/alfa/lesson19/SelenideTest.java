package alfa.lesson19;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byLinkText;

public class SelenideTest {

    @Test
    public void test(){
        Selenide.open("https://the-internet.herokuapp.com/");

        SelenideElement formAuthefication = Selenide.$(byLinkText("Form Authentication"));
        SelenideElement titleBeforeLogin = Selenide.$("h2");
        SelenideElement titleAfterLogin = Selenide.$("#flash");
        SelenideElement userName = Selenide.$("form#login input#username");
        SelenideElement password = Selenide.$("form#login input#password");
        SelenideElement buttonLogin = Selenide.$("form#login button[class='radius']");
        SelenideElement buttonLogout = Selenide.$("div a[class='button secondary radius']");

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
}
