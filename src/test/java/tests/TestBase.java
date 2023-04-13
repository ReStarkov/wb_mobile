package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.AddPointPage;
import pages.MainPage;
import pages.SearchPage;
import pages.StartPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBase {

    StartPage startPage = new StartPage();
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();
    AddPointPage addPointPage = new AddPointPage();

    public static String env = System.getProperty("env");

    @BeforeAll
    public static void setDriver() {
        switch (env) {
            case "emulation":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            case "remote":
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = Selenide.sessionId().toString();
        Attach.pageSource();
        closeWebDriver();

        if (env.equals("android") || env.equals("ios")) {
            Attach.addVideo(sessionId);
        }
    }
}
