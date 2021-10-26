package lambda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    /*
     validate first name.
     */
    public static boolean firstNameValidation(String firstName) throws InvalidInputException {
        /*
        UserValidate is functionalInterface.
         */
        UserValidate<String> inputValidate = str -> {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            boolean result = matcher.matches();
            /*
            try catch() block for handle invalid input format
             */
            try {
                if (result != true) {
                    throw new InvalidInputException("entered first name is invalid format");
                }
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
            return result;
        };
        return inputValidate.validateInput(firstName);
    }


    /*
    validate last name using regex expression and handle exception
     */
    public static boolean lastNameValidation(String lastName) throws InvalidInputException {
        /*
        UserValidate is functionalInterface.
         */
        UserValidate<String> inputValidate = str -> {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            boolean result = matcher.matches();
            /*
              try catch() block for handle invalid input format
             */
            try {
                if (result != true) {
                    throw new InvalidInputException("entered last name is invalid format");
                }
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
            return result;
        };
        return inputValidate.validateInput(lastName);
    }


    /*
    email id validation and handle exception
     */
    public boolean emailValidation(String email) throws InvalidInputException {
        /*
        UserValidate is functionalInterface.
         */
        UserValidate<String> inputValidate = str -> {
            String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z0-9]+.(com|net)(.[a-z]{2,3}){0,1}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            boolean result = matcher.matches();
            /*
             try catch() block for handle invalid input format
             */
            try {
                if (result != true) {
                    throw new InvalidInputException("entered email id is invalid format");
                }
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
            return result;
        };
        return inputValidate.validateInput(email);
    }

    /*
    Mobile number validation and handle exception
     */
    public boolean mobileNumberValidation(String mobileNumber) throws InvalidInputException {
        /*
        UserValidate is functionalInterface.
         */
        UserValidate<String> inputValdation = str -> {
            String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            boolean result = matcher.matches();
            /*
             try catch() block for handle invalid input format
             */
            try {
                if (result != true) {
                    throw new InvalidInputException("entered mobile number is invalid format");
                }
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
            return result;
        };
        return inputValdation.validateInput(mobileNumber);
    }

    /*
    password validation and handle exception
     */
    public boolean passwordValidation(String password) throws InvalidInputException{
        /*
        UserValidate is functionalInterface.
         */
          UserValidate<String> inputValidate=str-> {
              String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
              Pattern pattern = Pattern.compile(regex);
              Matcher matcher = pattern.matcher(str);
              boolean result = matcher.matches();
              /*
                  try catch() block for handle invalid input format
             */
              try {
                  if (result != true) {
                      throw new InvalidInputException("entered password is invalid format");
                  }
              } catch (InvalidInputException e) {
                  System.out.println(e);
              }
              return result;
          };
          return inputValidate.validateInput(password);
    }
}