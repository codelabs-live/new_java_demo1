package basic;
//
//public class Demo {
//  public void display(){
//
//    }
//    public static void main(String[] args) {
////        Basic basic = new Basic();
//
//    }
//}

//
//public  class Demo {
//  public static void main(String[] args) {
//    int a = 0 ;
//    int b= 1;
//    if(a==0){
//
//      if(b==1){
//        System.out.println(b);
//      }else if(b==2){
//        System.out.println(b);
//      }else {
//        System.out.println("Error");
//      }
//      System.out.println(a);
//    }else if(a==1){
//      System.out.println(a);
//    }else if(a==2){
//      System.out.println(a);
//    }else if(a==3){
//      System.out.println(a);
//    }else {
//      System.out.println("Error");
//    }
//  }
//}

//
//public class Demo {
//
//  void display(){
//    System.out.println("Name");
//    System.out.println("50");
//  }
//
//  String name(){
//
//    return "Kamlesh";
//  }
//  int sum(){
//
//    return 8;
//  }
//
//  public static void main(String[] args) {
//   Demo demo = new Demo();
//   demo.display();
//   demo.name();
//    System.out.println(demo.name());
//    String n= demo.name();
//    System.out.println(n);
//    System.out.println(demo.sum());
//  }
//
//
//
//
//}

//
//import java.util.Scanner;
//
//public class Demo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int c, res= 0,a,b;
//        char y='n';
//        do {
//            System.out.println("Welcome");
//            System.out.println("Enter 1st Number");
//            a = scanner.nextInt();
//            System.out.println("Enter 2nd Number");
//            b = scanner.nextInt();
//            System.out.println("Menu");
//            System.out.println("1. Sum");
//            System.out.println("Choose any one ");
//            c = scanner.nextInt();
//            switch (c) {
//                case 1:
//                    System.out.println(a + b);
//                    break;
//            }
//
//            System.out.println("Do you want-------------");
//            y = scanner.next().charAt(0);
//
//        }while (y=='y');
//    }
//}
//
//abstract class Example{
//    void display(){
//        System.out.println("Example");
//    }
//    abstract void  sum();
//}
//
//
//public class Demo extends Example {
//
//    public static void main(String[] args) {
//       Demo demo = new Demo();
//       demo.sum();
//
//
//    }
//
//    @Override
//    void display() {
//        super.display();
//    }
//
//    @Override
//    void sum() {
//        System.out.println("Sum");
//    }
//}
//
//
//class  Employee{
//    String id;
//    String name ;
//    String position;
//
//    void display(){
//        System.out.println("Example");
//    }
//}
//
//
//
//
//public class Demo extends Employee implements display,display1 {
//    @Override
//    void display() {
//        name = "Demo";
//        id ="1";
//        position = "Developer";
//
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(position);
//        super.display();
//    }
//
//    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.display();
//    }
//
//    @Override
//    public void sum() {
//
//    }
//
//    @Override
//    public void demo() {
//
//    }
//}
//
//class HR extends Employee{
//    @Override
//    void display() {
//
//        super.display();
//    }
//
//
//}
//
//
//
//interface display{
////    String name="Name";
//    void sum();
//    void demo();
//}
//interface display1{
////    String name="Name";
//    void sum();
//    void demo();
//}
//
//
//public class Demo {
//    public static void main(String[] args) {
//        for (int i =0;i<5;i++){
//            System.out.print(i);
//            for (int j =0;j<=i;j++){
//                System.out.print(j);
//                for (int k =0;k<=j;k++){
//                    System.out.print(k);
//                    System.out.print("* ");
//                }
//            }
//
//            System.out.println();
//        }
//    }
//}

//
//import java.sql.ResultSet;
//
//public class Demo {
//    public static void main(String[] args) {
//        Users users =new Users("XYZ","email@yopmail.com","askldfj",78);
//        System.out.println(users.getAge());
//        users.setAge(56);
//
//
//
////        resultSet.next();
//        System.out.println(users.getAge());
//
//        String name = "Demo";
////        name  =
//        if (name == "Demo"){
//            System.out.println("Error");
//
//        }
//    }
//}
//
//import java.util.Scanner;
//
//public  class Demo {
//    public static void main(String[] args) {
//        String v ;
//        Scanner sc = new Scanner(System.in);
//        v  = sc.nextLine();
//        System.out.println(v);
//
//
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

//public class Demo {
//    public static void main(String[] args) {
//        System.out.println("Demo");
//        System.out.println("Demo");
//        Scanner scanner = new Scanner(System.in);
//        char c = 'v';
//        String name = "Demo    ";
//        System.out.println(name.length());
//        System.out.println(name.indexOf('e'));
//        System.out.println(name.charAt(3));
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.hashCode());
//        System.out.println(name.concat("Demo"));
//        System.out.println(name + "sjkfbdvj");
//        System.out.println(name.isEmpty());
//        System.out.println(name.trim().length());
//
//        int a = 0;
//        System.out.println(a * a);
//        boolean isTrue = true;
//        float f = 5f;
//        double d = 9.9;
//        int sum =0;
//        for(int i =0;i<=10;i++){
//           sum = i;
//           sum = 0;
//           sum =0+1;
//           sum = 1;
//           sum+i;
//           sum =sum+i;
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//
//
//int j  = 0 ;
//        for (int i = 1 ;i<=10;i++){
//            for ( j =10;j>=i;j--){
//                System.out.println();
//            }
//            for(j=1;j<i;j++){
//                System.out.print("*");
//            }
//        }


//        for (int i = 0;i<=3;i++ ){
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i<=10){
//            System.out.println(i);
//       i  = i/2;
//        }

//
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=10);
//
//
//
//
//    }
//
//
//
//}
//
//


public  class Demo {
    public static void main(String[] args) {
//int sum =0;
//        for (int i = 0;i<=10;i++){
//
//            for(int j =0;j<=i;j++){
//                System.out.println(i+" "+j);
//            }
//
//        }

//        int i =0;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }
//
//        do{
//            System.out.println(i);
//
//
//
//            i++;
//        }while (i<=10);
//
//

        int k;
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        k = scanner.nextInt();

        int  a[] = {1,2,3,4,5,6};
        int b[] = new int[k];
        System.out.println("Enter the elements of array");
//        System.out.println(b[0]);
        for (int i =0 ;i<b.length;i++){
           b[i] = scanner.nextInt();
        }
        System.out.println("Result");
        for (int i =0 ;i<b.length;i++){
            System.out.println( b[i]);
        }
        System.out.println();
    }
}