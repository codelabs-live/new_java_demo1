package exception;

public class ExceptionExample {
    public static void main(String[] args) {

//        int a[] = {1,2,3,4,5,6};
int a = Integer.parseInt("1s");
        try {
//            System.out.println(a[6]);
//            System.out.println(3/0);
            System.out.println(a);
        }catch (Exception e){
//            System.out.println(a[5]);
//            System.out.println(e);
        }

    }
}
