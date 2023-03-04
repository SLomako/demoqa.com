package pages;

import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private final static String TITLE_TEXT = "Practice Form";

    public PracticeFormPage openPage() {

        open("https://demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);

        return this;
    }

    public PracticeFormPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }

    public PracticeFormPage setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public PracticeFormPage setGenter(String value) {
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setNumberPhone(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public PracticeFormPage setDateOfBirth(String value) {
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
        $("#dateOfBirthInput").sendKeys(Keys.SPACE);
        $("#dateOfBirthInput").sendKeys(Keys.LEFT);
        $("#dateOfBirthInput").setValue(value).pressEnter();

        return this;
    }

    public PracticeFormPage setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public PracticeFormPage setHobbies(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setUploudPicture(String value) {
        File prtSC = new File(value);
        $("#uploadPicture").uploadFile(prtSC);

        return this;
    }

    public PracticeFormPage setAddresStateCity(String address, String state, String city) {
        $("#currentAddress").setValue(address);
        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();

        return this;
    }
}
