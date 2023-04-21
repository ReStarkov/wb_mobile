package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

@Data
public class MainPage {
    private SelenideElement search = $(id("com.wildberries.ru:id/search_searchEditText"));
    private SelenideElement currency = $(id("com.wildberries.ru:id/savedCurrencyButton"));
    private SelenideElement currencyName = $(id("com.wildberries.ru:id/savedCurrencyNameView"));
    private SelenideElement choosePoint = $(accessibilityId("Адрес доставки Москва"));
    private SelenideElement expectPoint = $(accessibilityId("Адрес доставки г. Москва, шоссе Энтузиастов д. 55"));
    private SelenideElement amCurrency = $(accessibilityId("Армянский драм"));
}
