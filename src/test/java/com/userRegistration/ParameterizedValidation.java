package com.userRegistration;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedValidation {

    public String email;
    public boolean expectedResult;
    public UserRegistration userRegistration;

    public ParameterizedValidation(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][] {
                { "xyz@yahoo.com", true },
                { "xyz-100@yahoo.com" , true },
                { "xyz.100@yahoo.com" , true },
                { "xyz111@abc.net" , true },
                { "xyz-100@abc.net" , true },
                { "xyz.100@abc.com.au" , true },
                { "xyz@1.com" , true },
                { "xyz@gmail.com.com" , true },
                { "xyz+100@gmail.com" , true },
                { "xyz" , false },
                { "xyz@.com.my" , false },
                { "xyz123@gmail.a" , false },
                { "xyz123@.com" , false },
                { "xyz123@.com.com" , false },
                { ".xyz@xyz.com" , false },
                { "xyz()*@gmail.com" , false },
                { "xyz@%*.com" , false },
                { "xyz..2002@gmail.com" , false },
                { "xyz.@gmail.com" , false },
                { "xyz@xyz@@gmail.com" , false },
                { "xyz@gmail.com.1a" , false },
                { "xyz@gmail.com.aa.au" , false }
        });
    }
        @Test
        public void checkEmailValidOrNot() throws UserRegistrationException {
            System.out.println("thia is expected result"+ this.expectedResult);
            Assertions.assertEquals(this.expectedResult, userRegistration.emailValidation(this.email));
        }

}
