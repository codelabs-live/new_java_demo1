package basic;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a;
//        System.out.println(a);
//        a = 'f';
//        System.out.println("Enter the value of a ");
//        a = scanner.next().charAt(0);
//        System.out.println(a);

        String name = "Demo";
        System.out.println(name);
        System.out.println("Enter your name");
        name = scanner.next();
        System.out.println(name);
        int b = 34;
        System.out.println("Enter the value of b ");
        b = scanner.nextInt();
        double d = 6.7;
        System.out.println("Enter the value of d");
        d = scanner.nextDouble();

        float f = 5f;
        System.out.println("Enter the value of f");
        f = scanner.nextFloat();
        boolean isTrue = true;
        System.out.println(" Enter the value of isTrue");
        isTrue = scanner.nextBoolean();
        System.out.println(b*b);

    }
}
