package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        System.out.println("Welcome to User Registration");
        System.out.println("Enter your First name");
        nameValidation(sc.nextLine());
        System.out.println("Enter your Last name");
        nameValidation(sc.nextLine());
        System.out.println("Enter your email adderss");
        emailValidation(sc.nextLine());
    }

    private static void emailValidation(String email) {
        if(Pattern.matches("^[A-Za-z0-9_][A-Za-z0-9_]*[@]{1}[a-z]+[.]{1}[a-z]{2,6}$", email)){
            System.out.println("valid");
        }
        else {
            System.out.println("Please enter valid email address");
        }
    }

    private static final void nameValidation(String name){
        if(Pattern.matches("[A-Z][a-z]{2,}", name)){
            System.out.println("valid");
        }else{
            System.out.println("Please enter first letter capital ");
        }
    }

}
