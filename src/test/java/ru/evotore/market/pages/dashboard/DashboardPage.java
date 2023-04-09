package ru.evotore.market.pages.dashboard;

import io.qameta.allure.Step;
import ru.evotore.market.pages.addItemToBusket.AddMarkingInBasketPage;
import static com.codeborne.selenide.Selenide.open;

public class DashboardPage {

    @Step("Открыть товар 'Маркировка' по прямой ссылке")
    public static DashboardPage goMarkingShopPage() {
        return open("/store/apps/e7e1a9af-d0ad-4dec-97ce-8b27805c145d", DashboardPage.class);
    }

}
