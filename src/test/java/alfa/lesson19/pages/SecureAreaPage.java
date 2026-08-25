package alfa.lesson19.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class SecureAreaPage {

    SelenideElement loginResultMessage = Selenide.$("#flash");
    SelenideElement buttonLogout = Selenide.$("div a[class='button secondary radius']");

    public void checkMessageText(String text) {
        loginResultMessage.shouldBe(visible);
        loginResultMessage.shouldHave(text(text));
    }

    public void checkLogoutButtonVisible() {
        buttonLogout.shouldBe(visible);
    }

    public FormAuthLoginPage logout() {
        buttonLogout.click();
        return new FormAuthLoginPage();
    }

}
