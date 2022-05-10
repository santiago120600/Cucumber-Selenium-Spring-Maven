package com.mesaj.app.pageObjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AuthenticationPage extends BasePage{

    @Autowired
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="email_create")
    private WebElement emailInput;

    @FindBy(id="SubmitCreate")
    private WebElement createAccountBtn;
}
