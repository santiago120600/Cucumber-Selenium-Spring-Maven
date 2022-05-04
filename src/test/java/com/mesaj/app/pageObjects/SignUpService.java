package com.mesaj.app.pageObjects;

import com.mesaj.app.enums.Gender;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpService{

    @Autowired
    private WebDriver driver;

    @Autowired
    private SignUpPageObject signUpPageObject;

    public void go(String url) {
        this.driver.get(url);
    }

    public void writeFirstName(String firstName){
        this.signUpPageObject.getFirstNameTextbox().sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        this.signUpPageObject.getLastNameTextbox().sendKeys(lastName);
    }

    public void writeAddress(String address){
        this.signUpPageObject.getAddressTextbox().sendKeys(address);
    }

    public void writeEmail(String email){
        this.signUpPageObject.getEmailTextbox().sendKeys(email);
    }

    public void writePhone(String phone){
        this.signUpPageObject.getPhoneTextBox().sendKeys(phone);
    }

    public void selectGender(Gender gender){
        if(gender == Gender.male){
            signUpPageObject.getMaleRadioOptions().click();
        }else if(gender == Gender.female){
            signUpPageObject.getFemaleRadioOptions().click();
        }
    }

    public void selectSkills(String skills){
        new Select(this.signUpPageObject.getSkillsSelect()).selectByValue(skills);
    }

    public void selectCountry(String country){
        new Select(this.signUpPageObject.getCountrySelect()).selectByValue(country);
    }

    public void selectYear(String year){
        new Select(this.signUpPageObject.getYearSelect()).selectByValue(year);
    }

    public void selectMonth(String month){
        new Select(this.signUpPageObject.getMonthSelect()).selectByValue(month);
    }

    public void selectDay(String day){
        new Select(this.signUpPageObject.getDaySelect()).selectByValue(day);
    }

    public void writePassword(String password){
        this.signUpPageObject.getPasswordTextBox().sendKeys(password);
    }

    public void writeConfirmPassword(String password){
        this.signUpPageObject.getConfirmPasswordTextBox().sendKeys(password);
    }

    public void uploadImg(String imgPath){
        this.signUpPageObject.getUploadImg().sendKeys(imgPath);
    }

    public void submit(){
        this.signUpPageObject.getSubmitBtn().click();
    }
}
