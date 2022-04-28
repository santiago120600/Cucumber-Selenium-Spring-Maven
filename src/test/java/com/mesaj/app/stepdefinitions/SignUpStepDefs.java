package com.mesaj.app.stepdefinitions;

import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.pageObjects.SignUpService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    @Autowired
    private SignUpService signUp;

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {

        signUp.go("http://demo.automationtesting.in/Register.html");
        signUp.writeFirstName("Santiago");
        signUp.writeLastName("Arvizu");
        signUp.writeAddress("Melchor Ocampo");
        signUp.writeEmail("santiagodev12@gmail.com");
        signUp.writePhone("1234567890");
        signUp.selectGender("M");
        signUp.selectSkills("C");
        signUp.selectCountry("India");
        signUp.selectYear("2000");
        signUp.selectMonth("June");
        signUp.selectDay("12");
        signUp.writePassword("1234");
        signUp.writeConfirmPassword("1234");
        signUp.uploadImg("C:\\Users\\santi\\Pictures\\277253636_513647600208985_3208975158974945117_n.jpg");
        signUp.sleep(3);
        signUp.submit();
        signUp.sleep(3);

    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {
    }

    @Then("he should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {
    }
}
