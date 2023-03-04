package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticalFormResults {
    public void verifeResults(String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));

    }
}
