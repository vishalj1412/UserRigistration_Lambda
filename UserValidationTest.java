package lambda;

import org.junit.Assert;
import org.junit.jupiter.api.*;

public class UserValidationTest {
    
    /*
    test case for first name.
     */
    @Test
    public void givenFirstNameValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
try {
    Assert.assertTrue(validation.firstNameValidation("Vishal"));
}catch (InvalidInputException e){

}
    }
    /*
    test case for lst name
     */
    @Test
    public void givenlastNameValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        try {
            Assert.assertTrue(validation.lastNameValidation("Jagtap"));

        } catch (InvalidInputException e) {
        }
    }
    /*
    test case for email id.
     */
    @Test
    public void givenEmailIdValidation() {
        UserRegistrationValidation emailvalidation = new UserRegistrationValidation();
        try {
            Assert.assertTrue(emailvalidation.emailValidation("mkgandhi007@gmail.com"));
        } catch (InvalidInputException e) {

        }
    }
    /*
    test case for mobile number.
     */
    @Test
    public void givenMobileNumberValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
try{
        Assert.assertTrue(validation.mobileNumberValidation("+918882695710"));
    }catch (InvalidInputException e) {

}
    }
    /*
    test case for password
     */
    @Test
    public void givenPasswordValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        try {
            Assert.assertTrue(validation.passwordValidation("qw1rt@Ms"));
        }catch (InvalidInputException e) {

        }
        }
    }
