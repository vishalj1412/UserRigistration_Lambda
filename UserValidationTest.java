package lambda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.*;

public class UserValidationTest {
    @Test
    public void givenFirstNameValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();

        Assert.assertTrue(validation.firstNameValidation("Vishal"));
    }
    @Test
    public void givenlastNameValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();

        Assert.assertTrue(validation.lastNameValidation("Jagtap"));
    
   }
    /*
    test case for email id.
     */
    @Test
    public void givenEmailIdValidation() {
        UserRegistrationValidation emailvalidation = new UserRegistrationValidation();

        Assert.assertTrue(emailvalidation.emailValidation("mkgandhi007@gmail.com"));
    }
    /*
    test case for mobile number.
     */
    @Test
    public void givenMobileNumberValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();

        Assert.assertTrue(validation.mobileNumberValidation("+918882695710"));
    }
    }
