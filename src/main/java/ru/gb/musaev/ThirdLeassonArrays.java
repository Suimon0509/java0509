package ru.gb.musaev;

import java.util.Arrays;


    public class ThirdLeassonArrays {
        public static void main (String[] args) {
            teskFirstArray();
            teskSecond100();
            mR();
            wTbC();
            tskLenInitialValue(5, 5);
            teskMaxMin();

        }
            public static void teskFirstArray() {

                    int[] a = {1, 1, 0, 0, 1, 0, 1 };
                        for (int i = 0; i < a.length; i++) {
                            if (a[i] == 0){
                                a[i] = 1;
                            }else {
                                a[i] = 0;
                            }
                            System.out.println(a[i]);
                        }

            }
            public static void teskSecond100(){
                    int[] b = new int[100];
                        for (int i = 0; i < b.length; i++){
                            b[i] = 0+i+1;

                        }

                        System.out.println(Arrays.toString(b));
            }
            public static void mR(){
                    int [] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                        for (int i = 0; i < c.length; i++ ){
                           if (c[i] < 6){
                               c[i] = c[i] * 2;
                           }
                        }
                        System.out.println(Arrays.toString(c));
            }

            public static void wTbC(){
                    int[][] r = new int[4][4];
                        for (int i = 0; i < r.length; i++) {
                            for (int j = 0; j < r.length; j++) {
                                if (i == j){
                                    r[i][j] = 1;
                                }
                                System.out.print(r[i][j] + "  ");
                            }
                            System.out.println();
                        }

            }

            public static int[] tskLenInitialValue(int len , int initialValue){

                     int x[] = new int[len];
                        for (int i = 0; i < x.length; i++){
                            x[i] = initialValue;
                            System.out.println(x[i] + "  ");
                        }
                            System.out.println();
                        return x;

            }
            public static void teskMaxMin() {


            }





    }
