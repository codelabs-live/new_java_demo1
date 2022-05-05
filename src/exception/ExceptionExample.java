package exception;

public class ExceptionExample {
    public static void main(String[] args) {

//        int a[] = {1,2,3,4,5,6};

        try {
//            System.out.println(a[6]);
            System.out.println(3/0);
        }catch (Exception e){
//            System.out.println(a[5]);
            System.out.println(e);
        }

    }
}
