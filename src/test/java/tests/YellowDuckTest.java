package tests;
import config.Config;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;


import static config.Config.SEARCH_YELLOW_DUCK;


public class YellowDuckTest extends BaseTest{

    /** Тест:
     * 1. Ищем в поиске на главной странице продукт "Yellow duck"
     * 2. Проверяем, что в href найденного продукта отображается нужное название "Yellow duck"
     * (таким образом проверяем, что нашли верный продукт)
     */
    @Test
    @Description("Yellow-duck test")
    public void checkHref() {

        MainPage mainPage = new MainPage(Config.URL); // создаем экземпляр класса MainPage чтобы открыть браузер
        mainPage.search(SEARCH_YELLOW_DUCK);
        mainPage.EnterSearchField();
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirst(); // записали ссылку на получение href в переменную
        Assertions.assertTrue(href.contains("yellow-duck"));
    }
}
