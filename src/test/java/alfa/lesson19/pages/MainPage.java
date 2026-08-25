package alfa.lesson19.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;

public class MainPage {

    SelenideElement formAuthefication = Selenide.$(byLinkText("Form Authentication"));

    public FormAuthLoginPage clickFormAuthPage() {
        formAuthefication.shouldBe(visible);
        formAuthefication.click();
        return new FormAuthLoginPage();
    }

}
