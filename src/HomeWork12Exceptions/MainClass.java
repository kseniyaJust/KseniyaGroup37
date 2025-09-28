package HomeWork12Exceptions;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data (without spaces, less than 20 symbols):\n");

        System.out.println("Enter login: ");
        String login = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("Confirm password");
        String confirmPassword = scanner.nextLine();

        System.out.println("Valid data: "+ValidData.checkValid(login,password,confirmPassword));
        scanner.close();
    }
}
