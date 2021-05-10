package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Welcome to User Registration");
            System.out.println("Enter your First name");
            nameValidation(sc.nextLine());
            System.out.println("Enter your Last name");
            nameValidation(sc.nextLine());
            System.out.println("Enter your email address");
            emailValidation(sc.nextLine());
            System.out.println("Enter your mobile number");
            mobileNumberValidation(sc.nextLine());
            System.out.println("Enter password it must be one capital letter, one special character and one number");
            passwordValidation(sc.nextLine());
        }
    }

    public static boolean passwordValidation(String password) {
        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-d+=()])(?=\\S+$).{8,20}$",password)){
            System.out.println("valid");
            return true;
        }else {
            System.out.println("Entered password is invalid");
            return false;
        }
    }

    public static boolean mobileNumberValidation(String mobileNumber) {
        if(Pattern.matches("^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$", mobileNumber)){
            System.out.println("valid");
            return true;
        }else {
            System.out.println("please enter a valid number");
            return false;
        }
    }

    public static boolean emailValidation(String email) {
        if(Pattern.matches("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$", email)){
            System.out.println("valid");
            return true;
        }
        else {
            System.out.println("Please enter valid email address");
            return false;
        }
    }

    public static boolean nameValidation(String name){
        if(Pattern.matches("[A-Z][a-z]{3,}", name)){
            System.out.println("valid");
            return true;
        }else{
            System.out.println("Please enter first letter capital ");
            return false;
        }
    }

}
