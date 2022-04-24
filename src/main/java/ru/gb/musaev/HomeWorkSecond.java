    package ru.gb.musaev;

    public class HomeWorkSecond {
        public static void main(String[] args) {
            myFirstMethod(6,9);
            secondTesk(-5);
            thirdMethodTesk(5);
            myFourthHomeWork();
            methodFifthTesk (2022);
        }

        public static int myFirstMethod(int a, int a) {
            int c = a + b;
            boolean i = (c >= 10 && c <= 20);
            System.out.println(i);
            return c;
        }

        public static void secondTesk(int a) {
            if (a <= 0) {
                System.out.println("Отрицательное");
            } else {
                System.out.println("Положительное");
            }
        }

        public static int thirdMethodTesk(int a) {
            boolean i = (a <= 0);
            System.out.println(i);
            return a;
        }
        public static void myFourthHomeWork() {

            for (int i = 0; i < 6; i++) System.out.println("GeekBrains");
        }
        public static void methodFifthTesk (int year){
            if (year % 4 ==0 || year % 100 == 0 && year % 400 == 0) {
                System.out.println( "високосный");
            }  else {
                System.out.println(" не високосный");
            }



        }




        }










