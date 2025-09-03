package HomeWork6.methodics;

import java.util.Arrays;

//Задача *:
//Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
//задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
public class ATMMachine {
    private  int[] bills;
    private int[] countBills;

    //Создать конструктор с тремя параметрами - количеством купюр каждого номинала
    ATMMachine(){
        bills = new int[3];
        bills[0] = 20;
        bills[1] = 50;
        bills[2] = 100;

        countBills = new int[bills.length];
//        for(int i =0;i<countBills.length;i++){
//            countBills[i] = (int) (bills[i] + bills[i]*(-0.5));
//        }

    }
     //Сделать метод для добавления денег в банкомат.
    public void addBill(int money,int type){
        switch (type){
            case 20 -> bills[0] +=money;
            case 50-> bills[1] +=money;
            case 100-> bills[2] +=money;
        }
    }
    // Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения
    //операции. При снятии денег, функция должна распечатывать каким количеством купюр
    //какого номинала выдаётся сумма.
    public boolean withDrawBill(int money){
        int indexToChange =bills.length-1;
        int change =0;
        while(money!=0){
            indexToChange -= change;
//              if(money>=bills[indexToChange] && money-bills[indexToChange] >= bills[indexToChange]){
//                    money-=bills[indexToChange];
//                    countBills[indexToChange]++;
//                    change =0;
//                    System.out.println(money + " " + indexToChange);
//                }
//                else if(indexToChange!=0){
//                    change =1;
//                }


        }
        System.out.println(Arrays.toString(countBills));
        return true;
    }

}
