package pages.components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;

public class CalendarSetDateOfBirth {

    private final SelenideElement
            dateOfBirthInputInput = $("#dateOfBirthInput");

    public void setDateOfBirth(String dateOfBirth) {
        dateOfBirthInputInput.sendKeys(Keys.CONTROL + "a");
        dateOfBirthInputInput.sendKeys(Keys.SPACE);
        dateOfBirthInputInput.sendKeys(Keys.LEFT);
        dateOfBirthInputInput.setValue(dateOfBirth).pressEnter();

    }
}
