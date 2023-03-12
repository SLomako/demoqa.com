package pages.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    private final SelenideElement
            dateOfBirthInputInput = $("#dateOfBirthInput");

    public void setDate(String date) {
        dateOfBirthInputInput.sendKeys(Keys.CONTROL + "a");
        dateOfBirthInputInput.sendKeys(Keys.SPACE);
        dateOfBirthInputInput.sendKeys(Keys.LEFT);
        dateOfBirthInputInput.setValue(date).pressEnter();

    }
}
