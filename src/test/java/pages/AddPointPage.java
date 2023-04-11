package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Data
public class AddPointPage {
    private SelenideElement button = $(byClassName("android.widget.Button"));
    private SelenideElement search = $(byClassName("android.widget.TextView"));
    private SelenideElement inputSearch = $(byClassName("android.widget.EditText"));
    private SelenideElement firstElementInSearch = $(byClassName("android.widget.TextView"),1);

    private SelenideElement acceptButton = $x("/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
            "widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform." +
            "ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget." +
            "Button");

    private SelenideElement saveButton = $x("/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
            "widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform." +
            "ComposeView/android.view.View/android.view.View/android.view.View[5]/android.widget.Button");
}
