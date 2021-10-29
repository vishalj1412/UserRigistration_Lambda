package lambda;
@FunctionalInterface
/*
create functional interface.
*/
public interface UserValidate<T>{
    public boolean validateInput(T param);
}
