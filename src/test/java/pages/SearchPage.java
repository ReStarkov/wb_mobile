package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.className;

@Data
public class SearchPage {
    private SelenideElement inputSearch = $(byClassName("android.widget.EditText"));
    private ElementsCollection searchResults = $$(className("android.widget.TextView"));
}
