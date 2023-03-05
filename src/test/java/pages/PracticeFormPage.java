package pages;

import org.openqa.selenium.Keys;
import pages.components.PracticalFormResults;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {
    private final static String TITLE_TEXT = "Practice Form";

    PracticalFormResults PracticalFormResults = new PracticalFormResults();

    public PracticeFormPage openPage() {
        $x("//div[@class='card-body']/h5[text()='Forms']").click();
        $x("//span[@class='text'][text()='Practice Form']").click();
        $(".main-header").shouldHave(text(TITLE_TEXT));

        return this;
    }

    public PracticeFormPage removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String name) {
        $("#firstName").setValue(name);

        return this;
    }

    public PracticeFormPage setLastName(String lastName) {
        $("#lastName").setValue(lastName);

        return this;
    }

    public PracticeFormPage setEmail(String email) {
        $("#userEmail").setValue(email);

        return this;
    }

    public PracticeFormPage setGenter(String genter) {
        $("#genterWrapper").$(byText(genter)).click();

        return this;
    }

    public PracticeFormPage setNumberPhone(String numPhone) {
        $("#userNumber").setValue(numPhone);

        return this;
    }

    public PracticeFormPage setDateOfBirth(String dataOfBerth) {
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
        $("#dateOfBirthInput").sendKeys(Keys.SPACE);
        $("#dateOfBirthInput").sendKeys(Keys.LEFT);
        $("#dateOfBirthInput").setValue(dataOfBerth).pressEnter();

        return this;
    }

    public PracticeFormPage setSubjects(String subjects) {
        $("#subjectsInput").setValue(subjects).pressEnter();

        return this;
    }

    public PracticeFormPage setHobbies(String hobbies) {
        $("#hobbiesWrapper").$(byText(hobbies)).click();

        return this;
    }

    public PracticeFormPage setUploudPicture(String path) {
        File prtSC = new File(path);
        $("#uploadPicture").uploadFile(prtSC);

        return this;
    }

    public PracticeFormPage setAddres(String address) {
        $("#currentAddress").setValue(address);

        return this;
    }

    public PracticeFormPage setState(String state) {
        $("#state").click();
        $(byText(state)).click();

        return this;
    }

    public PracticeFormPage setCity(String city) {
        $("#city").click();
        $(byText(city)).click();

        return this;
    }

    public void clickSubmit() {
        $("#submit").click();

    }

    public PracticeFormPage shouldHaveResults(String key, String value) {
        PracticalFormResults.verifeResults(key, value);

        return this;
    }
}
