package lambda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationValidation {
    public static boolean firstNameValidation(String firstName){

                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(firstName);
                boolean result=matcher.matches();

            return result;

        }
    public static boolean lastNameValidation(String lastName){

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result=matcher.matches();

        return result;

    }
    
    }
