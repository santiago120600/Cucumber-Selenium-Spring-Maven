package com.mesaj.app.builders.data;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;

import java.io.File;

public class UserBuilder {
    private User user;

    private UserBuilder(){
        user = User.builder().build();
    }

    public static UserBuilder anUser(){
        return new UserBuilder();
    }

    public UserBuilder but(){
        return withDefaultInfo();
    }

    public  UserBuilder withoutAddress(){
        user.setAddress("");
        return this;
    }

    public UserBuilder withDefaultInfo(){
        File file = new File("src/test/resources/Img/277771456_1877504315771796_8801355044909146269_n.jpg");
        String absolutePath = file.getAbsolutePath();

        this.user = User.builder()
                .firstName("Santiago")
                .lastName("Arvizu")
                .address("Melchor Ocampo")
                .skills("C")
                .email("santiagodev12@gmail.com")
                .gender(Gender.female)
                .country("India")
                .birthDay("12")
                .birthMonth("July")
                .birthYear("2000")
                .phone("4428979798")
                .password("1234")
                .confirmPassword("1234")
                .uploadImgPath(absolutePath)
                .build();
        return this;
    }

    public User build(){
       return this.user;
    }

}
