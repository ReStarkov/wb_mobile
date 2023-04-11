package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;
import static org.openqa.selenium.By.className;

@Data
public class StartPage {
    private SelenideElement russiButton = $$(className("android.widget.TextView")).findBy(text("Россия"));
    private SelenideElement laterButton = $(id("com.wildberries.ru:id/remindLaterButton"));
}
