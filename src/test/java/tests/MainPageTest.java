package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;


public class MainPageTest extends TestBase {
    @BeforeEach
    void gettingStartedTest () {
        step("Выбор страны и отказ от обновления", () -> {
            startPage.getRussiButton().click();
            startPage.getLaterButton().click();

        });
    }

    @Test
    @Tag("android")
    @DisplayName("Проверка соответствия выдачи результатов поиска")
    void searchTest () {
        step("Ввод в поисковую строку текста 'atomic heart ps4'", () -> {
            mainPage.getSearch().click();
            searchPage.getInputSearch().sendKeys("Atomic heart ps4");
        });
        step("Проверка результата выдачи. В списке присутствует текст 'atomic heart playstation 4'", () -> {
            searchPage.getSearchResults().findBy(text("atomic heart playstation 4")).shouldBe(visible);
        });
    }

    @Test
    @Tag("android")
    @DisplayName("Добавление пункта выдачи")
    void addPointTest () {
        step("Нажатие на меню выбора пункта выдачи ", () -> {
            $(accessibilityId("Адрес доставки Москва")).click();
        });
        step("Кнопка добавления пункта выдачи отображается на открывшейся странице", () -> {
            addPointPage.getButton().shouldBe(visible);
        });
        step("Нажатие на кнопку добавления пункта выдачи", () -> {
            addPointPage.getButton().click();
        });
        step("Отображается меню поиска места. Нажатие на поиск", () -> {
            addPointPage.getSearch().shouldBe(visible);
            addPointPage.getSearch().click();
        });
        step("Ввести адресс 'Москва шоссе энтузиастов 55'", () -> {
            addPointPage.getInputSearch().click();
            addPointPage.getInputSearch().sendKeys("'Москва шоссе энтузиастов 55");
        });
        step("В списке выдачи отображается искомый адрес на первой позиции", () -> {
            addPointPage.getFirstElementInSearch().shouldHave(text("г. Москва, шоссе Энтузиастов д. 55"));
        });
        step("Выбор адреса", () -> {
            addPointPage.getFirstElementInSearch().click();
        });
        step("Отображается меню подтверждения добавления пункта выдачи. Нажатие на кнопку подтверждения", () -> {
            addPointPage.getAcceptButton().click();
        });
        step("Отображается окно подтверждения. В нем указан введенный ранее адрес.", () -> {
            addPointPage.getFirstElementInSearch().shouldHave(text("г. Москва, шоссе Энтузиастов д. 55"));
        });
        step("Нажатие на кнопку 'сохранить'.", () -> {
            addPointPage.getSaveButton().click();
        });
        step("На главной странице отображается введенный ранее адрес.", () -> {
            $(accessibilityId("Адрес доставки г. Москва, шоссе Энтузиастов д. 55")).shouldBe(visible);
        });
    }

    @Test
    @Tag("android")
    @DisplayName("Переключение валюты")
    void moneyTest () {
        step("Нажатие на иконку отображени стоимости товаров (по умолчанию рубль)", () -> {
            mainPage.getCurrency().click();
        });
        step("Выбор армянского драма", () -> {
            $(accessibilityId("Армянский драм")).click();
        });
        step("Проверка результата", () -> {
            mainPage.getCurrencyName().shouldHave(text("драм"));
        });
    }
}
