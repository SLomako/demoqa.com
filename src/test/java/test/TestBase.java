package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920х1080";
        open("https://demoqa.com");
    }
}
