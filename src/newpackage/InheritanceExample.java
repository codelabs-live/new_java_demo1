
//
//class Example{
//    void sum(){
//        System.out.println(90);
//    }
//}
//
//class Base extends  Example{
//    void display(){
//        System.out.println("Base");
//    }
//
//    @Override
//    void sum() {
//        System.out.println(80);
//        super.sum();
//    }
//}
//
//public class InheritanceExample extends Base {
//
//    @Override
//    void sum() {
//        System.out.println(70);
//        super.sum();
//    }
//
//    @Override
//    void display() {
//        super.display();
//        System.out.println("Example");
//    }
//
//
//    public static void main(String[] args) {
//        InheritanceExample obj = new InheritanceExample();
//        obj.display();
//        obj.sum();
//    }
//}


//
//
//class Example{
//    void display(){
//        System.out.println("Example");
//    }
//}
//
//
//
//class Base extends Example{
//    @Override
//    void display() {
//        System.out.println("Base");
//        super.display();
//    }
//}
//
//
//
//
//public class InheritanceExample  extends  Example{
//    @Override
//    void display() {
//        System.out.println("Main");
//        super.display();
//    }
//
//    public static void main(String[] args) {
//        InheritanceExample obj = new InheritanceExample();
//        Base obj1= new Base();
//        obj.display();
//        obj1.display();
//    }
//}
//
//package newpackage;
//
//interface  book{
//    String name = "Book";
//    void onClick();
//}
//
//interface  car{
//    String name= "Car";
//    void onSelect();
//}
//
//public class InheritanceExample implements book,car {
//    @Override
//    public void onClick() {
//        System.out.println("OnClick");
//    }
//
//    @Override
//    public void onSelect() {
//        System.out.println("OnSelect");
//    }
//
//    public static void main(String[] args) {
//InheritanceExample obj = new InheritanceExample();
//obj.onSelect();
//obj.onClick();
//    }
//}

//package newpackage;
//
//public class InheritanceExample extends Thread {
//    @Override
//    public void run() {
//        for (int i =0; i<=10;i++){
//            try {
//                sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        }
//        super.run();
//    }
//
//    public static void main(String[] args) {
//        InheritanceExample obj = new InheritanceExample();
//        InheritanceExample obj1 = new InheritanceExample();
//        obj.start();
//        obj1.start();
//    }
//}


package newpackage;

import static java.lang.Thread.sleep;

public class InheritanceExample implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i <= 10; i++) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        InheritanceExample obj = new InheritanceExample();
        Thread thread = new Thread(obj);
        Thread thread1 = new Thread(obj);
        thread.start();
        thread1.start();
    }
}