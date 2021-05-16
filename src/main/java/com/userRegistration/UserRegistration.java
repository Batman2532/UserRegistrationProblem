package com.userRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface  validateUser {
        boolean validate(String pattern, String userDetails);
}

public class UserRegistration {
    private static Scanner sc = new Scanner(System.in);
    public static boolean resultValue;
    public static final String NAMEPATTERN = "[A-Z][a-z]{3,}";
    public static final String LASTNAMEPATTERN = "[A-Z][a-z]{3,}";
    public static final String EMAILPATTERN = "^abc[a-zA-Z0-9.+-]*@[a-z]*[.][a-z]{2,5}[.,a-z]{0,5}";
    public static final String PHONEPATTERN = "^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$";
    public static final String PASSWORDPATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-d+=()])(?=\\S+$).{8,20}$";

    public static void main(String[] args) throws UserRegistrationException {
        validateUser validator = (String userInput, String pattern) ->  Pattern.matches( pattern,userInput);
        try {
            System.out.println("Welcome to User Registration");
            System.out.println("Enter your First name");
            System.out.println("Valid Details " + validator.validate(sc.next(), NAMEPATTERN));
            System.out.println("Enter your Last name");
            System.out.println("Valid Details " + validator.validate(sc.next(), NAMEPATTERN));
            System.out.println("Enter your email address");
            System.out.println("Valid Details " + validator.validate(sc.next(), EMAILPATTERN));
            System.out.println("Enter your mobile number");
            System.out.println("Valid Details " + validator.validate(sc.next(), PHONEPATTERN));
            System.out.println("Enter password it must be one capital letter, one special character and one number");
            System.out.println("Valid Details " + validator.validate(sc.next(), PASSWORDPATTERN));
        }catch (UserRegistrationException)
        {

        }
        }
    }





