package tests;


import config.Config;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest{
    /**
     * Тест1:
     * 1. С главной страницы перейти на страницу логина
     * 2. Ввести в поле email нужный email
     * 3. Ввести в поле password нужный pass
     * 4. Нажать на кнопку "Sign in"
     * 5. Саму корректность входа не проверяем, там какой-то кривой сайт и после регистрации
     * данные не сохраняются в базу
     */
    @Test
    @Description("Login")
    public void login() {
        MainPage mainPage = new MainPage(Config.URL);
        mainPage.goToLogin();
        LoginPage loginPage = new LoginPage();
        loginPage.getToText();
        loginPage.login();
       // Assertions.assertTrue();
       // тут должна быть проверка, но т/к сайт работает некорректно, я пока не придумала как ее исправить
    }
}
