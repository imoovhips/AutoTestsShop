package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage{


    private final SelenideElement emptyCartTitles = $x("//*[@id=\"box-checkout\"]");

    //*[@id="box-checkout"]
    //*[@class="btn btn-success btn-lg"]

    /**
     * Что мы будем делать на этой странице?
     * 1. Зайти в корзину
     * 2. Проверить, что она открылась и отображается текст "There are no items in your cart. Back"
     */



    public String getToText() {
        emptyCartTitles.shouldHave(Condition.exactText("There are no items in your cart.\n" +
                "Back"));
        return emptyCartTitles.text();
    }
}
