package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarSetDateOfBirth;
import pages.components.PracticalFormResults;


import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    private final static String TITLE_TEXT = "Practice Form";
    private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapperInput = $("#genterWrapper"),
            userNumberPhoneInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapperInput = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            stateInput = $("#state"),
            cityInput = $("#city"),
            submitInput = $("#submit");



    PracticalFormResults practicalFormResults = new PracticalFormResults();
    CalendarSetDateOfBirth calendarSetDateOfBirth = new CalendarSetDateOfBirth();

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

    public PracticeFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);


        return this;
    }

    public PracticeFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public PracticeFormPage setEmail(String email) {
        userEmailInput.setValue(email);

        return this;
    }

    public PracticeFormPage setGender(String genter) {
        genderWrapperInput.$(byText(genter)).click();

        return this;
    }

    public PracticeFormPage setNumberPhone(String numberPhone) {
        userNumberPhoneInput.setValue(numberPhone);

        return this;
    }
    public PracticeFormPage setDateOfBirth(String dateOfBirth) {
        calendarSetDateOfBirth.setDateOfBirth(dateOfBirth);
        return this;
    }


    public PracticeFormPage setSubjects(String subjects) {
        subjectsInput.setValue(subjects).pressEnter();

        return this;
    }

    public PracticeFormPage setHobbies(String hobbies) {
        hobbiesWrapperInput.$(byText(hobbies)).click();

        return this;
    }

    public PracticeFormPage setUploudPicture(String path) {
        File prtSC = new File(path);
        uploadPictureInput.uploadFile(prtSC);

        return this;
    }

    public PracticeFormPage setAddres(String addres) {
        currentAddressInput.setValue(addres);

        return this;
    }

    public PracticeFormPage setState(String state) {
        stateInput.click();
        $(byText(state)).click();

        return this;
    }

    public PracticeFormPage setCity(String city) {
        cityInput.click();
        $(byText(city)).click();

        return this;
    }

    public void clickSubmit() {
        submitInput.click();

    }

    public PracticeFormPage shouldHaveResults(String key, String value) {
        practicalFormResults.verifeResults(key, value);

        return this;
    }

}

