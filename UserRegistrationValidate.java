package lambda;
@FunctionalInterface
public interface UserRegistrationValidate<T> {

        boolean validate(T param);
    }

