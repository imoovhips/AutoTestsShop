package tests;

import config.Config;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.ShoppingCartPage;

public class ShoppingCartTest extends BaseTest{
    @Test
    public void checkToEmptyShoppingCart() {
        MainPage mainPage = new MainPage(Config.URL);
        mainPage.enterToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        String text = shoppingCartPage.getToText();
        Assertions.assertTrue(text.contains("There are no items in your cart.\n" +
                "Back"));
    }
}
