package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;
import static config.Config.EMAIL;
import static config.Config.PASS;

public class LoginPage {

    private final SelenideElement checkLoginPage = $x("//*[@id=\"box-login\"]/div[1]/h2");
    private final SelenideElement emailField = $x("//*[@id=\"box-login\"]/div[2]/form/div[1]/div/input");
    private final SelenideElement passField = $x("//*[@id=\"box-login\"]/div[2]/form/div[2]/div/input");
    private final SelenideElement signInButton = $x("//*[@id=\"box-login\"]/div[2]/form/p[1]/button");

    public void getToText() {
        checkLoginPage
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Sign In"));
    }
    public void login() {
      emailField
              .setValue(EMAIL);
// .shouldHave(Condition.text("antipenkomv@bk.ru"));
// не работает проверка по тексту, чтобы сопоставить введенный email с верным
      passField
              .sendKeys(PASS);
      signInButton
              .click();
    }
}
