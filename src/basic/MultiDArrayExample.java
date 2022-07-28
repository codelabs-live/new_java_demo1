package basic;

import java.util.Scanner;

public class MultiDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        System.out.println("Enter elements for 1st array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Enter elements for 2nd array:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Result");
        System.out.println("A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < c.length; k++) {

//                    1 2       1 2
//                    3 4       3 4

//1*1+2*3 =
//        1*4+2*5
//                2*3+3*4
//                        2*4+3*5

//                    System.out.println(i+" "+j+" "+k);
                    c[i][j] = c[i][j]+  a[i][k] * b[k][j];
//                c[0][0]  =    1*1=1;
//                c[0][0] = 2*3= 6;

                }
            }
        }


        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {


//                    1 2       3 4
//                    2 3       6 5

//1*3+2*4
//        1*4+2*5
//                2*3+3*4
//                        2*4+3*5

//                    System.out.println(i+" "+j+" "+k);
//                    c[i][j]= a[i][k]*b[i][j] + a[i][j]*b[i][j];
                    System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
    }
}
