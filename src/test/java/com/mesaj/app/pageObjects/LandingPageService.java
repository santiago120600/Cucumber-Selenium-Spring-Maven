package com.mesaj.app.pageObjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LandingPageService {

    @Autowired
    private WebDriver driver;

    @Autowired
    private LandingPage landingPage;

    public void clickSignInButton(){
        this.landingPage.getSigninBtn().click();
    }
}
