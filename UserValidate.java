package lambda;
@FunctionalInterface
public interface UserValidate<T>{
    public boolean validateInput(T param);
}
