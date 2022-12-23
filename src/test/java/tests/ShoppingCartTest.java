package tests;

import config.Config;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchPage;
import pages.ShoppingCartPage;

import static config.Config.SEARCH_GREEN_DUCK;

public class ShoppingCartTest extends BaseTest{
    /**
     * Тест1:
     * 1. Зайти в корзину
     * 2. Проверить, что она открылась и отображается текст "There are no items in your cart. Back"
     * (значит, она пустая)
     */
    @Test
    @Description("Check empty Cart")
    public void checkToEmptyShoppingCart() {
        MainPage mainPage = new MainPage(Config.URL);
        mainPage.enterToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        String text = shoppingCartPage.getToText();

        Assertions.assertTrue(text.contains("There are no items in your cart.\n" +
                "Back"));
    }
    /**
     * Тест2:
     * 1. Найти в поиске элемент "Green Duck"
     * 2. Добавить его в корзину
     * 3. Открыть корзину и убедится, что href элемента содержит нужный текст
     */

    @Test
    @Description("Add products to Cart")
    public void addProductCart() {
        MainPage mainPage = new MainPage(Config.URL);
        mainPage.search(SEARCH_GREEN_DUCK); // нашли нужный продукт
        mainPage.EnterSearchField();
        SearchPage searchPage = new SearchPage();
        searchPage.clickToElement(); // нажали на первый продукт в поиске
        searchPage.addElementToCart(); // добавили элемент в корзину
        mainPage.enterToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
       shoppingCartPage.getHrefFromFirst();
        String href = shoppingCartPage.getHrefFromFirst(); // записали href в переменную
        Assertions.assertTrue(href.contains("green-duck")); // выполнили проверку, что href содержит нужный текст
    }
}
