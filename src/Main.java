//import auth.Login;
//import auth.Register;
//
//import java.util.Objects;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Register register = new Register();
//        Login login = new Login();
//        System.out.println("----------------------------");
//        System.out.println("---------Auth System--------");
//        System.out.println("----------------------------");
//
//        int c, ch;
//        String email, pass;
//
//        do {
//            System.out.println("---Menu---");
//            System.out.println("1. Login");
//            System.out.println("2. Register");
//            System.out.println("3. Exit");
//            System.out.println("Choose anything you want");
//            c = scanner.nextInt();
//            switch (c) {
//                case 1 -> {
//                    login.getData();
//                    login.checkAuth();
//                }
//                case 2 -> register.getData();
//                case 3 -> System.exit(0);
//                default -> System.out.println("Error");
//            }
//            System.out.println("0/1");
//            ch = scanner.nextInt();
//        } while (ch == 0);
//
//    }
//}

//abstract  class Base {
//    String name = "Kamlesh";
//
//    void display() {
//        System.out.println(name);
//    }
//    abstract  void display1();
//}
//
//
//class Example extends Base {
//    @Override
//    void display() {
//        super.display();
//        System.out.println("Example");
//    }
//
//    @Override
//    void display1() {
//
//    }
//}
//
//public class Main extends Base {
//    @Override
//    void display() {
//        super.display();
//        System.out.println("Main");
//    }
//
//    @Override
//    void display1() {
//
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.display();
//        Example example = new Example();
//        example.display();
//    }
//}

interface  Display{
    String name = "Kamlesh";
    void sum();

}

interface Base{
    void add();

}

public class Main implements  Display, Base {
    public static void main(String[] args) {
        Main main = new Main();
        main.sum();
    }

    @Override
    public void sum() {
//        name = "Demo";    Error
        System.out.println(name);
    }

    @Override
    public void add() {

    }
}