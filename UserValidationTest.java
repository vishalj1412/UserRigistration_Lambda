package lambda;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    public void givenFirstNameValidation() {
        UserRegistrationValidation validation = new UserRegistrationValidation();
        ;
        Assert.assertTrue(validation.firstNameValidation("Vishal"));
    }
    }