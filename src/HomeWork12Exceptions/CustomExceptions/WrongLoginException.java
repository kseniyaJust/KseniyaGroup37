package HomeWork12Exceptions.CustomExceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        System.out.println("Login is wrong");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
