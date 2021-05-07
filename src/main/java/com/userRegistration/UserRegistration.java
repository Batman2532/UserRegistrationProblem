package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        System.out.println("Welcome to User Registration");
        System.out.println("Enter your First name");
        name = sc.nextLine();
        nameValidation(name);
        System.out.println("Enter your Last name");
        name =sc.nextLine();
        nameValidation(name);
    }
    private static final void nameValidation(String name){
        if(Pattern.matches("[A-Z][a-z]{2,}", name)){
            System.out.println("valid");
        }else{
            System.out.println("Please enter first letter capital ");
        }
    }

}
