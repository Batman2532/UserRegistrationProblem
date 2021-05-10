package com.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validateFirstName(){
        boolean testString1 = userRegistration.nameValidation("Akio");
        boolean testString2 = userRegistration.nameValidation("Sung");
        boolean testString3 = userRegistration.nameValidation("Karan");
        boolean testString4 = userRegistration.nameValidation("Akshay");
        boolean testString5 = userRegistration.nameValidation("Francesco");

        Assertions.assertTrue(testString1);
        Assertions.assertTrue(testString2);
        Assertions.assertTrue(testString3);
        Assertions.assertTrue(testString4);
        Assertions.assertTrue(testString5);
    }

    @Test
    public void validateLastName(){
        boolean testString1 = userRegistration.nameValidation("Takahashi");
        boolean testString2 = userRegistration.nameValidation("Mule");
        boolean testString3 = userRegistration.nameValidation("Chavan");
        boolean testString4 = userRegistration.nameValidation("Talankar");
        boolean testString5 = userRegistration.nameValidation("Fierre");

        Assertions.assertTrue(testString1);
        Assertions.assertTrue(testString2);
        Assertions.assertTrue(testString3);
        Assertions.assertTrue(testString4);
        Assertions.assertTrue(testString5);
    }

    @Test
    public void validateEmail(){
        boolean testString1 = userRegistration.emailValidation("abc-100.hello@gmail.com.au");
        boolean testString2 = userRegistration.emailValidation("smulye10@gmail.com");
        boolean testString3 = userRegistration.emailValidation("somethingFreaky33@yopmail.com");
        boolean testString4 = userRegistration.emailValidation("HeaveN63_44.gg@navi.gg");
        boolean testString5 = userRegistration.emailValidation("7655_Hellokitty@businness.net");

        Assertions.assertTrue(testString1);
        Assertions.assertTrue(testString2);
        Assertions.assertTrue(testString3);
        Assertions.assertTrue(testString4);
        Assertions.assertTrue(testString5);
    }

    @Test
    public void validatePhoneNo(){
        boolean testString1 = userRegistration.mobileNumberValidation("91 8888674433");
        boolean testString2 = userRegistration.mobileNumberValidation("117 9898334455");
        boolean testString3 = userRegistration.mobileNumberValidation("1 9139818877");
        boolean testString4 = userRegistration.mobileNumberValidation("73 7788996655d");
        boolean testString5 = userRegistration.mobileNumberValidation("991 7878675644");

        Assertions.assertTrue(testString1);
        Assertions.assertTrue(testString2);
        Assertions.assertTrue(testString3);
        Assertions.assertFalse(testString4);
        Assertions.assertTrue(testString5);
    }

    @Test
    public void validatePassword(){
        boolean testString1 = userRegistration.passwordValidation("Saitan@666");
        boolean testString2 = userRegistration.passwordValidation("Ghost_$564");
        boolean testString3 = userRegistration.passwordValidation("SabrentK*445");
        boolean testString4 = userRegistration.passwordValidation("786@IamLucky");
        boolean testString5 = userRegistration.passwordValidation("DramOf11YearoldKid$");

        Assertions.assertTrue(testString1);
        Assertions.assertTrue(testString2);
        Assertions.assertTrue(testString3);
        Assertions.assertTrue(testString4);
        Assertions.assertTrue(testString5);
    }
}
