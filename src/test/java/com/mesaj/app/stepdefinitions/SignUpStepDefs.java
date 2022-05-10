package com.mesaj.app.stepdefinitions;

import com.mesaj.app.builders.data.UserBuilder;
import com.mesaj.app.conf.DriverConfig;
import com.mesaj.app.pageObjects.AuthenticationService;
import com.mesaj.app.pageObjects.CreateAccountService;
import com.mesaj.app.pageObjects.LandingPage;
import com.mesaj.app.pageObjects.LandingPageService;
import com.mesaj.app.tasks.NavigateTo;
import com.mesaj.app.tasks.UserSignUp;
import com.mesaj.app.util.driver.HelpFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {
    HelpFunctions help = new HelpFunctions();

    @Autowired
    private NavigateTo navigate;

    @Autowired
    private LandingPageService landingPageService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserSignUp signUp;

    @Autowired
    private CreateAccountService createAccountService;

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {
        navigate.signUpPage();
        landingPageService.clickSignInButton();
        authenticationService.writeEmail("pablito69@gmail.com");
        authenticationService.clickCreateAccountBtn();
    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account(){
        signUp.withInfo(UserBuilder.anUser().withDefaultInfo().build());
        //signUp.withInfo(UserBuilder.anUser().but().withoutAddress().build());
        //createAccountService.writeFirstName("Juan");
        help.sleep(8);
    }

    @Then("he should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {
    }
}
