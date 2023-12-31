import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class TestBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl="https://demoqa.com";
    }

    @Test
    void fillFormTests(){
       open("/text-box");
        $("#=userName").setValue("Andrey Mozerov");
        $("#=userEmail").setValue("andreymoz@mail.ru");
        $("#=currentAddress").setValue("Moscow");
        $("#=permanentAddress").setValue("Vladimir street");
        $("#submit").click();

        $("#output").shouldHave(text("Andrey Mozerov"), text("andreymoz@mail.ru"),
                text("Moscow"), text("Vladimir street"));


    }
}
