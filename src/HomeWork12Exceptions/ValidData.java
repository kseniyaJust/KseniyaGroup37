package HomeWork12Exceptions;

import HomeWork12Exceptions.CustomExceptions.WrongLoginException;
import HomeWork12Exceptions.CustomExceptions.WrongPasswordException;

public class ValidData {
    public static boolean checkValid(String login, String password, String confirmPassword){
        try {
            checkLogin(login);
            checkPassword(password,confirmPassword);
        }catch (WrongLoginException | WrongPasswordException e){
            return false;
        }
        return true;
    }
    private static void checkLogin(String login)throws WrongLoginException{
        if(!checkLengthSpaces(login)){
            throw new WrongLoginException();
        }
    }
    private static void checkPassword(String password, String confirmPassword) throws WrongPasswordException{
        if(!checkLengthSpaces(password) || !password.equals(confirmPassword)){
            throw new WrongPasswordException();
        }

    }
    private static boolean checkLengthSpaces(String data){
        return data.length() <= 20 && !data.contains(" ");
    }
}
