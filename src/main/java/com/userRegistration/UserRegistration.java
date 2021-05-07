package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    private static Scanner sc = new Scanner(System.in);

    private static final void firstName(){

        String firstName = sc.nextLine();
        if(Pattern.matches("[A-Z]{1}[a-z]*", firstName)){
            System.out.println("Enter your last name");
        }else{
            System.out.println("Please enter first letter capital ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter your First name");
        firstName();
    }
}
