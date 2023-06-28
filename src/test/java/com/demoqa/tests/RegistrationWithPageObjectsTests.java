package com.demoqa.tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegisrationPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjectsTests {

    RegisrationPage regisrationPage = new RegisrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
//        Configuration.browser = FIREFOX;
//       Configuration.browserVersion = "100.0";
        Configuration.holdBrowserOpen = true;
        Configuration.pageLoadTimeout = 50000;
    }

    @Test
    void successfulRegistrationTest() {
        String firstName = "Andrey",
                lastName = "Mozerov",
                userEmail = "andrey-mozerov@mail.ru";

        regisrationPage.openPage()
                        .SetFirstName(firstName)
                        .SetLastName(lastName)
                        .SetUserEmail(userEmail)
                        .SetGender("Male")
                        .SetPhone("1234567890");






        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("Some address 1");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text("andrey-mozerov@mail.ru"), text("1234567890"));
    }


    /*
     @Test
    void successfulRegistrationTest() {
        String firstName = "Andrey",
                lastName = "Mozerov",
                userEmail = "andrey-mozerov@mail.ru";

        regisrationPage.openPage();
        regisrationPage.SetFirstName(firstName);
        regisrationPage.SetLastName(lastName);
        regisrationPage.SetUserEmail(userEmail);
        regisrationPage.SetGender("Male");
        regisrationPage.SetPhone("1234567890");






        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("Some address 1");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text("andrey-mozerov@mail.ru"), text("1234567890"));
    }



     */
}


