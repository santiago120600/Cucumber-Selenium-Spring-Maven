package com.mesaj.app.stepdefinitions;

import com.mesaj.app.pageObjects.SignUpPageObject;
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

        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);
        signUpPageObject.go(driver, "http://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Santiago");
        signUpPageObject.writeLastName("Arvizu");
        signUpPageObject.writeAddress("Melchor Ocampo");
        signUpPageObject.writeEmail("santiagodev12@gmail.com");
        signUpPageObject.writePhone("1234567890");
        signUpPageObject.selectGender("M");
        signUpPageObject.selectSkills("C");
        signUpPageObject.selectCountry("India");
        signUpPageObject.selectYear("2000");
        signUpPageObject.selectMonth("June");
        signUpPageObject.selectDay("12");
        signUpPageObject.writePassword("1234");
        signUpPageObject.writeConfirmPassword("1234");
        signUpPageObject.uploadImg("C:\\Users\\santi\\Pictures\\277253636_513647600208985_3208975158974945117_n.jpg");
        signUpPageObject.sleep(3);
        signUpPageObject.submit();
        signUpPageObject.sleep(3);
        driver.quit();

    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {
    }

    @Then("he should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {
    }
}
