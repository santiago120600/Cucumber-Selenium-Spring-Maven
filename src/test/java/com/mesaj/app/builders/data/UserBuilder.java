package com.mesaj.app.builders.data;

import com.mesaj.app.enums.Gender;
import com.mesaj.app.models.User;

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
        this.user = User.builder()
                .firstName("Santiago")
                .lastName("Arvizu")
                .address("Melchor Ocampo")
                .gender(Gender.female)
                .country(1)
                .birthDay("12")
                .birthMonth(1)
                .birthYear("2000")
                .phone("4428979798")
                .password("12345678")
                .zipCode("76220")
                .state(1)
                .city("massachusetts")
                .build();
        return this;
    }

    public User build(){
       return this.user;
    }

}
