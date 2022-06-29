//public class NewClass {
//    public static void main(String[] args) {
//        System.out.println("Demo");
//        System.out.print("Demo");
//        char c ='v';
//        System.out.println(c);
//        String name ="Demo";
//        System.out.println(name.concat("Demo").concat("Demo").concat("Demo").length());
//        int a = 8;
//        int b = 7;
//        double d = 7.8;
//        float f = 7f;
//        boolean isTrue = true;
//         var name1 = "Demo";
//
//
//        System.out.println(name+name1);
//        System.out.println(a+b);
////         name1 = 45;
//    }
//}


//public  class NewClass {
//    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5,6};
//        int b[] = new int[4];
//        b[1]=6;
////        System.out.println(b[1]);
//
//        for (int i = 0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }

//
//        int a[][] = new int[2][3];
//        a[0][0]=0;
//        a[0][1]=1;
//        for (int i = 0;i<2;i++){
//            for (int j =0;j<3;j++){
//                System.out.print(a[i][j]+" ");
////                c[0][0]= a[0][0]+b[0][0];
//            }
//            System.out.println();
//        }
//
//        System.out.println(a);

//        int a[][] = new int[3][];
//        a[0]=new int[2];
//        a[1]= new int[3];
//        a[2]= new int[4];
//        for (int i = 0; i < a.length; i++) {
//            for (int j =0;j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//
//        }


//        int a = 3;
//        int b = 6;
//        if(a==3){
//
//            if(b==6){
//                if(){
//                    if(){
//
//                    }else {
//
//                    }
//                }else {
//
//                }
//            }else  if(){
//
//            }
//
//
//            System.out.println(a);
//        }else  if(a==5) {
//            System.out.println("Error");
//        }else {
//
//        }

//    }
//}

//
//public  class NewClass {
//
//    void display(){
//        System.out.println("Demo");
//    }
//
//    String name(){
//
//        return  "Demo";
//    }
//
//    public static void main(String[] args) {
//        NewClass obj = new NewClass();
//        obj.display();
//     String name =  obj.name();
//        System.out.println(name);
//        System.out.println(obj.name());
//    }
//}
//
//public class NewClass {
//
//    void display(){
//        System.out.println("Demo");
//    }
//
//    String name(){
//
//        System.out.println("Example");
//        return "Demo";
//
//    }
//
//    int sum(){
//        int a =9;
//        int b = 9;
//        return a+b;
//    }
//
//
//    public static void main(String[] args) {
////        int a[][]= new int[3][];
////        a[0]= new int[2];
////        a[1]=new int[3];
////        a[2] = new int[4];
////        for (int i =0;i<a.length;i++){
////            for (int j =0;j<a[i].length;j++){
////                System.out.print(a[i][j]+" ");
////            }
////            System.out.println();
////        }
//
//        NewClass obj = new NewClass();
//        obj.display();
//        obj.name();
//        String name = obj.name();
//        System.out.println(name);
//        System.out.println(obj.name());
//    }
//
//}


//public class NewClass {
//    String name;
//    NewClass(String name , int a){
//        this.name=name;
//    }
//
//    void display(){
////        int ab = 90;
////        System.out.println(ab);
//        System.out.println(name);
//    }
//
//
//    public static void main(String[] args) {
//        NewClass obj = new NewClass("XYZ",45);
//        obj.display();
//    }
//}

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Demo");
        System.out.println("Demo");

        char a = 'r';
        System.out.println(a);
        String name = "Kamlesh";
        System.out.println(name);
        int b = 67;
        System.out.println(b);
        double d = 6.7;
        System.out.println(d);
        float f = 5f;
        System.out.println(f);
        boolean isTrue = true;
        System.out.println(isTrue);
        var name1 = "Kamlesh";
        System.out.println(name1);
//        name1 = 34;    Error
        System.out.println(name.concat(name1).concat("Demo").toUpperCase());
        System.out.println(b + b);
        System.out.println(name + name);

        System.out.println("Enter your name ");
        name = scanner.next();
        System.out.println(name);



    }
}






