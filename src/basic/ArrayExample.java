//package basic;
//
//import java.util.Scanner;
//
//public class ArrayExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int a1[] = {1, 2, 3, 4, 5, 6};
//        System.out.println(a1[0]);
//        for (int i = 0;i<a1.length;i++){
//            System.out.println(a1[i]);
//        }
//        int b[] = new int[4];
//        b[1] = 6;
//
////        System.out.println(b[1]);
////        System.out.println("Enter the elements of array");
////        for (int i = 0; i < b.length; i++) {
////            b[i] = scanner.nextInt();
////        }
////        System.out.println("Result");
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
//
//
//        int a[][] = new int[2][3];
//        a[0][0] = 0;
//        a[0][1] = 1;
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j] + " ");
////                c[0][0]= a[0][0]+b[0][0];    addition of 2 array
//            }
//            System.out.println();
//        }
//
//
//        int a2[][] = new int[3][];
//        a2[0] = new int[2];
//        a2[1] = new int[3];
//        a2[2] = new int[4];
//        for (int i = 0; i < a2.length; i++) {
//            for (int j = 0; j < a2[i].length; j++) {
//                System.out.print(a2[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//    }
//}


import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        System.out.println("Enter the element of 1st array");
        for (int i =0;i <a.length;i++){
            for (int j =0;j<a.length;j++){
                a[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Enter the element of 2st array");
        for (int i =0;i<b.length;i++){
            for (int j =0;j<b.length;j++){
                b[i][j]= scanner.nextInt();
            }
        }

        System.out.println("Addition of array");
        for (int i =0;i<c.length;i++){
            for (int j =0;j<c.length;j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }

        for (int i =0;i<c.length;i++){
            for (int j =0;j<c.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}