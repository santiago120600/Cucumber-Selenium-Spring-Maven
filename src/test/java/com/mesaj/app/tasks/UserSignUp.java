package com.mesaj.app.tasks;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;
import com.mesaj.app.pageObjects.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSignUp {
    @Autowired
    private SignUpService signUp;

    public void withInfo(User user){
        signUp.writeFirstName(user.getFirstName());
        signUp.writeLastName(user.getLastName());
        signUp.writeAddress(user.getAddress());
        signUp.writeEmail(user.getEmail());
        signUp.writePhone(user.getPhone());
        if (user.getGender()== Gender.female){
            signUp.selectGender("F");
        }else{
            signUp.selectGender("M");
        }
        signUp.selectSkills(user.getSkills());
        signUp.selectCountry(user.getCountry());
        signUp.selectYear(user.getBirthYear());
        signUp.selectMonth(user.getBirthMonth());
        signUp.selectDay(user.getBirthDay());
        signUp.writePassword(user.getPassword());
        signUp.writeConfirmPassword(user.getConfirmPassword());
        signUp.uploadImg(user.getUploadImgPath());
        signUp.submit();
    }
}
