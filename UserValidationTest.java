package lambda;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_Validation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.firstNameValidation("");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void giveLastName_Validation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.lastNameValidation("Kumar");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenEmail_Validation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.emailValidation("mkaubr007@gmail.com");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception);
        }
    }

    @Test
    public void givenPhoneNumber_Validation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.phoneNumberValidation("+918002695700");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenPassword_Validation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        boolean actualResult = true;
        try {
            actualResult = validation.passwordValidation("qw1rt@Ms");
        } catch (UserValidationException exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }
}