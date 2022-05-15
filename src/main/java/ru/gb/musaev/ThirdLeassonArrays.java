package ru.gb.musaev;

import java.util.Arrays;


    public class ThirdLeassonArrays {
        public static void main (String[] args) {
            teskFirstArray();
                teskSecond100();
                    mR();
                        wTbC();
                            tskLenInitialValue(7, 5);
                        teskMaxMin();
                    cB(new int[]   {2, 2, 2, 2, 2, 2});
                System.out.println( cB(new int[]   {2, 2, 2, 2, 2, 2}));
            shiftArray(new int[]   {1,2,3,4,5,6}, 2);

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

                        }
                            System.out.println(Arrays.toString(x));
                          return x;

            }
            public static void teskMaxMin() {
                    int[] f =  {4, 10, 6, 70, 20};
                         int max = f[0];
                         int min = f[0];
                             for (int i = 0; i < f.length; i++){
                                 if(f[i] > max){
                                     max = f[i];
                                 } if(f[i] < min){
                                     min = f[i];
                                 }

                             }
                             System.out.println( "min = " + min);
                             System.out.println("max = " + max);

            }

            public static boolean cB(int[] d){
                    int sum1 = 0;
                        for(int i = 0; i < d.length; i++) {
                            sum1 += d[i];
                        }
                            int sum2 = 0;
                                for (int j = 0; j < d.length; j++) {
                                 sum2 += d[j];

                            if (sum2 == sum1 / 2) {
                                return true;
                            }
                        }
                    return false;
            }

            public static int[] shiftArray(int[] w, int n) {
                    n %= w.length;
                        if (n > 0){
                            for (int i = w.length - 1; i >= n; i--){
                                int g = w[i];
                                w[i] = w[i - n];
                                w[i - n] = g;
                            }
                        }
                        System.out.println(Arrays.toString(w));
                    return w;
            }












    }
