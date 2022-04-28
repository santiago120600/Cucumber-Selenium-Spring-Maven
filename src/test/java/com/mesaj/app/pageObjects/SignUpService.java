package com.mesaj.app.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpService {

    private WebDriver driver;

    private SignUpPageObject signUpPageObject;

    public SignUpService(WebDriver driver) {
        this.driver = driver;
        signUpPageObject = new SignUpPageObject(driver);
    }
    /*
    public void writeFirstName(String firstName){
        this.firstNameTextbox.sendKeys(firstName);
    }

    public void writeLastName(String lastName){
        this.lastNameTextbox.sendKeys(lastName);
    }

    public void writeAddress(String address){
        this.addressTextbox.sendKeys(address);
    }

    public void writeEmail(String email){
        this.emailTextbox.sendKeys(email);
    }

    public void writePhone(String phone){
        this.phoneTextBox.sendKeys(phone);
    }

    public void selectGender(String gender){
        if(gender.equals("M")){
            maleRadioOptions.click();
        }else if(gender.equals("F")){
            femaleRadioOptions.click();
        }
    }

    public void selectSkills(String skills){
        new Select(this.skillsSelect).selectByValue(skills);
    }

    public void selectCountry(String country){
        new Select(this.countrySelect).selectByValue(country);
    }

    public void selectYear(String year){
        new Select(this.yearSelect).selectByValue(year);
    }

    public void selectMonth(String month){
        new Select(this.monthSelect).selectByValue(month);
    }

    public void selectDay(String day){
        new Select(this.daySelect).selectByValue(day);
    }

    public void writePassword(String password){
        this.passwordTextBox.sendKeys(password);
    }

    public void writeConfirmPassword(String password){
        this.confirmPasswordTextBox.sendKeys(password);
    }

    public void uploadImg(String imgPath){
        this.uploadImg.sendKeys(imgPath);
    }

    public void submit(){
        this.submitBtn.click();
    }
    */
}
