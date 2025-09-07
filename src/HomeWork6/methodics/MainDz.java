package HomeWork6.methodics;

import java.util.Scanner;

public class MainDz {
    //Задача 1:

    public static void main(String[] args) {
        // Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        CreditCard smallCreditCard = new CreditCard("ERFKFK100",100);
        CreditCard middleCreditCard = new CreditCard("GHKDL3SS4", 150);
        CreditCard bigCreditCard = new CreditCard("LWIYM8LE0",200);

        smallCreditCard.getAllInfo();
        middleCreditCard.getAllInfo();
        bigCreditCard.getAllInfo();
        System.out.println("-------------------------DEFAULT ACCOUNTS");

        //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
        smallCreditCard.addMoney(30);
        middleCreditCard.addMoney(50);

        bigCreditCard.withdrawMoney(100);

        // Выведите на экран текущее состояние всех трех карточек.
        smallCreditCard.getAllInfo();
        middleCreditCard.getAllInfo();
        bigCreditCard.getAllInfo();
        System.out.println("-------------------------CHANGED ACCOUNTS\n");

        //Со звездочкой банкомат
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money for withdraw: ");
        int money = scanner.nextInt();
        if(money%10 ==0){
            ATMMachine atmMachine = new ATMMachine(10,10,10);
            System.out.println("Operation to withdraw " +money +": "+ atmMachine.withDrawBill(money));
        }
        scanner.close();

    }


}
//Создать класс CreditCard c полями номер счета, текущая сумма на счету.
class  CreditCard{
    private final String numberAccount;
    private int currentSum;

    CreditCard(String numberAccount, int currentSum){
        this.numberAccount = numberAccount;
        this.currentSum = currentSum;
    }

    // Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    public void addMoney(int money){
        currentSum+=money;
    }

    // Добавьте метод,который позволяет снимать с карточки некоторую сумму.
    public void withdrawMoney(int money){
        if(currentSum>=money)
            currentSum-=money;
        else
            System.out.println("Too big sum");
    }

    // Добавьте метод, который выводит текущую информацию о карточке.
    public void getAllInfo(){
        System.out.println("Your number account: "+ numberAccount
                +"\nMoney on your account: "+ currentSum + "\n");
    }
}