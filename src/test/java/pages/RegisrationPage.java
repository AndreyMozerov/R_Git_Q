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

    public  void openPage(){

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    public void SetFirstName(String value){
        firstNameInput.setValue(value);
    }
    public void SetLastName(String value){
        lastNameInput.setValue(value);
    }
    public void SetUserEmail(String value){
        userEmailInput.setValue(value);
    }
    public void SetGender(String value){
        $("#genterWrapper").$(byText(value)).click();
    }
    public void SetPhone(String value){
        $("#userNumber").setValue(value);
    }


}
