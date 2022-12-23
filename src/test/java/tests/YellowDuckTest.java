package tests;
import config.Config;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;


import static config.Config.SEARCH_YELLOW_DUCK;


/**
 * Класс, который реализует тест для YellowDuck:
 * Шаги:
 * 1. Открыть сайт
 * 2. Нажать на кнопку поиска и ввести текст "Yellow Duck"
 * 3. В найденных элементах получить href атрибут первого найденного элемента
 * 4. Убедиться, что href ссылка содержит слово "Yellow duck"
 */

public class YellowDuckTest extends BaseTest{
    @Test

    public void checkHref() {

        MainPage mainPage = new MainPage(Config.URL); // создаем экземпляр класса MainPage чтобы открыть браузер
        mainPage.search(SEARCH_YELLOW_DUCK);
        mainPage.EnterSearchField();
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirst(); // записали ссылку на получение href в переменную
        Assertions.assertTrue(href.contains("yellow-duck"));
    }
}
