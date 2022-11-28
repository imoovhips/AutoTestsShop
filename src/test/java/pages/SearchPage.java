package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * создали коллекцию элементов, чтобы получить первый из нее
 */
public class SearchPage {
    private final ElementsCollection articleProductTitles = $$x("//*[@class=\"link\"]");

    /**
     * Метод для получения первого элемента
     * Возвращает href из первого элемента articleProductTitles
     */

    public String getHrefFromFirst() {
        return articleProductTitles.first().getAttribute("href");

    }
}
