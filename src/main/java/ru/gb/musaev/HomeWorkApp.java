package ru.gb.musaev;

public class HomeWorkApp  {
     public static void main (String[] args){
         printThreeWords();
         checkSumSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
     }


    public static void checkSumSign() {
     int a=8, b=6;
     int c=a+b;
     if (c>=20){
         System.out.println("Сумма положительная");
     } else {
         System.out.println("Сумма отрицательная");
     }
    }

}

