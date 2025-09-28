package HomeWork12Exceptions.CustomExceptions;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(){
        System.out.println("Oops! Your password is weird");
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}
