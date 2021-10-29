package lambda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    /*
     validate first name using regex expression and handle exception
     */
    public static boolean firstNameValidation(String firstName) throws InvalidInputException {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
 try {
    if (result != true) {
        throw new InvalidInputException("entered first name is invalid format");
    }
}
        catch(InvalidInputException e){
        System.out.println(e);
    }
        return result;
    }

    /*
    validate last name using regex expression and handle exception
     */
    public static boolean lastNameValidation(String lastName) throws InvalidInputException{

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        try {
            if (result != true) {
                throw new InvalidInputException("entered last name is invalid format");
            }
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        return result;
    }

    /*
    email id validation and handle exception
     */
    public boolean emailValidation(String email) throws InvalidInputException{

        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+.(com|net)(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        try {
            if (result != true) {
                throw new InvalidInputException("entered email id is invalid format");
            }
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        return result;
    }

    /*
    Mobile number validation and handle exception
     */
    public boolean mobileNumberValidation(String mobileNumber) throws InvalidInputException {

        String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result = matcher.matches();
        try {
            if (result != true) {
                throw new InvalidInputException("entered mobile number is invalid format");
            }
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        return result;
    }

    /*
    password validation and handle exception
     */
    public boolean passwordValidation(String password) throws InvalidInputException{

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        try {
            if (result != true) {
                throw new InvalidInputException("entered password is invalid format");
            }
        }
        catch(InvalidInputException e){
            System.out.println(e);
        }
        return result;
    }
}
