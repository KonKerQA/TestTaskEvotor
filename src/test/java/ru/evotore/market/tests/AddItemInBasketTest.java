package ru.evotore.market.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import ru.evotore.market.pages.addItemToBusket.AddMarkingInBasketPage;
import ru.evotore.market.pages.dashboard.DashboardPage;


public class AddItemInBasketTest extends BaseTest {

    @Feature("Добавление товара 'Маркировка' в корзину")
    @Test
    void addMarkingInBasketTest() {
        DashboardPage.goMarkingShopPage();
        AddMarkingInBasketPage.addToBasket().openBasket().checkBasket();
    }


}
