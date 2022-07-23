package basic;

public class ArrayExample {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6};
        int b[] = new int[4];
        b[1] = 6;
//        System.out.println(b[1]);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


        int a[][] = new int[2][3];
        a[0][0] = 0;
        a[0][1] = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
//                c[0][0]= a[0][0]+b[0][0];
            }
            System.out.println();
        }

        System.out.println(a);

        int a2[][] = new int[3][];
        a2[0] = new int[2];
        a2[1] = new int[3];
        a2[2] = new int[4];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();

        }
    }
}