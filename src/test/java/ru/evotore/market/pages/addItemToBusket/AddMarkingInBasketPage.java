package ru.evotore.market.pages.addItemToBusket;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.xpath;

public class AddMarkingInBasketPage {
    private static final By tariffTabLocator = xpath("//div[@class='evo-tab']"); // Вкладки на странице
    private static final By toBasketBtn = xpath("//button[@class='plan-item-controls__basket-button plan-item-controls__basket-button_with-img ui-button ui-button_icon ng-star-inserted']"); // Кнопка "Добавить в корзину"
    private final By openBasketBtn = xpath("//button[@class='plan-item-controls__basket-button ng-star-inserted']"); // Кнопка "В корзину"
    private final By itemName = xpath("//a[@class='basket-item__title']"); // Имя товара
    private final By basketTotal = xpath("//basket-total"); // Блок "К оплате"


    @Step("Добавить в корзину")
    public static AddMarkingInBasketPage addToBasket() {
        $$(tariffTabLocator).findBy(text(" Тарифы ")).click();
        $(toBasketBtn).click();
        return new AddMarkingInBasketPage();
    }

    @Step("Открыть корзину")
    public AddMarkingInBasketPage openBasket() {
        $(openBasketBtn).click();
        return this;
    }

    @Step("Проверить корзину")
    public AddMarkingInBasketPage checkBasket() {
        $(itemName).shouldHave(text("Маркировка "));
        $(basketTotal).shouldBe(visible);
        return this;
    }

}
