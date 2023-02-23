import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920х1080";
    }

    @Test
    void fillStudentRegistrationForm() {
        open("https://demoqa.com/automation-practice-form");
        File prtSC = new File("src/test/resources/pictures/prt_sc.png");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Sergei");
        $("#lastName").setValue("Lomako");
        $("#userEmail").setValue("lomakosv@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
        $("#dateOfBirthInput").sendKeys(Keys.SPACE);
        $("#dateOfBirthInput").sendKeys(Keys.LEFT);
        $("#dateOfBirthInput").setValue("11.16.1986").pressEnter();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(prtSC);
        $("#currentAddress").setValue("null");
        $("#state").click();
        $(byText("NCR")).click();
        $("#city").click();
        $(byText("Delhi")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Sergei")).shouldHave(text("Lomako")).
                shouldHave(text("lomakosv@gmail.com")).shouldHave(text("Male")).shouldHave(text("16 November,1986")).
                shouldHave(text("English")).shouldHave(text("Sports")).shouldHave(text("Music")).
                shouldHave(text("prt_sc.png")).shouldHave(text("null")).shouldHave(text("NCR")).shouldHave(text("Delhi"));
    }
}
