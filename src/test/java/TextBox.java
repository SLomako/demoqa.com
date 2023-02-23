
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class privet {
    @Test
    void textBoxTest() {

        open("https://demoqa.com/text-box");
        $("[Id=userName]").setValue("Sergei Lomako");
        $("[Id=userEmail]").setValue("lomakosv@gmail.com");
        $("[Id=currentAddress]").setValue("null");
        $("[Id=permanentAddress]").setValue("null");
        $("[Id=submit]").scrollIntoView(true);
        $("[Id=submit]").click();
        $("[Id=output]").shouldHave(text("Lomako"), text("@"));
        sleep(5000);
    }
}
