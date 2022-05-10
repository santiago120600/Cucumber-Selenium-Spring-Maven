package com.mesaj.app.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountService {

    @Autowired
    private WebDriver driver;

    @Autowired
    private CreateAccountPage createAccountPage;

    @Autowired
    WebDriverWait wait;

    public void writeFirstName(String firstName){
        this.wait.until(ExpectedConditions.visibilityOf(this.createAccountPage.getFirstNameInput()));
        this.createAccountPage.getFirstNameInput().sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        this.createAccountPage.getLastNameInput().sendKeys(lastName);
    }

    public void writeAddress(String address){
        this.createAccountPage.getAddressInput().sendKeys(address);
    }

    public void writePhone(String phone){
        this.createAccountPage.getPhoneInput().sendKeys(phone);
    }

    public void selectCountry(String country){
        new Select(this.createAccountPage.getCountrySelect()).selectByValue(country);
    }

    public void selectCountryByIndex(int index){
        new Select(this.createAccountPage.getYearSelect()).selectByIndex(index);
    }


    public void selectYear(String year){
        new Select(this.createAccountPage.getYearSelect()).selectByValue(year);
    }

    public void selectMonth(String month){
        new Select(this.createAccountPage.getMonthSelect()).selectByValue(month);
    }

    public void selectMonthByIndex(int index){
        new Select(this.createAccountPage.getMonthSelect()).selectByIndex(index);
    }

    public void selectDay(String day){
        new Select(this.createAccountPage.getDaySelect()).selectByValue(day);
    }

    public void writePassword(String password){
        this.createAccountPage.getPasswordInput().sendKeys(password);
    }

    public void submit(){
        this.createAccountPage.getRegisterBtn().click();
    }
}
