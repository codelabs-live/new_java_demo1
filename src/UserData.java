

class Cal {
    int a, b;
    Cal(int a, int b) {
    this.a=a;
    this.b = b;
    }


    int sum(){
        return a+b;
    }
}


public class UserData {
    String name;

    UserData() {
        System.out.println("Demo");
    }

    void display() {
//        String name ;

    }

    public static void main(String[] args) {
//        UserData userData = new UserData();
//        new UserData();
        int a =4;
        int b = 5;
        Cal cl = new Cal(a,b);
        int res =0;
        res = cl.sum();


    }
}