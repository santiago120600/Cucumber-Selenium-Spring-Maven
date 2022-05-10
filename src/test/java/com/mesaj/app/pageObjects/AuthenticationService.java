package com.mesaj.app.pageObjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

    @Autowired
    private WebDriver driver;

    @Autowired
    private AuthenticationPage authenticationPage;

    public void writeEmail(String email){
        authenticationPage.getEmailInput().sendKeys(email);
    }

    public void clickCreateAccountBtn(){
        authenticationPage.getCreateAccountBtn().click();
    }
}
