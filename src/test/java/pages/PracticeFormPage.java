package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import test.TestData;
import java.io.File;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

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


    CalendarComponent calendarComponent = new CalendarComponent();

    public PracticeFormPage openPage() {
        $x("//div[@class='card-body']/h5[text()='Forms']").click();
        $x("//span[@class='text'][text()='Practice Form']").click();


        return this;
    }

    public PracticeFormPage removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public PracticeFormPage setFirstName() {
        firstNameInput.setValue(TestData.firstNameFaker);


        return this;
    }

    public PracticeFormPage setLastName() {
        lastNameInput.setValue(TestData.lastNameFaker);

        return this;
    }

    public PracticeFormPage setEmail() {
        userEmailInput.setValue(TestData.emailFaker);

        return this;
    }

    public PracticeFormPage setGender(String genter) {
        genderWrapperInput.$(byText(genter)).click();

        return this;
    }

    public PracticeFormPage setNumberPhone() {
        userNumberPhoneInput.setValue(TestData.numberPhoneFaker);

        return this;
    }
    public PracticeFormPage setDateOfBirth() {
        calendarComponent.setDate(TestData.randomDateCalendar.dateA);

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

    public PracticeFormPage setAddress() {
        currentAddressInput.setValue(TestData.addressFaker);

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

}

