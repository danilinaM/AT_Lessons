package alfa.lesson19.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class SecureAreaPage {

    SelenideElement titleAfterLogin = Selenide.$("#flash");
    SelenideElement buttonLogout = Selenide.$("div a[class='button secondary radius']");

    public void checkTitleAfterLoginText(String text) {
        titleAfterLogin.shouldBe(visible);
        titleAfterLogin.shouldHave(text(text));
    }

    public FormAuthLoginPage logout() {
        buttonLogout.shouldBe(visible);
        buttonLogout.click();
        return new FormAuthLoginPage();
    }

}
