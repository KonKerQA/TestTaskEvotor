package ru.evotore.market.tests;

import com.codeborne.selenide.Configuration;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import ru.evotore.market.pages.dashboard.DashboardPage;

public class BaseTest {


    static {
        Configuration.baseUrl = "https://market.evotor.ru";
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void addAttachments() {
        Attach.takeScreenshot("Final screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
    }

}
