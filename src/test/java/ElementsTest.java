import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class ElementsTest{

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/");
        $x("//div[@class='card-body']").click();
    }

    @Test
    void textBox() {

        $("#item-0").click();
        $("#userName").setValue("Sergei Lomako");
        $("#userEmail").setValue("lomakosv@gmail.com");
        $("#currentAddress").setValue("null");
        $("#permanentAddress").setValue("null");
        $("#submit").click();
        $("#output").shouldHave(text("Lomako"), text("@"));
    }

    @Test
    void checkBox() {

        $("#item-1").click();
        $(".rct-checkbox").click();
        $("#result").shouldHave(text("home"));
    }

    @Test
    void radioButton() {

        $("#item-2").click();
        $("[for=yesRadio]").click();
        $(".text-success").shouldHave(text("Yes"));
        $("[for=impressiveRadio]").click();
        $(".text-success").shouldHave(text("Impressive"));
    }

    @Test
    void webTables() {

        $("#item-3").click();
        $("#searchBox").setValue("Lomako");
        $(".rt-tbody").shouldNotHave(text("Lomako"));
        $("#addNewRecordButton").click();
        $("#firstName").setValue("Sergei");
        $("#lastName").setValue("Lomako");
        $("#userEmail").setValue("lomakosv@gmail.com");
        $("#age").setValue("36");
        $("#salary").setValue("0");
        $("#department").setValue("null");
        $("#submit").click();
        $("#searchBox").setValue("Lomako");
        $(".rt-tbody").shouldHave(text("Lomako"));
    }

    @Test
    void button() {
        $("#item-4").click();
        $("#doubleClickBtn").doubleClick();
        $("#doubleClickMessage").shouldHave(text("double"));
        $("#rightClickBtn").contextClick();
        $("#rightClickMessage").shouldHave(text("right"));
        $x("//button[text()='Click Me']").click();
        $("#dynamicClickMessage").shouldHave(text("dynamic"));

    }

    @Test
    void linksTest() {
        $x("//span[text()='Links']").click();
        $x("//a[@id='simpleLink']").click();

        //$x("//a[@id='dynamicLink']").click();
        SelenideElement sE = $x("//a[@href='https://demoqa.com']");
        System.out.println(sE);

        sleep(4000);

    }

    @Test
    void linksTest1() {
        $x("//span[text()='Links']").click();
        $x("//a[@id='created']").click();
    }
}

