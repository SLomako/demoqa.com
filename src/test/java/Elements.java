
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class Elements {


    @BeforeAll
    static void beforeAll() {

        open("https://demoqa.com/");
        $("[viewBox='0 0 448 512']").scrollIntoView(true);
        $("[viewBox='0 0 448 512']").click();
    }
    @Test
    void textBoxTest() {


        $("[id=item-0]").click();
        $("[Id=userName]").setValue("Sergei Lomako");
        $("[Id=userEmail]").setValue("lomakosv@gmail.com");
        $("[Id=currentAddress]").setValue("null");
        $("[Id=permanentAddress]").setValue("null");
        $("[Id=submit]").scrollIntoView(true);
        $("[Id=submit]").click();
        $("[Id=output]").shouldHave(text("Lomako"), text("@"));
    }

    @Test
    void checkBoxTest() {


        $("[id=item-1]").click();
        $("[class=rct-checkbox]").click();
        $("[class='display-result mt-4']").shouldHave(text("home"));

    }

    @Test
    void radioButtonTest() {


        $("[id=item-2]").click();
        $("[for=yesRadio]").click();
        $("[class='text-success']").shouldHave(text("Yes"));
        $("[for=impressiveRadio]").click();
        $("[class='text-success']").shouldHave(text("Impressive"));

    }

    @Test
    void webTables() {

        String lastname = "Lomako";

        $("[id=item-3]").click();
        $("#addNewRecordButton").click();
        $("#firstName").setValue("Sergei");
        $("#lastName").setValue(lastname);
        $("#userEmail").setValue("lomakosv@gmail.com");
        $("#age").setValue("36");
        $("#salary").setValue("0");
        $("#department").setValue("null");
        $("#submit").click();
        $("#searchBox").setValue(lastname);
        $("[class=rt-tbody]").shouldHave(text("Lomako"));



    }

    @Test
    void button() {
        $("#item-4").click();
        $("#doubleClickBtn").doubleClick();
        $("#doubleClickMessage").shouldHave(text("double"));
        $("#rightClickBtn").contextClick();
        $("#rightClickMessage").shouldHave(text("right"));
        $("#rightClickBtn").closest(".mt-4").sibling(0).$(byText("Click Me")).click();
        $("#dynamicClickMessage").shouldHave(text("dynamic"));


//<button id="eRH8o" type="button" class="btn btn-primary">Click Me</button>




    }
}
