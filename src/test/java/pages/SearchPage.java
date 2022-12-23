package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * создали коллекцию элементов, чтобы получить первый из нее
 */
public class SearchPage {
    private final ElementsCollection articleProductTitles = $$x("//*[@class=\"link\"]");
    private final ElementsCollection articleProductFirst = $$x("//*[@id=\"box-search-results\"]/div[3]/section/article[1]");
    private final ElementsCollection addToCartButton = $$x("//button[@class=\"btn btn-success\"]");

    /**
     * Метод для получения первого элемента
     * Возвращает href из первого элемента articleProductTitles
     */

    public String getHrefFromFirst() {
        return articleProductTitles.first().getAttribute("href");

    }

    public void clickToElement() {

     articleProductFirst
            .first()
            .click();

    }
    public void addElementToCart() {
        addToCartButton
                .first()
                .click();
    }

}
