import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class TextBox {
    @Test
    void textBoxTest() {

        open("https://demoqa.com/text-box");
        $("[Id=userName]").setValue("Sergei Lomako");
        sleep(5000);
    }
}
