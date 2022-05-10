package com.mesaj.app.pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CreateAccountPage extends BasePage{

    @Autowired
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="customer_firstname")
    private WebElement firstNameInput;

    @FindBy(id="customer_lastname")
    private WebElement lastNameInput;

    @FindBy(id="passwd")
    private WebElement passwordInput;

    @FindBy(id = "phone_mobile")
    private WebElement phoneInput;

    @FindBy(id = "postcode")
    private WebElement zipInput;

    @FindBy(id = "address1")
    private WebElement addressInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "id_state")
    private WebElement stateInput;

    @FindBy(id = "submitAccount")
    private WebElement registerBtn;

    @FindBy(id = "id_country")
    private WebElement countrySelect;

    @FindBy(id ="days")
    private WebElement daySelect;

    @FindBy(id ="months")
    private WebElement monthSelect;

    @FindBy(id ="years")
    private WebElement yearSelect;
}
