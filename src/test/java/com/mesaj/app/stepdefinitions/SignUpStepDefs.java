package com.mesaj.app.stepdefinitions;

import com.mesaj.app.pageObjects.SignUpPageObject;
import com.mesaj.app.pageObjects.SignUpService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefs {
    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        SignUpService signUpService = new SignUpService(driver);

        signUpService.go(driver, "http://demo.automationtesting.in/Register.html");
        signUpService.writeFirstName("Santiago");
        signUpService.writeLastName("Arvizu");
        signUpService.writeAddress("Melchor Ocampo");
        signUpService.writeEmail("santiagodev12@gmail.com");
        signUpService.writePhone("1234567890");
        signUpService.selectGender("M");
        signUpService.selectSkills("C");
        signUpService.selectCountry("India");
        signUpService.selectYear("2000");
        signUpService.selectMonth("June");
        signUpService.selectDay("12");
        signUpService.writePassword("1234");
        signUpService.writeConfirmPassword("1234");
        signUpService.uploadImg("C:\\Users\\santi\\Pictures\\277253636_513647600208985_3208975158974945117_n.jpg");
        signUpService.sleep(3);
        signUpService.submit();
        signUpService.sleep(3);
        driver.quit();

    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {
    }

    @Then("he should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {
    }
}
