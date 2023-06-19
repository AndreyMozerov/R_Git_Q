package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl="https://demoqa.com";
        Configuration.browserSize="1920x1080";
        Configuration.holdBrowserOpen=true;
    }

    @Test
    void successfulRegistrationTests(){
        String firstName="Andrey";
        String lastName="Mozerov";



        open("/automation-practice-form");

        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);

        $("#userEmail").setValue("andreymoz@mail.ru");
        $("#userNumber").setValue("1234567890");
        $("#currentAddress").setValue("Moscow");

        $("#submit").click();

        $("#output").shouldHave(text("Andrey Mozerov"), text("andreymoz@mail.ru"),
                text("Moscow"), text("Vladimir street"));


    }
}
