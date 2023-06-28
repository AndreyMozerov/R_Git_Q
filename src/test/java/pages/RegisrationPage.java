package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegisrationPage {

    private final String TITLE_TEXT = "Student Registration Form";
private SelenideElement
        firstNameInput = $("#firstName"),
        lastNameInput = $("#lastName"),
        userEmailInput = $("#userEmail");

    public  RegisrationPage openPage(){

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegisrationPage SetFirstName(String value){

        firstNameInput.setValue(value);
        return this;
    }
    public RegisrationPage SetLastName(String value){

        lastNameInput.setValue(value);
        return this;
    }
    public RegisrationPage SetUserEmail(String value){

        userEmailInput.setValue(value);
        return this;
    }
    public RegisrationPage SetGender(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }
    public RegisrationPage SetPhone(String value){

        $("#userNumber").setValue(value);
        return this;
    }


}
