package com.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstName(){
        try {
           userRegistration.nameValidation("Saurabh");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void validateLastName(){
        try {
            userRegistration.nameValidation("Charjan");
        }catch(UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void validateEmail(){
        try {
            userRegistration.emailValidation("charjan44@gmail.com");
        }catch(UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void validatePhoneNo(){
        try {
            userRegistration.mobileNumberValidation("91 1234567890");
        }catch(UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void validatePassword(){
        try {
            userRegistration.passwordValidation("Batman@5537");
        }catch(UserRegistrationException e){
            e.printStackTrace();
        }

    }
}
