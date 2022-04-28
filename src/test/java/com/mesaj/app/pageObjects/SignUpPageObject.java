package com.mesaj.app.pageObjects;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPageObject extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;

    public SignUpPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@ng-model='FirstName']")
    private WebElement firstNameTextbox;

    @FindBy(xpath = "//input[@ng-model='LastName']")
    private WebElement lastNameTextbox;

    @FindBy(xpath = "//textarea")
    private WebElement addressTextbox;

    @FindBy(xpath = "//input[@ng-model='EmailAdress']")
    private WebElement emailTextbox;

    @FindBy(xpath = "//input[@ng-model='Phone']")
    private WebElement phoneTextBox;

    @FindBy(xpath = "//input[@name='radiooptions' and @value='Male']")
    private WebElement maleRadioOptions;

    @FindBy(xpath = "//input[@name='radiooptions' and @value='FeMale']")
    private WebElement femaleRadioOptions;

    @FindBy(xpath = "//input[@id='checkbox1']")
    private WebElement hobbiesCheckBox1;

    @FindBy(xpath = "//input[@id='checkbox2']")
    private WebElement hobbiesCheckBox2;

    @FindBy(xpath = "//input[@id='checkbox3']")
    private WebElement hobbiesCheckBox3;

    @FindBy(xpath = "//input[@id='msdd']")
    private WebElement languagesMultiSelect;

    @FindBy(xpath = "//select[@ng-model='Skill']")
    private WebElement skillsSelect;

    @FindBy(xpath = "//select[@id='countries']")
    private WebElement countriesSelect;

    @FindBy(xpath = "//select[@id='country']")
    private WebElement countrySelect;

    @FindBy(xpath = "//select[@id='yearbox']")
    private WebElement yearSelect;

    @FindBy(xpath = "//select[@ng-model='monthbox']")
    private WebElement monthSelect;

    @FindBy(xpath = "//select[@id='daybox']")
    private WebElement daySelect;

    @FindBy(xpath = "//input[@id='firstpassword']")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='secondpassword']")
    private WebElement confirmPasswordTextBox;

    @FindBy(xpath = "//button[@id='submitbtn']")
    private WebElement submitBtn;

    @FindBy(xpath = "//input[@id='imagesrc']")
    private WebElement uploadImg;

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

}
