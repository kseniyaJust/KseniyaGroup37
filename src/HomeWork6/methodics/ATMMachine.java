package HomeWork6.methodics;

import java.util.Arrays;

//Задача *:
//Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
//задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
public class ATMMachine {
    int[] bills;
    int[] countBils;


    int totalSum;

    //Создать конструктор с тремя параметрами - количеством купюр каждого номинала
    ATMMachine(int count20, int count50, int count100){
        bills = new int[3];
        bills[0] = 20;
        bills[1] = 50;
        bills[2] = 100;

        countBils = new int[3];
        countBils[0] = count20;
        countBils[1] = count50;
        countBils[2] = count100;

        totalSum = 0;
        for(int i =0;i<countBils.length;i++){
            totalSum+= countBils[i]*bills[i];
        }

    }
     //Сделать метод для добавления денег в банкомат.
    public void addBill(int money,int type){
        System.out.println(" Bills " + countBils.toString());
        switch (type){
            case 20->countBils[0]+=money;
            case 50->countBils[1]+=money;
            case 100-> countBils[2]+=money;
        }
        System.out.println(" Bills " + countBils.toString());

    }

    // Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения
    //операции. При снятии денег, функция должна распечатывать каким количеством купюр
    //какого номинала выдаётся сумма.
    public boolean withDrawBill(int money){
        if(totalSum <money){
            System.out.println("ATM machine don't have enough money");
            return false;
        }
        int[] resultMoney = {0,0,0};
        int indexMoney=bills.length-1;
        while (money>=bills[0]){
            if(money>=bills[indexMoney] && countBils[indexMoney]!=0){
                money-=bills[indexMoney];
                resultMoney[indexMoney]++;
            }
            else if(indexMoney!=0){
                indexMoney--;
            }
        }
        if(money>0)
            return false;
        else{
            System.out.print("Result: ");
            for(int i =0;i<countBils.length;i++){
                if(resultMoney[i] !=0)
                    System.out.print(" count" + bills[i] + " " + resultMoney[i]+ "\t");
                countBils[i]-=resultMoney[i];
            }
            System.out.println();
            return true;
        }



    }

}
