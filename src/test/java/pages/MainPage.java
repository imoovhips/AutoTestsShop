package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта demo.litecart.net
 * Здесь вся логика взаимодействия с элементами на главной странице для тестов
 */
public class MainPage {
    // здесь устанавливаем переменные с локаторами, которые нам нужны
    private final SelenideElement searchFiled = $x("//*[@class=\"form-control\"][@type=\"search\"]");
    private final SelenideElement searchButton = $x("//*[@class=\"form-control\"][@type=\"search\"]");
    private final SelenideElement cardButton = $x("//*[@id=\"cart\"]");

    
    /**
     * Создали конструктор, через который мы будем открывать браузер
     * То есть при инициализации мы передаем какой-то аргумент (ссылку)
     */

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void search(String searchString) {
    searchButton.setValue(searchString);
    searchButton.click();
    }

    /**
     * Метод для выполнения поиска на сайте среди элементов и нажимается кнопка Enter
     */
    public void EnterSearchField() {
        searchFiled.sendKeys(Keys.ENTER);
    }
    public void enterToCart() {
        cardButton.click();
    }


}
