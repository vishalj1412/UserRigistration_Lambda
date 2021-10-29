package lambda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    /*
     validate first name using regex expression

     */
    public static boolean firstNameValidation(String firstName){

                String regex = "^[A-Z]{1}[a-z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(firstName);
                boolean result=matcher.matches();

            return result;
        }
        /*
        validate last name using regex expression
         */
    public static boolean lastNameValidation(String lastName){

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean lastNameresult=matcher.matches();

        return lastNameresult;

    }
    /*
    email id validation
     */
    public boolean emailValidation(String email){

        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+.(com|net)(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result=matcher.matches();

        return result;

    }
    /*
    Mobile number validation
     */
    public boolean mobileNumberValidation(String mobileNumber){

        String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result=matcher.matches();

        return result;

    }
    }
