package com.mesaj.app.models;

import com.mesaj.app.enums.Gender;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private Gender gender;
    private int country;
    private String birthDay;
    private int birthMonth;
    private String birtMonth;
    private String birthYear;
    private String phone;
    private String password;
    private String confirmPassword;
    private String zipCode;
    private int state;
    private String city;
}
