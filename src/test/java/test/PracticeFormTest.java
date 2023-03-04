package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.PracticeFormPage;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest {
    PracticeFormPage PracticeFormPage = new PracticeFormPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920х1080";
    }

    @Test
    void fillStudentRegistrationForm() {

        PracticeFormPage.openPage().setFirstName("Sergei").setLastName("Lomako")
                .setEmail("lomakosv@gmail.com").setGenter("Male").setNumberPhone("0123456789")
                .setSubjects("English").setDateOfBirth("11.16.1986").setHobbies("Sports")
                .setHobbies("Music").setUploudPicture("src/test/resources/pictures/prt_sc.png")
                .setAddresStateCity("null", "NCR", "Delhi");

        $("#submit").click();

        $(".table-responsive").shouldHave(text("Sergei")).shouldHave(text("Lomako")).
                shouldHave(text("lomakosv@gmail.com")).shouldHave(text("Male")).shouldHave(text("16 November,1986")).
                shouldHave(text("English")).shouldHave(text("Sports")).shouldHave(text("Music")).
                shouldHave(text("prt_sc.png")).shouldHave(text("null")).shouldHave(text("NCR")).shouldHave(text("Delhi"));
    }
}
