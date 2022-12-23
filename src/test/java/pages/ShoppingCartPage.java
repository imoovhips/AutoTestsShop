package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ShoppingCartPage{


    private final SelenideElement emptyCartTitles = $x("//*[@id=\"box-checkout\"]");
    private final ElementsCollection cardListing = $$x("//a[@class=\"link\"]");


    public String getToText() {
        emptyCartTitles.shouldHave(Condition.exactText("There are no items in your cart.\n" +
                "Back"));
        return emptyCartTitles.text();
    }
    public String getHrefFromFirst() {
        return cardListing.first().getAttribute("href");

    }

}
