package com.mesaj.app.tasks;

import com.mesaj.app.models.User;
import com.mesaj.app.pageObjects.CreateAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {
    @Autowired
    private CreateAccountService signUp;

    public void withInfo(User user){
        signUp.writeFirstName(user.getFirstName());
        signUp.writeLastName(user.getLastName());
        signUp.writeAddress(user.getAddress());
        signUp.writePhone(user.getPhone());
        signUp.selectYear(user.getBirthYear());
        signUp.selectMonthByIndex(user.getBirthMonth());
        signUp.selectDay(user.getBirthDay());
        signUp.writePassword(user.getPassword());
        signUp.writeCity(user.getCity());
        signUp.selectCountryByIndex(user.getCountry());
        signUp.selectStateById(user.getState());
        signUp.writeZipCode(user.getZipCode());
        signUp.submit();
    }
}
